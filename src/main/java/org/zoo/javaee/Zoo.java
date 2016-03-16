package org.zoo.javaee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private static List<Enclos>enclos= new ArrayList<>();
	private static List<Animal>animaux= new ArrayList<>();
	private static List<Visite>visites= new ArrayList<>();
	
	private static Zoo zoo;
	public static Zoo getZoo() {
		if( zoo==null )
			zoo=	new Zoo();
		return zoo;
	}
	
	public Zoo() {
		load();
	}
	
	private void load() {
		loadEnclos();
		loadAnimal();
		try {
			loadVisite();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void loadVisite() throws ParseException {
		SimpleDateFormat sDF= new SimpleDateFormat("dd/MM/yyyy");
		visites.add( new Visite( sDF.parse( "10/01/2016" ), 	1,2));
		visites.add( new Visite( sDF.parse( "11/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "12/01/2016" ), 	2,0));
		visites.add( new Visite( sDF.parse( "12/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "12/01/2016" ), 	2,5));
		visites.add( new Visite( sDF.parse( "13/01/2016" ), 	1,1));
		visites.add( new Visite( sDF.parse( "15/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "17/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "17/01/2016" ), 	1,1));
		visites.add( new Visite( sDF.parse( "17/01/2016" ), 	6,1));
		visites.add( new Visite( sDF.parse( "17/01/2016" ), 	3,2));
		visites.add( new Visite( sDF.parse( "17/01/2016" ), 	3,4));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	1,4));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	2,0));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	14,0));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	1,3));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	3,16));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	7,20));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	2,10));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	1,0));
		visites.add( new Visite( sDF.parse( "18/01/2016" ), 	2,0));
	}


	private void loadAnimal() {
		animaux.add( new Animal("coco", "Ara"));
		animaux.add( new Animal("buouaf", "Buffle"));
		animaux.add( new Animal("léo", "Léopard"));
		animaux.add( new Animal("gor", "Gorille"));
		animaux.add( new Animal("kang", "Kangourou"));
		animaux.add( new Animal("cocoara", "Ara"));
		animaux.add( new Animal("buorrf", "Buffle"));
		animaux.add( new Animal("léopardo", "Léopard"));
		animaux.add( new Animal("grillos", "Gorille"));
		animaux.add( new Animal("ourou", "Kangourou"));
		animaux.add( new Animal("djili", "Kangourou"));
	}

	private void loadEnclos() {
		enclos.add( new Enclos("enclos1"));		
		enclos.add( new Enclos("enclos2"));		
		enclos.add( new Enclos("enclos3"));		
		enclos.add( new Enclos("enclos4"));		
		enclos.add( new Enclos("enclos5"));		
	}

	public static List<Enclos> getEnclos() {
		return enclos;
	}

	public static List<Animal> getAnimaux() {
		return animaux;
	}

	public static List<Visite> getVisites() {
		return visites;
	}
	
}
