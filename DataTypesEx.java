
public class DataTypesEx {
	static boolean x=false;
	int a = 123;
	int b = 234;
	static int countryCode = 91;// global static 4 bytes //method area
	short age1 = 23;// 2 bytes
	 int age=12;
	long aadhar = 9443439494994l;// global variable -->instance 8 bytes JVM-->heap area

	// code reusability

	public static void displayMsg()// default method
	{
		if(x=true) {
		System.out.println("Feeling Hungry Leave Us!!!");
		}
	}

	public int addOfTwo(int a, int b) {
		return a + b;
	}

	public void subOfTwo(int a, int b) {
		++age;
		System.out.println("age is  :"+age);
		System.out.println(a - b);
	}

	public int mulOfTwo() {
		return a * b;
	}

	public static void main(String[] args) {
		// local variable /stack area
		byte age = 32;
		long contact = 949494994;
		float salary = 23.434277423984283f;
		double result = 23.434277423984283;
		boolean value = true;
		char gender = 'm';
		System.out.println(age + " " + contact + " " + " " + salary + " " + result + " " + value + " " + gender);

		System.out.println(DataTypesEx.countryCode);//static variable accessing
		DataTypesEx obj = new DataTypesEx();//object creation for providing memory instance properties
		System.out.println(obj.aadhar);//instance variable accessing
		System.out.println(obj.age1);

		System.out.println(obj.mulOfTwo());
		System.out.println(obj.addOfTwo(12, 12));//instance method calling using obj reference
		obj.subOfTwo(22, 9);
		DataTypesEx.displayMsg();//static method calling using classname
	}

}
//ctrl+shift+f-->for formatting
//ctrl+space-->for template suggestions main(ctrl+space)
//ctrl+/
