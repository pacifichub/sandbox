package com.sandbox.designpatterns.abstractfactory;

public abstract class Shape{
	public enum ShapeType { SQUARE, CIRCLE} ;
	public abstract void drawShape();
}
