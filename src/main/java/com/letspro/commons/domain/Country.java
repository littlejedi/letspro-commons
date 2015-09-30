package com.letspro.commons.domain;


public enum Country {
	
	CHINA("CN","中国"),
	UNITED_STATES("US","美国");
	
	private String isoCode;
	
	private String name;
	
	Country(String code, String name)
	{
		this.isoCode = code;
		this.name = name;
	}
		
	public String getIsoCode()
	{
		return this.isoCode;
	}
	
	public String getName()
	{
		return this.name;
	}
}
