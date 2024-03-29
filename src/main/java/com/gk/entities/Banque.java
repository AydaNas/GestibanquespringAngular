package com.gk.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Banque {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String adresse;
	
	public Banque(int id, String nom, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public Banque() {
	
	}
	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
