package org.dice_research.sask.webclient;

import java.io.Serializable;

public class Hello implements Serializable {

	private static final long serialVersionUID = 1L;

	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	@Override
	public String toString() {
		return hello;
	}
}
