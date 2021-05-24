package com.example.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Embeddable

public class CoursId implements Serializable{

	/**
    *
    */
   private static final long serialVersionUID = 1L;

   @ManyToOne
   @JoinColumn(name = "id_prof")
   private Professeur prof;
   
   @ManyToOne
   @JoinColumn(name = "id_etu")
   private Etudiant etu;
   
   @ManyToOne
   @JoinColumn(name = "id_salle")
   private Salle salle;

/**
 * @return the prof
 */
public Professeur getProf() {
	return prof;
}

/**
 * @param prof the prof to set
 */
public void setProf(Professeur prof) {
	this.prof = prof;
}

/**
 * @return the etu
 */
public Etudiant getEtu() {
	return etu;
}

/**
 * @param etu the etu to set
 */
public void setEtu(Etudiant etu) {
	this.etu = etu;
}

/**
 * @return the salle
 */
public Salle getSalle() {
	return salle;
}

/**
 * @param salle the salle to set
 */
public void setSalle(Salle salle) {
	this.salle = salle;
}
   
   
}
