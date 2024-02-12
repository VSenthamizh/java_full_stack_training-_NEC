package pack2;

import pack1.Test;//ctrl+shift+o

public class Client extends Test {

	public static void main(String[] args) {
		Client cl=new Client();
		cl.m1();//different package sub-class
	}
}
class Sample3 
{

	public void m3()
	{
		Test test=new Test();
		test.m1();//different package non-subclass
	}
}
