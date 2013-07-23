package com.sandbox.designpatterns.FactoryMethod;

import com.sandbox.designpatterns.FactoryMethod.Product.ProductTypes;

public class ProductFactory {

	public Product getProduct(ProductTypes productType){
		Product product = null;
		switch(productType)
		{
		case ProdA:
		{
			product = new ProdA();
			break;
		}
		
		case ProdB:
		{
			product = new ProdB();
			break;
		}
		
		default:
		{
			throw new IllegalArgumentException("Unknown ProductType");
		}
		}
		return product;
	}
}
