package org.zoo.javaee;

import java.util.HashMap;
import java.util.Map;

import org.primefaces.context.RequestContext;


public class BlaBlaWindow {

	public void blaBlaBeanMessage(String summary, String detail) {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("resizable", false);
		RequestContext.getCurrentInstance().openDialog("infosWindow", options, null);
	}
}
