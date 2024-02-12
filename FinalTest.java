package com.nec.basics;

public class FinalTest {

	public void add(int a, int b, int c) {
		System.out.println("add of three int's :" + (a + b + c));
	}

	public void add(int a, int b) {
		System.out.println("add of two int's :" + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("add of two float's :" + (a + b));
	}

	public void add(int a, float b) {
		System.out.println("add of two int ,float:" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of two float ,int:" + (a + b));
	}

	public static void main(String[] args) {
		FinalTest obj = new FinalTest();
		obj.add(123, 12);
		obj.add(12.3f, 12.3f);
		obj.add(12, 90.3f);
		obj.add('a','b');//type promotion

	}

}
