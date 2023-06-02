package com.company.liskov_1;

public class Square implements Shape /* extends Rectangle */ { //Break relationship since it breaks the contract of setWidth and setHeight
	
	//added store for side
	private int side;
	
	//same length
	public Square(int side) {
		this.side = side;
	}
	
	//violating defined behaviour
	/*
	@Override
	public void setWidth(int width) {
		setSide(width);
	}

	@Override
	public void setHeight(int height) {
		setSide(height);
	}
	*/

	//set width and height to side value
	public void setSide(int side) {
		this.side = side;
		/*
		super.setWidth(side);
		super.setHeight(side);
		*/
	}

	//added a getter method
	public int getSide() {
		return side;
	}

	//added a compute area
	public int computeArea() {
		return side * side;
	}

}
