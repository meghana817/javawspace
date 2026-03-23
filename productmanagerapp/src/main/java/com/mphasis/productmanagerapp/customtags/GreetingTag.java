package com.mphasis.productmanagerapp.customtags;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class GreetingTag extends SimpleTagSupport{

	
	    private String name;       
	    private String timeOfDay;  

	    // setters for attributes
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setTimeOfDay(String timeOfDay) {
	        this.timeOfDay = timeOfDay;
	    }

	    @Override
	    public void doTag() throws IOException {
	        JspWriter out = getJspContext().getOut();
	        String greeting;

	        if ("morning".equalsIgnoreCase(timeOfDay)) {
	            greeting = "Good morning, " + name + "!";
	        } else if ("afternoon".equalsIgnoreCase(timeOfDay)) {
	            greeting = "Good afternoon, " + name + "!";
	        } else if ("evening".equalsIgnoreCase(timeOfDay)) {
	            greeting = "Good evening, " + name + "!";
	        } else {
	            greeting = "Hello, " + name + "!";
	        }

	        out.print(greeting);
	    }
	}



