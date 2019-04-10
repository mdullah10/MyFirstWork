package Core.java;

public class DataType {

	// class-- access modifier of a object --blueprint of a object 
	public static void main(String[] args) {

		String firstName = "Md";
		String lastName = "Ullah";
		System.out.println(firstName+" "+lastName);
		
		System.out.println("firstName,lastName");
		System.out.println("firstNamelastName");
		
		//Byte 8 bit
		
		byte number = -128;
		byte number2 = 127;
		
		//Short -16 bit
		
		Short x = -32_768;
		Short y = 32_767;
		
		//int -32 bit
		
		int a = -2147483648;
		int b = 2147483647;
		
		//long 64 bit 
		long z = 32544665566545525l;
		
		//double 64 bit
		
		double d = 1.34;
		
		//float 32 bit
		
		float f = 2.677f;
		
		//character 16 bit
		
		char c = '\u00e5';// Unicode table 
		System.out.println(c);
		
		//boolean true or falls
		boolean s = false;
		boolean s1 = true;
		
		
		
		double volume = momin(number, number2);
		System.out.println("square is" + volume);
		
			
	}

	private static double momin(byte number, byte number2) {
		
		return (number*number2);
	}
}