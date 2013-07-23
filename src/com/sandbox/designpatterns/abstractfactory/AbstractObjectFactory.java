package com.sandbox.designpatterns.abstractfactory;

import com.sandbox.designpatterns.abstractfactory.Color.ColorType;
import com.sandbox.designpatterns.abstractfactory.Shape.ShapeType;

public abstract class AbstractObjectFactory {

	public abstract Shape getShape(ShapeType shapeType);
	public abstract Color getColor(ColorType color);
}
