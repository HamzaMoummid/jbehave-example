package com.jbehave.example;

public class Rectangle {

	private int id;
	private int longueur;
	private int largeur;
	
	
	public Rectangle(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	public int getSurface() {
		return longueur * largeur;
	}
	
	
}
