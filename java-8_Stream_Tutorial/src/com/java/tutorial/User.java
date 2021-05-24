package com.java.tutorial;

public class User {
	int id;
	String nom;
	String login;
	String motDePasse;
	/**
	 * @param id
	 * @param nom
	 * @param login
	 * @param motDePasse
	 */
	public User(int id, String nom, String login, String motDePasse) {
		//super();
		this.id = id;
		this.nom = nom;
		this.login = login;
		this.motDePasse = motDePasse;
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
	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}
	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", login=" + login + ", motDePasse=" + motDePasse + "]";
	}
	

}
