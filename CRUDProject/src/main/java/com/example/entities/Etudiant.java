package com.example.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.DiscriminatorValue;
@Entity
@DiscriminatorValue("Etu")
public class Etudiant extends Personne{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String matricule;
	private String niveau;
	@OneToMany(mappedBy = "pk.etu")
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
	 * @param niveau2
	 * @param cours
	 */
	public Etudiant(String nom, String prenom, Date dateNaissiance, String telephone, String lieuNaissance,
			String nationalité, String filiere, String niveau, String groupe, Adresse adresse, String matricule,
			String niveau2, Set<Cours> cours) {
		super(nom, prenom, dateNaissiance, telephone, lieuNaissance, nationalité, filiere, niveau, groupe, adresse);
		this.matricule = matricule;
		niveau = niveau2;
		this.cours = cours;
	}
	public Etudiant() {
		
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
	 * @return the niveau
	 */
	public String getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	

}
