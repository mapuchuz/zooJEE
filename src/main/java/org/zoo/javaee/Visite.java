package org.zoo.javaee;

import java.util.Date;

public class Visite {

	private static final Double PRIXENFANT=	3.50;
	private static final Double PRIXADULTE=	6.50;
	
	private Date date;
	private int nombreAdultes;
	private int nombreEnfants;

	public Visite(Date date ,int nombreAdultes, int nombreEnfants) {
		this.date=	date;
		this.nombreAdultes=	nombreAdultes;
		this.nombreEnfants=	nombreEnfants;
		
	}
	public Double prix() {
		return nombreAdultes*PRIXADULTE + nombreEnfants*PRIXENFANT;
	}

}
