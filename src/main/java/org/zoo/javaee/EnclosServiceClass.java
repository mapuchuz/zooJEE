package org.zoo.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class EnclosServiceClass implements EnclosServiceInterface {

	public List<Enclos> enclosServiceGetAll() {
		System.out.println("enclos service applé");
		List<Enclos> enclos = new ArrayList<>();
		enclos.add(new Enclos("enclos1"));
		enclos.add(new Enclos("enclos2"));
		enclos.add(new Enclos("enclos3"));
		enclos.add(new Enclos("enclos4"));
		enclos.add(new Enclos("enclos5"));

		return enclos;

	}
}
