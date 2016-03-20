package org.zoo.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Parle {
	
	private List<String>paroles = new ArrayList<>();
	private List<Enclos>enclos= new ArrayList<>();

	public Parle() {
		paroles.add("et oui, c est la vie");
		paroles.add("c etait poendant l'ohheur d'une profonde nuit.");
		paroles.add("un petit bonheur est un bonheur qui grossit.");
		loadEnclos();
	}

	public List<String> getParoles() {
		return paroles;
	}

	public void setParoles(List<String> paroles) {
		this.paroles = paroles;
	}

	private void loadEnclos() {
		enclos.add( new Enclos("enclos1"));		
		enclos.add( new Enclos("enclos2"));		
		enclos.add( new Enclos("enclos3"));		
		enclos.add( new Enclos("enclos4"));		
		enclos.add( new Enclos("enclos5"));		
	}

	public List<Enclos> getEnclos() {
		return enclos;
	}

	public void setEnclos(List<Enclos> enclos) {
		this.enclos = enclos;
	}

	
}
