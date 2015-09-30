package com.letspro.commons.api.filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;

public class PerformanceLoggingFilter extends ClientFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceLoggingFilter.class);

	//http://www.regexr.com/
	//http://www.freeformatter.com/java-dotnet-escape.html#ad-output
	private static final String PROJECT_VIEW_URL_REGEX = "http:\\/\\/localhost:8080(\\/projects\\/[0-9]*\\/view)";
	
	private static final Pattern PROJECT_VIEW_URL_PATTERN = Pattern.compile(PROJECT_VIEW_URL_REGEX);
	
	@Override
	public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
		long before = System.currentTimeMillis();	
		// Call the next client handler in the filter chain
		if (getNext() != null) {
			ClientResponse resp = getNext().handle(cr);
			long after = System.currentTimeMillis();
			long timeElapsed = after - before;
			// Filter out GET project view because it is too noisy
			// TODO: Make this generic
			final String method = cr.getMethod();
			final String uri = cr.getURI().toString();
			Matcher m = PROJECT_VIEW_URL_PATTERN.matcher(uri);
			if (!m.matches()) {
				LOGGER.info("{} {} took {} ms", method, uri, timeElapsed);
			}
			return resp;
		} else {
			throw new ClientHandlerException("Next client handler is null");
		}
	}

}
