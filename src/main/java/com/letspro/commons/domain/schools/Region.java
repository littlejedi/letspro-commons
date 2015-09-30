package com.letspro.commons.domain.schools;

import java.util.List;

import com.letspro.commons.domain.mongodb.School;

public class Region {
	
	/**
	 * Id that represents this region
	 */
	private Integer id;

	private String name;
	
	private RegionType type;
	
	private List<Region> subregions;
	
	private List<School> schools;
	
	public Region() {
		//
	}
	
	public Region(Integer id, String name, RegionType type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public Region(Integer id, String name, RegionType type, List<School> schools) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.schools = schools;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public RegionType getType() {
		return type;
	}

	public void setType(RegionType type) {
		this.type = type;
	}
	
	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public List<Region> getSubregions() {
		return subregions;
	}

	public void setSubregions(List<Region> subregions) {
		this.subregions = subregions;
	
	}
}
