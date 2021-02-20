package com.shape;
public class Square implements Polygon1{
	float side;
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		System.out.println("The area of Square:"+side*side);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of square:"+4*side);
	}
	
	
}
