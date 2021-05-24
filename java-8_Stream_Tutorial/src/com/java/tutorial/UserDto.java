package com.java.tutorial;

public class UserDto {
	int id;
	String nom;
	String login;
	/**
	 * @param id
	 * @param nom
	 * @param login
	 */
	public UserDto(int id, String nom, String login) {
		super();
		this.id = id;
		this.nom = nom;
		this.login = login;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", nom=" + nom + ", login=" + login + "]";
	}
	
}
