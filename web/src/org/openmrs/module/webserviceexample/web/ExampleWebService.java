/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webserviceexample.web;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import java.util.Random;

/**
 * This can be accessed via /openmrs/ms/ws/example because we mapped it
 * to /ms/ws/example in the /metadata/moduleApplicationContext.xml
 * file.
 */
@WebService
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class ExampleWebService {
	
	Random r = new Random();
	
	private double base;
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double quote(String ticker) {
		return r.nextDouble() * 100;
	}
}
