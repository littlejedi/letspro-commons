package com.letspro.commons.domain;

public enum EducationLevel {
	
	ELEMENTARY_SCHOOL(1),
	MIDDLE_SCHOOL(2),
	HIGH_SCHOOL(3),
	UNIVERSITY(4);
	
	private int value;
	
	EducationLevel(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
