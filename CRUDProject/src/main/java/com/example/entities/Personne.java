package com.example.entities;

import java.sql.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorColumn;
@Entity
@DiscriminatorColumn(name="TYPE_PERSONNE")
public class Personne extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String telephone;
	private String lieuNaissance;
	private String nationalité;
	private String filiere;
	private String groupe;
	@Embedded
    private Adresse adresse;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissiance
	 * @param telephone
	 * @param lieuNaissance
	 * @param nationalité
	 * @param filiere
	 * @param niveau
	 * @param groupe
	 * @param adresse
	 */
	public Personne(String nom, String prenom, Date dateNaissiance, String telephone, String lieuNaissance,
			String nationalité, String filiere, String niveau, String groupe, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissiance;
		this.telephone = telephone;
		this.lieuNaissance = lieuNaissance;
		this.nationalité = nationalité;
		this.filiere = filiere;
		this.groupe = groupe;
		this.adresse = adresse;
	}
	public Personne() {
		
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
	 * @return the dateNaissiance
	 */
	public Date getDateNaissiance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissiance the dateNaissiance to set
	 */
	public void setDateNaissiance(Date dateNaissiance) {
		this.dateNaissance = dateNaissiance;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the lieuNaissance
	 */
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	/**
	 * @param lieuNaissance the lieuNaissance to set
	 */
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	/**
	 * @return the nationalité
	 */
	public String getNationalité() {
		return nationalité;
	}
	/**
	 * @param nationalité the nationalité to set
	 */
	public void setNationalité(String nationalité) {
		this.nationalité = nationalité;
	}
	/**
	 * @return the filiere
	 */
	public String getFiliere() {
		return filiere;
	}
	/**
	 * @param filiere the filiere to set
	 */
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	
	/**
	 * @return the groupe
	 */
	public String getGroupe() {
		return groupe;
	}
	/**
	 * @param groupe the groupe to set
	 */
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	public void setAdresse(Adresse a) {
		 adresse = a;
	}
	public Adresse getAdresse() {
	    	return adresse;
	}

}
