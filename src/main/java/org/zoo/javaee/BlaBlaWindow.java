package org.zoo.javaee;

import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Stateless
public class BlaBlaWindow implements BlaBlaBeanInterface {

	public void blaBlaBeanMessage(String summary, String detail) {
		String html= "Le growl de PrimeFaces permet d'afficher des messages"
				+"<strong color=blue> au dessus </strong>"
				+"de la page.<br />Avec un  <h1 style='color:blue;'> peu de html </h1> on peut"
				+"<br />enrichir le texte";
	        FacesMessage message = 
new FacesMessage(FacesMessage.SEVERITY_ERROR, "A propos...", html);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	        	
	}
}
