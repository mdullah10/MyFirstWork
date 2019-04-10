package Core.java;

public class Bmw {
	int year=2019;
	String model= "xdrive";
	static int door=4;
	
	public Bmw(){
}
	public Bmw(int year) {
		this.year= year;
		System.out.println(year);
	}
	public Bmw(String model) {
		this.model=model;
		System.out.println(model);
	}

}
