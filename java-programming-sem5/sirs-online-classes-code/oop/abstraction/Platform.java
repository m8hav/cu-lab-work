package com.chitkara.btech.oop.abstraction;

public class Platform extends Linkedin{
	
	public Platform(String name) {
		super(name);
		System.out.println("Social Media Platforms");
	}	
	
	public String getPlatformName() {
		String name = getName();
		return name;
	}
	

	@Override
	public void getLinkedinDetails() {
		System.out.println("getLinkedinDetails()");
	}
	
	
}
