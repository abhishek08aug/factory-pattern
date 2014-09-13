package in.blogspot.randomcompiler.factory.pattern.impl;

import in.blogspot.randomcompiler.factory.pattern.api.Shape;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		return null;
	}
}
