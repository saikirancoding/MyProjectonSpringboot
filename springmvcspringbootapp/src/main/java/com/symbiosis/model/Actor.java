package com.symbiosis.model;

public class Actor {

	private int aid;
	private String name;
	
	public Actor() {
		super();
	}
	
	
	public Actor(int aid, String name) {
		super();
		this.aid = aid;
		this.name = name;
	}


	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", name=" + name + "]";
	}
	
	
}
