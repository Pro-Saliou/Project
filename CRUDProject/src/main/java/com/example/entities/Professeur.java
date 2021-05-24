package com.example.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.DiscriminatorValue;
@Entity
@DiscriminatorValue("Prof")
public class Professeur extends Personne {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String matricule;
	private String titre;
	private String anciennete;
	@OneToMany(mappedBy = "pk.prof")
	private Set<Cours> cours = new HashSet<Cours>();
	/**
	 * @return the cours
	 */
	public Set<Cours> getCours() {
		return cours;
	}
	/**
	 * @param cours the cours to set
	 */
	public void setCours(Set<Cours> cours) {
		this.cours = cours;
	}
	
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
	 * @param matricule
	 * @param titre
	 * @param ancienneté
	 * @param cours
	 */
	public Professeur(String nom, String prenom, Date dateNaissiance, String telephone, String lieuNaissance,
			String nationalité, String filiere, String niveau, String groupe, Adresse adresse, String matricule,
			String titre, String anciennete, Set<Cours> cours) {
		super(nom, prenom, dateNaissiance, telephone, lieuNaissance, nationalité, filiere, niveau, groupe, adresse);
		this.matricule = matricule;
		this.titre = titre;
		this.anciennete = anciennete;
		this.cours = cours;
	}
	public Professeur() {
		
	}
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the ancienneté
	 */
	public String getAnciennete() {
		return anciennete;
	}
	/**
	 * @param ancienneté the anciennete to set
	 */
	public void setAncienneté(String anciennete) {
		this.anciennete = anciennete;
	}
	

}
