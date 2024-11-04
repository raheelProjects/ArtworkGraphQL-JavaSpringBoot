package com.learnGraphQL.ArtworkGraphQL.ArtWork;

public class ArtWork {
	
	private int id;
	private String name;
	private String createdYear;
	private int owner;

	

	public ArtWork( String name, String createdYear, int owner) {
		this.name = name;
		this.createdYear = createdYear;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedYear() {
		return createdYear;
	}

	public void setCreatedYear(String createdYear) {
		this.createdYear = createdYear;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

}
