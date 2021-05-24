package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

 @Entity
 @Table(name = "ROLES")
 public class Role extends AbstractEntity {
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//proprietés
	 private String nomRole;

	/**
	 * 
	 */
	public Role() {
		super();
	}

	/**
	 * @param nomRole
	 */
	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}

	/**
	 * @return the nomRole
	 */
	public String getNomRole() {
		return nomRole;
	}

	/**
	 * @param nomRole the nomRole to set
	 */
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	 
	 
 }
