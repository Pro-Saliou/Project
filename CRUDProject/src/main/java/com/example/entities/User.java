package com.example.entities;

import javax.persistence.Entity;
import org.hibernate.validator.constraints.NotBlank;

@SuppressWarnings("deprecation")
@Entity
public class User extends AbstractEntity {
          
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Name is mandatory")
    private String nom;

	@NotBlank(message = "Name is mandatory")
	private String prenom;
     
	@NotBlank(message = "Name is mandatory")
	private String login;
	
    @NotBlank(message = "Email is mandatory")
    private String motdepasse;
    
    // Constructeur sans argument
    public User() {
	 
    }

	/**
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param motdepasse
	 */
	public User( String nom, String prenom, String login, String motdepasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motdepasse = motdepasse;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	 * @return the motdepasse
	 */
	public String getMotdepasse() {
		return motdepasse;
	}

	/**
	 * @param motdepasse the motdepasse to set
	 */
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	
 

}