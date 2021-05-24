package net.javaguides.springbootsecurity.entities;

import javax.persistence.Embeddable;
@Embeddable

public class Adresse {
	private String numRue;//numero de Rue 
	private String nomRue;// nom de la Rue
	private String CodePostale;//Code postale de l'adresse
	private String ville; // le nom de la Ville 
	private String pays; // Le nom du pays où reside la personne
	/**
	 * @param numRue
	 * @param nomRue
	 * @param codePostale
	 * @param ville
	 * @param pays
	 */
	public Adresse(String numRue, String nomRue, String codePostale, String ville, String pays) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		CodePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
	}
	/**
	 * @return the numRue
	 */
	public String getNumRue() {
		return numRue;
	}
	/**
	 * @param numRue the numRue to set
	 */
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	/**
	 * @return the nomRue
	 */
	public String getNomRue() {
		return nomRue;
	}
	/**
	 * @param nomRue the nomRue to set
	 */
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	/**
	 * @return the codePostale
	 */
	public String getCodePostale() {
		return CodePostale;
	}
	/**
	 * @param codePostale the codePostale to set
	 */
	public void setCodePostale(String codePostale) {
		CodePostale = codePostale;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

}
