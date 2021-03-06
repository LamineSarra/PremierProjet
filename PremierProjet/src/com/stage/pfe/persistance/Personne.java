package com.stage.pfe.persistance;

// Generated 5 f�vr. 2015 15:31:46 by Hibernate Tools 3.4.0.CR1

/**
 * Personne generated by hbm2java
 */
public class Personne implements java.io.Serializable {

	private Integer idpersonne;
	private String nom;
	private String prenom;

	public Personne() {
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Integer getIdpersonne() {
		return this.idpersonne;
	}

	public void setIdpersonne(Integer idpersonne) {
		this.idpersonne = idpersonne;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idpersonne == null) ? 0 : idpersonne.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (idpersonne == null) {
			if (other.idpersonne != null)
				return false;
		} else if (!idpersonne.equals(other.idpersonne))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personne [idpersonne=" + idpersonne + ", nom=" + nom
				+ ", prenom=" + prenom + ", getIdpersonne()=" + getIdpersonne()
				+ ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
