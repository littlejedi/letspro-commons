package com.letspro.commons.domain.schools;

import java.util.List;

import com.letspro.commons.domain.EducationLevel;

/**
 * Class that represents a list of schools with a given type
 * @author littlejedi
 *
 */
public class SchoolList {
	
	private EducationLevel level;
	
	private List<CountryRegion> countries;

	public EducationLevel getLevel() {
		return level;
	}

	public void setLevel(EducationLevel level) {
		this.level = level;
	}

	public List<CountryRegion> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryRegion> countries) {
		this.countries = countries;
	}
}
