/*
 * TestController.java
 *
 * Created on 2017-07-23, 7:28
 */
package com.marcnuri.example.angularboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marc Nuri <marc@marcnuri.com> on 2017-07-23.
 */
@RestController()
@RequestMapping(path="/api")
public class TestController {

//**************************************************************************************************
//  Fields
//**************************************************************************************************

//**************************************************************************************************
//  Constructors
//**************************************************************************************************

//**************************************************************************************************
//  Abstract Methods
//**************************************************************************************************

//**************************************************************************************************
//  Overridden Methods
//**************************************************************************************************

//**************************************************************************************************
//  Other Methods
//**************************************************************************************************
	@GetMapping(path = "/hello-world")
	public String helloWorld(){
		return "Hello world!";
	}
//**************************************************************************************************
//  Getter/Setter Methods
//**************************************************************************************************

//**************************************************************************************************
//  Static Methods
//**************************************************************************************************

//**************************************************************************************************
//  Inner Classes
//**************************************************************************************************

}
