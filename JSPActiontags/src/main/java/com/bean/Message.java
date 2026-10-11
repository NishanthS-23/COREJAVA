package com.bean;

public class Message 
{
	private String s;
	public Message() {
		
	}
	public String getMessage ()
	{
		return "JSP Bean";
		  
	}
	public String getS() {
		return s.toUpperCase();
	}
	public void setS(String s) {
		this.s = s;
	}

}
