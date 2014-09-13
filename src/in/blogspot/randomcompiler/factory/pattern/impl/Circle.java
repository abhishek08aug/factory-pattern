package in.blogspot.randomcompiler.factory.pattern.impl;

import in.blogspot.randomcompiler.factory.pattern.api.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}

}
