package com.nec.basics;

import java.util.Scanner;

//java.lang default package 
interface Caluculator {
	int age = 12; // public static final int age=12;

	void add(int a, int b); // public abstract void add(int a,int b);

	public abstract void sub(int a, int b);
}

abstract class Mobile_Caluculator implements Caluculator {
	public void mul(int a, int b) {
		System.out.println("mul of two numbers is  :" + (a * b));
	}

	public abstract void div(int a, int b);
}

public class Laptop_Calculator extends Mobile_Caluculator {
	public static void main(String[] args) {
		Laptop_Calculator test = new Laptop_Calculator();
		test.mul(12, 13);
		test.add(12, 13);
		test.div(12, 13);
		test.sub(12, 13);
		test.toString();

	}

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a / b);
	}
}
