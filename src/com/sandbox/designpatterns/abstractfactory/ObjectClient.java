package com.sandbox.designpatterns.abstractfactory;

import com.sandbox.designpatterns.abstractfactory.Color.ColorType;
import com.sandbox.designpatterns.abstractfactory.Shape.ShapeType;

public class ObjectClient {
	
	public static void main(String[] args) {
		AbstractObjectFactory objectFactory = new ConcreteObjectFactory();
		
		Shape shape = objectFactory.getShape(ShapeType.SQUARE);
		Color color = objectFactory.getColor(ColorType.GREEN);
		
		shape.drawShape();
		color.drawColor();
	}

}
