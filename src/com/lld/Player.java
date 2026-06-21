package com.lld;

public class Player {

	private String name; //question should we mark name as final?
	private int position;
	
	Player(String name){
		this.name=name;
		this.setPosition(0);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	
}
