package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ville_france")
public class Ville {
	
	@Id
	private String Code_commune_INSEE;
	
	@Column(name="Nom_commune")
	private String nomCommune;
	
	@Column(name="Code_postal")
	private String codePostal;
	
	@Column(name="Libelle_acheminement")
	private String libelleAcheminement;
	
	@Column(name="Ligne_5")	
	private String ligne;
	
	@Column(name="Latitude")
	private String Latitude;
	
	@Column(name="Longitude")
	private String longitude;
	
	public Ville() {
	}
	
	public String getCode_commune_INSEE() {
		return Code_commune_INSEE;
	}

	public void setCode_commune_INSEE(String code_commune_INSEE) {
		Code_commune_INSEE = code_commune_INSEE;
	}

	public String getLibelleAcheminement() {
		return libelleAcheminement;
	}

	public void setLibelleAcheminement(String libelleAcheminement) {
		this.libelleAcheminement = libelleAcheminement;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getLigne() {
		return ligne;
	}
	public void setLigne(String ligne) {
		this.ligne = ligne;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
}
