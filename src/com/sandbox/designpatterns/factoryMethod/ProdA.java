package com.sandbox.designpatterns.factoryMethod;

public class ProdA extends Product{

	@Override
	public double getPrice() {
		return 10.2;
	}

	@Override
	public String getName() {
		return "ProdA";
	}

}
