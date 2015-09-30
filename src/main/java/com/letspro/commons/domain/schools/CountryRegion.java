package com.letspro.commons.domain.schools;

import java.util.List;

import com.letspro.commons.domain.Country;

public class CountryRegion {
	
	/**
	 * Iso Code
	 */
	private String id;
	
	private String name;
	
	private List<Region> subregions;
	
	public CountryRegion() {
		//
	}
	
	public CountryRegion(Country country) {
		this.id = country.getIsoCode();
		this.name = country.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Region> getSubregions() {
		return subregions;
	}

	public void setSubregions(List<Region> subregions) {
		this.subregions = subregions;
	}
}
