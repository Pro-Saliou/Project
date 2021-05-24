/**
 * 
 */
package net.javaguides.springbootsecurity.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author macbook
 *
 */
@Entity
public class Cours {
	@Id
	private CoursId pk;
	private String libellé;
	private String niveau;
	private String Hdebut;
	private String Mindebut;
	private String Hfin;
	private String Minfin;
	
	
	/**
	 * @param pk
	 * @param libellé
	 * @param niveau
	 * @param hdebut
	 * @param mindebut
	 * @param hfin
	 * @param minfin
	 */
	public Cours(CoursId pk, String libellé, String niveau, String hdebut, String mindebut, String hfin,
			String minfin) {
		super();
		this.pk = pk;
		this.libellé = libellé;
		this.niveau = niveau;
		Hdebut = hdebut;
		Mindebut = mindebut;
		Hfin = hfin;
		Minfin = minfin;
	}
	// récuperation  de l'objet professeur
	public Professeur getProfesseur() {
        return getPk().getProf();
    }
	
	// Constructeur sans argument de la classe
    public Cours() {
		
	}
	
	// Mise à jour de l'objet professeur
    public void setProfesseur(Professeur prof) {
        getPk().setProf(prof);
    }
    // recuperation de l'objet Salle
    public Salle getSalle() {
        return getPk().getSalle();
    }
	
	// Mise à jour de l'objet Salle
    public void setSalle(Salle salle) {
        getPk().setSalle(salle);
    }
    
 // recuperation de l'objet Etudiant
    public Etudiant getEtudiant() {
        return getPk().getEtu();
    }
	
	// Mise à jour de l'objet Etudiant
    public void setEtudiant(Etudiant etu) {
        getPk().setEtu(etu);
    }
	/**
	 * @return the pk
	 */
	public CoursId getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(CoursId pk) {
		this.pk = pk;
	}

	/**
	 * @return the libellé
	 */
	public String getLibellé() {
		return libellé;
	}
	/**
	 * @param libellé the libellé to set
	 */
	public void setLibellé(String libellé) {
		this.libellé = libellé;
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
	/**
	 * @return the hdebut
	 */
	public String getHdebut() {
		return Hdebut;
	}
	/**
	 * @param hdebut the hdebut to set
	 */
	public void setHdebut(String hdebut) {
		Hdebut = hdebut;
	}
	/**
	 * @return the mindebut
	 */
	public String getMindebut() {
		return Mindebut;
	}
	/**
	 * @param mindebut the mindebut to set
	 */
	public void setMindebut(String mindebut) {
		Mindebut = mindebut;
	}
	/**
	 * @return the hfin
	 */
	public String getHfin() {
		return Hfin;
	}
	/**
	 * @param hfin the hfin to set
	 */
	public void setHfin(String hfin) {
		Hfin = hfin;
	}
	/**
	 * @return the minfin
	 */
	public String getMinfin() {
		return Minfin;
	}
	/**
	 * @param minfin the minfin to set
	 */
	public void setMinfin(String minfin) {
		Minfin = minfin;
	}
	
	
	
}
