package com.sandbox.designpatterns.factoryMethod;

public abstract class Product {
	
	public enum ProductTypes { ProdA, ProdB}

	public abstract double getPrice();
	public abstract String getName();
}
