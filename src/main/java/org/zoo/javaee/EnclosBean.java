package org.zoo.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Model
public class EnclosBean {
	List<Enclos>enclos= new ArrayList<>();
	
	@Inject
	EnclosServiceInterface service;

	@Inject
	BlaBlaBeanInterface blablaService;
	
	public void refresh() {
		enclos= service.enclosServiceGetAll();
	        
		blablaService.blaBlaBeanMessage("Ajax sur une page", 
				"Un bouton dans un panneau déclenche un calcul"
				+"\npuis un affichage ajax dans un autre panneau.");
	}

	public List<Enclos> getEnclos() {
		return enclos;
	}

	public void setEnclos(List<Enclos> enclos) {
		this.enclos = enclos;
	}

	public EnclosServiceInterface getService() {
		return service;
	}

	public void setService(EnclosServiceInterface service) {
		this.service = service;
	}
	
}
