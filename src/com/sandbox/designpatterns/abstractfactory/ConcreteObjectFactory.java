package com.sandbox.designpatterns.abstractfactory;

import com.sandbox.designpatterns.abstractfactory.Color.ColorType;
import com.sandbox.designpatterns.abstractfactory.Shape.ShapeType;

public class ConcreteObjectFactory extends AbstractObjectFactory{

	@Override
	public Shape getShape(ShapeType shapeType) {
		Shape shape =  null;
		
		switch(shapeType){
		case CIRCLE:
		{
			shape = new Circle();
			break;
		}
		case SQUARE: 
		{
			shape = new Square();
			break;
		}
		
		default:
		{
			throw new IllegalArgumentException("Unknown ShapeType");
		}
		
		}
		return shape;
	}

	@Override
	public Color getColor(ColorType colorType) {
		Color color = null;
		
		switch(colorType)
		{
			case RED:
			{
				color = new Red();
				break;
			}
			case GREEN:
			{
				color = new Green();
				break;
			}
			default:
			{
				throw new IllegalArgumentException("Unknown ColorType");
			}	
			
			
		}
		
		return color;
	}

	
}
