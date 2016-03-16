package org.zoo.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Accueil {

//	static private List<Enclos>enclos= 	new ArrayList<>();

	public String enclos() {
		return "enclos";
	}
	public String animaux() {
		return "animaux";
	}
	public String visites() {
		return "visites";
	}
	
	
}
