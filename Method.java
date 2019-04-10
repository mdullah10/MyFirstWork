package Core.java;

public class Method {
	public static void main(String [] args) {
		Method obj=new Method();
		obj.test();
		int d = obj.sum();
		System.out.println(d);
		String s1 = obj.acb();
		System.out.println(s1);
		int z = obj.div(40,10);
		System.out.println(z);
		
	//non static methode - Void type
	}
	//1. no input- no output
	//2. void - does not return any value
	public void test(){
		System.out.println("test method");
	}
	//non static method -return type 
	public int sum(){
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	public String acb(){
		System.out.println("abc method");
		String s = "selenium";
		return s;
		
	}
	//some input some output
	public int div(int x, int y) {
		System.out.println("div method");
		int z = x/y;
		return z;
		
	
	}
}