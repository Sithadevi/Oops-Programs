package com.shape;

public class Rectangle implements Polygon1{
			float length;
			float breadth;
			public Rectangle(float length, float breadth) {
				super();
				this.length = length;
				this.breadth = breadth;
			}

			@Override
			public void calcArea() {
				// TODO Auto-generated method stub
				System.out.println("The area of Rectangle is:"+(length*breadth));
			}

			@Override
			public void calcPeri() {
				// TODO Auto-generated method stub
				System.out.println("The perimeter of Rectangle is:"+(2*(length+breadth)));
				
			}
			
}
