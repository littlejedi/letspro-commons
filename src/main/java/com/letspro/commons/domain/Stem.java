package com.letspro.commons.domain;

public enum Stem {
	
	S(1),
	T(2),
	E(3),
	M(4);
	
	private int value;
	
	Stem(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
	
	public static Stem fromInteger(int value){
		if (value == 1) {
			return S;
		} else if (value == 2) {
			return T;
		} else if (value == 3) {
			return E;
		} else if (value == 4) {
			return M;
		}
		throw new IllegalArgumentException("Cannot convert value: " + value + " passed to Stem");
	}
}
