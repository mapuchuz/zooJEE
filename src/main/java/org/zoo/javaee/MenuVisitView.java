package org.zoo.javaee;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;
 
@ManagedBean
public class MenuVisitView {
     
    private MenuModel model;
 
    @PostConstruct
    public void init() {
    }
    public MenuModel getModel() {
        return model;
    }   
     
    public void list() {
        addMessage("Success", "List Of Visits");
    }
     
    public void details() {
        addMessage("Success", "Details");
    }
     
    public void addonevisitor() {
        addMessage("Success", "One visitor visit");
    }
    public void addtwovisitors() {
    	addMessage("Success", "One visitor visit");
    }
    public void add2adults1child() {
    	addMessage("Success", "2 adults 1 child visit");
    }
    public void addothers() {
    	addMessage("Success", "Others visit");
    }
    public void barchart() {
    	addMessage("Success", "barchart visit");
    }
    public void piechart() {
    	addMessage("Success", "piechart visit");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}