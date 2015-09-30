package com.letspro.commons.api;

public enum CoreApiPath {

	FIND_BY("findBy"),

	/**
	 * Schools
	 */
	SCHOOLS("schools"),
	/**
	 * Projects
	 */
	PROJECTS("projects"),
	/**
	 * FindBy query params
	 */
	SHOW_FULL_ENTITY("fullEntity"),
	PAGE_SIZE("pageSize"),
	/**
	 * Admin suffix
	 */
	ADMIN("admin"),
	/*
	 * Common
	 */
	SEARCH("search");
	
    private String path;
	
	CoreApiPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return this.path;
	}
}
