package in.blogspot.randomcompiler.factory.pattern.demo;

import in.blogspot.randomcompiler.factory.pattern.impl.ShapeFactory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		factory.getShape("rectangle").draw();
		
		factory.getShape("square").draw();
		
		factory.getShape("circle").draw();
	}

}
