package com.jcodepoint.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class ExampleBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean showPanelGroup;
	
	@PostConstruct
	public void init() {
		this.showPanelGroup = Boolean.TRUE;
	}
	
	
	public Boolean getShowPanelGroup() {
		return showPanelGroup;
	}

	public void setShowPanelGroup(Boolean showPanelGroup) {
		this.showPanelGroup = showPanelGroup;
	}

}

