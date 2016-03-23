package org.zoo.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class ZooServiceClass implements ZooServiceInterface {

	public List<Enclos> getAllEnclos() {
		System.out.println("enclos service applé");
		List<Enclos> enclos = new ArrayList<>();
		enclos.add(new Enclos("enclos1"));
		enclos.add(new Enclos("enclos2"));
		enclos.add(new Enclos("enclos3"));
		enclos.add(new Enclos("enclos4"));
		enclos.add(new Enclos("enclos5"));

		return enclos;
	}
	
	public List<Animal> getAllAnimal() {
		List<Animal>animaux= new ArrayList<>();
		animaux.add( new Animal("coco", "Ara", "330px-Ara_chloroptera.jpg" ));
		animaux.add( new Animal("buouaf", "Buffle", "435px-BUFFALO159.JPG"));
		animaux.add( new Animal("léo", "Léopard", "435px-Snow_leopard_portrait-2010-07-09.jpg"));
		animaux.add( new Animal("gor", "Gorille", "450px-Gorilla_063.jpg"));
		animaux.add( new Animal("kang", "Kangourou", "KANGOUROU240px-Wallaby_de_Bennett_JDP_2004.jpg"));
		animaux.add( new Animal("cocoara", "Ara", "330px-Ara_chloroptera.jpg"));
		animaux.add( new Animal("buorrf", "Buffle", "435px-BUFFALO159.JPG"));
		animaux.add( new Animal("léopardo", "Léopard", "435px-Snow_leopard_portrait-2010-07-09.jpg"));
		animaux.add( new Animal("grillos", "Gorille", "450px-Gorilla_063.jpg"));
		animaux.add( new Animal("ourou", "Kangourou", "KANGOUROU240px-Wallaby_de_Bennett_JDP_2004.jpg"));
		animaux.add( new Animal("djili", "Kangourou", "KANGOUROU240px-Wallaby_de_Bennett_JDP_2004.jpg"));
		return animaux;
	}

	public List<Affectation> getAllAffectation() {
		List<Enclos> enclos = new ArrayList<>();
		enclos= getAllEnclos();
		List<Animal>animaux= new ArrayList<>();
		animaux= getAllAnimal();
		List<Affectation>affectations=	new ArrayList<>();
		affectations.add( new Affectation( enclos.get(3),  animaux.get(0)) );
		affectations.add( new Affectation( enclos.get(0),  animaux.get(1)) );
		affectations.add( new Affectation( enclos.get(1),  animaux.get(2)) );
		affectations.add( new Affectation( enclos.get(1),  animaux.get(6)) );
		affectations.add( new Affectation( enclos.get(2),  animaux.get(7)) );
		affectations.add( new Affectation( enclos.get(2),  animaux.get(3)) );
		affectations.add( new Affectation( enclos.get(4),  animaux.get(4)) );
		affectations.add( new Affectation( enclos.get(4),  animaux.get(9)) );
		affectations.add( new Affectation( enclos.get(4),  animaux.get(10)) );
		affectations.add( new Affectation( enclos.get(3),  animaux.get(5)) );
		affectations.add( new Affectation( enclos.get(3),  animaux.get(8)) );
		return affectations;
	}
}
