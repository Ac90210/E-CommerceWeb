package com.simplilearn.entity;

import java.util.Set;

public class UserEntity {
	
	private long id;
	private String username;
	private String password;
	private String email;
	
	
	    private Set<Role> roles;

	    public Set<Role> getRoles() {
			return roles;
		}
		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}
		public enum Role {
	        ADMIN,
	        USER
	    }
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
