package org.zoo.javaee;

public class Affectation {

	private Enclos enclos;
	private Animal animal;
	public Affectation(Enclos e, Animal a) {
		enclos= e;
		animal= a;
	}
//	public Affectation(String e, String a) {
//		enclos= e;
//		animal= a;
//	}
	public Enclos getEnclos() {
		return enclos;
	}
	public void setEnclos(Enclos enclos) {
		this.enclos = enclos;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
