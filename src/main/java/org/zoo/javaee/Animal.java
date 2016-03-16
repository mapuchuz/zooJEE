package org.zoo.javaee;

public class Animal {
	
	private String nom;
	private String espece;
	private String description;
	private String photo;
	public String getNom() {
		return nom;
	}
	public Animal(String name, String espece) {
		this.nom= name;
		this.espece= espece;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEspece() {
		return espece;
	}

	
}
