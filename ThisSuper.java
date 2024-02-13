package com.nec.basics;

class ParentEx {
	int marks = 30;

	public ParentEx() {
		this("NEC");
		System.out.println("Default constructor of parent");
	}

	public ParentEx(String name) {
		System.out.println("param constructor of parent: "+name);
	}
	public void printMarks() {
		marks--;
		System.out.println("marks are :" + marks);
	}

	public void print() {
		System.out.println("am from print method");
	}
}

public class ThisSuper extends ParentEx {
	int marks = 234;

	public ThisSuper() {
		//super("sandeep");
		System.out.println("am from default constructor");
	}

	public ThisSuper(int marks) {
	//	super();
		this();
		System.out.println("am from param constructor");
		System.out.println(marks + " " + this.marks + " " + super.marks);
		this.printMarks();
		print();
		System.out.println(this);//heap area
		super.printMarks();
	}

	@Override
	public void printMarks() {
		marks++;
		System.out.println("marks are :" + marks);
	}

	public static void main(String[] args) {
		ThisSuper obj = new ThisSuper(111);
		System.out.println(obj);
		System.out.println(obj.toString());
		// obj.printMarks();
	}
	@Override
	public String toString() {
		return "NEC";
	}

}
