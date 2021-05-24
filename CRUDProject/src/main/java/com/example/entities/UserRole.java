package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_ROLES")
public class UserRole extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	// un UserRole référence un User
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	// un UserRole référence un Role
	@ManyToOne
	@JoinColumn(name = "ROLE_ID")
	private Role role;

	/**
	 * 
	 */
	public UserRole() {
		super();
	}

	/**
	 * @param user
	 * @param role
	 */
	public UserRole(User user, Role role) {
		super();
		this.user = user;
		this.role = role;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

 }