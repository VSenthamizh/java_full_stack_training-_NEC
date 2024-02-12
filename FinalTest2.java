package com.nec.basics;

import java.util.Date;

 class Parent {//before class
	 int age = 32;//final 

	public  void displayAge() {//method
		++age;
		System.out.println("Age is :" + age);
	}	

	public void displayDate() {
		System.out.println("Today's Date  : " + new Date());
	}
}

public class FinalTest2 extends Parent {

	@Override
	public void displayAge() {
		--age;
		System.out.println("Age is :" + age);
	}

	public static void main(String[] args) {
		FinalTest2 obj = new FinalTest2();
		obj.displayAge();
		obj.displayDate();

	}

}
