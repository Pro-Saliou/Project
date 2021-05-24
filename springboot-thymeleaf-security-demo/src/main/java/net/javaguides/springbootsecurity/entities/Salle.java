package net.javaguides.springbootsecurity.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Salle extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numSalle;
	private  String nomBatiment;
	private int nbPlace;
	@OneToMany(mappedBy = "pk.salle")
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
	
	//  Constructeur par defaut de la classe Salle
	public Salle() {
		
	}
	/**
	 * @param numSalle
	 * @param nomBatiment
	 * @param nbPlace
	 */
	public Salle(int numSalle, String nomBatiment, int nbPlace) {
		super();
		this.numSalle = numSalle;
		this.nomBatiment = nomBatiment;
		this.nbPlace = nbPlace;
	}
	/**
	 * @return the numSalle
	 */
	public int getNumSalle() {
		return numSalle;
	}
	/**
	 * @param numSalle the numSalle to set
	 */
	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}
	/**
	 * @return the nomBatiment
	 */
	public String getNomBatiment() {
		return nomBatiment;
	}
	/**
	 * @param nomBatiment the nomBatiment to set
	 */
	public void setNomBatiment(String nomBatiment) {
		this.nomBatiment = nomBatiment;
	}
	/**
	 * @return the nbPlace
	 */
	public int getNbPlace() {
		return nbPlace;
	}
	/**
	 * @param nbPlace the nbPlace to set
	 */
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	
}
