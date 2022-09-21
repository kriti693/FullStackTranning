package com.yash.oops;
/*
 * Class is created to show encapsulation and polymorphism behaviour 
 * 
 * */
public class JavaTarning {
	int no_ofTrainees;//number of traniees--instance varialble 
	static int duration=25;//time spenf for trang
	String trngName;//name of the trng
	
	public JavaTarning() {
		 System.out.println("That is a default constructor ");
	}
	public JavaTarning(int duration) {
		 System.out.println("That is a default constructor "+duration);
	}
	public JavaTarning(int duration,int no_ofTrainees) {
		 System.out.println("duration of the trng"+duration+"no of traniees we have :"+no_ofTrainees);
	}
	/*
	 * method is used to display trng details
	 * */
	void usetrng() {
		System.out.println("Java fullstack traning");
	}
	/*
	 * method is used to display keyboard
	 * */
	void useKeyboard() {
		System.out.println("keyboard");
	}
	/*
	 * method is used to display which class room to use for trng
	 * */
	void useClassRoom() {
		System.out.println("Online");
	}
	public static void main(String[] args) {
		JavaTarning java=new JavaTarning(25,89);
		
	}

}
