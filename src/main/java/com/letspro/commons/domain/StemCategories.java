package com.letspro.commons.domain;


public class StemCategories {
	
	private boolean s;
	
	private boolean t;
	
	private boolean e;
	
	private boolean m;

	public boolean getS() {
		return s;
	}

	public void setS(boolean s) {
		this.s = s;
	}

	public boolean getT() {
		return t;
	}

	public void setT(boolean t) {
		this.t = t;
	}

	public boolean getE() {
		return e;
	}

	public void setE(boolean e) {
		this.e = e;
	}

	public boolean getM() {
		return m;
	}

	public void setM(boolean m) {
		this.m = m;
	}
	
	/*private final int sBitMask = 0x0008;
    private final int tBitMask = 0x0004;
    private final int eBitMask = 0x0002;
    private final int mBitMask = 0x0001;
    
	private List<String> categories;
	
	public StemCategories() {
		this.categories = new ArrayList<String>();
	}
	
	public StemCategories(Integer stemValue) {
		this.categories = new ArrayList<String>();
		
		if (stemValue != null) {
			if ((stemValue & sBitMask) > 0) {
				categories.add("S");
			}
			if ((stemValue & tBitMask) > 0) {
				categories.add("T");
			}
			if ((stemValue & eBitMask) > 0) {
				categories.add("E");
			}
			if ((stemValue & mBitMask) > 0) {
				categories.add("M");
			}
		}
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	
	public Integer toStemValue() {
		int result = 0;
		for (String character : categories) {
			if (character.equals("S")) {
				result = result | sBitMask;
			} else if (character.equals("T")) {
				result = result | tBitMask;
			} else if (character.equals("E")) {
				result = result | eBitMask;
			} else if (character.equals("M")) {
				result = result | mBitMask;
			}
		}
		return result;
	}*/
}
