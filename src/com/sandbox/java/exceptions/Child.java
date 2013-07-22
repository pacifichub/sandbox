package com.sandbox.java.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent{

	@Override
	public void myMethod() throws FileNotFoundException {
		
	}
	
	@Override
	public void anotherMethod() throws IOException{
		throw new IOException();
	}
	
}
