package com.sandbox.designpatterns.factoryMethod;

public class ProdB extends Product{

	@Override
	public double getPrice() {
		return 200;
	}

	@Override
	public String getName() {
		return "ProdB";
	}

}
