package pack1;

public class Test {

	public void m1() {
		System.out.println("am from m1 method of Test class");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();// same class
	}

}

class Sample extends Test {
	public void m2() {
		m1();// same package sub class
		System.out.println("am from m2 method of Sample class");
	}

}

class Sample1 {
	public void m3() {
		Test test = new Test();
		test.m1();// same package non-subclass
		System.out.println("am from m2 method of Sample class");
	}

}