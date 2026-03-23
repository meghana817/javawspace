package com.mphasis.productmanagerapp.customtags;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCaseTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		StringWriter content= new StringWriter();
		getJspBody().invoke(content);
		getJspContext().getOut().print(content.toString().toUpperCase());
	}

}
