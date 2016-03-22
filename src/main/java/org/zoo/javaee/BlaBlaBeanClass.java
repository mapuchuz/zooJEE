package org.zoo.javaee;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Stateless
@Alternative
public class BlaBlaBeanClass  implements BlaBlaBeanInterface {

	public void blaBlaBeanMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
}
