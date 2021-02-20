package com.test;
import com.shape.*;
public class TestPoly{

	public static void main(String[] args)
	{
		Polygon1 p =new Square(2.4f);
		p.calcArea();
		p.calcPeri();
		Polygon1 p1=new Rectangle(1.1f,2.2f);
		p1.calcArea();
		p1.calcPeri();
	}

}
