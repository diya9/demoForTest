package com.simple;

public class Message {
	
	private String message;
	
	Message(String message){
		this.message = message;
	}
	
	public String showMessage(){
		System.out.println(message);
		return message;
	}
}
