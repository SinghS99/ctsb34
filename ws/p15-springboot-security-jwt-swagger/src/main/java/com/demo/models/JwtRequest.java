package com.demo.models;

import java.io.Serializable;

public class JwtRequest implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	private String username;
	private String password;

//JSON Parsing needs default constructor
	public JwtRequest() {
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "{" + " username='" + getUsername() + "'" + ", password='" + getPassword() + "'" + "}";
	}
}