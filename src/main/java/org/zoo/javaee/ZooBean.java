package org.zoo.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class ZooBean {
	List<Enclos>enclos= new ArrayList<>();
	List<Animal>animaux= new ArrayList<>();
	
	@Inject
	ZooServiceInterface zooService;
	
	public void refreshEnclos() {
		enclos= zooService.getAllEnclos();
	}

	public void refreshAnimal() {
		animaux= zooService.getAllAnimal();
	}

	public ZooServiceInterface getZooService() {
		return zooService;
	}

	public void setZooService(ZooServiceInterface zooService) {
		this.zooService = zooService;
	}

	public List<Enclos> getEnclos() {
		return enclos;
	}

	public void setEnclos(List<Enclos> enclos) {
		this.enclos = enclos;
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	
}
