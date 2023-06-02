package com.company.liskov_1;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
		//useRectangle(square); //will run into error since Square is subsituted to Rectangle

	}

	//Simple test case
	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20); //setting height of square
		rectangle.setWidth(30); // overriding previous to 20
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}
}
