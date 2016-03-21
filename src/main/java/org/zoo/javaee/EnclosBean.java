package org.zoo.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class EnclosBean {
	List<Enclos>enclos= new ArrayList<>();
	
	@Inject
	EnclosServiceInterface service;
	
	public void getAllEnclos() {
		service.enclosServiceGetAll();
	}
	
	public void refresh() {
		enclos= service.enclosServiceGetAll();
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
