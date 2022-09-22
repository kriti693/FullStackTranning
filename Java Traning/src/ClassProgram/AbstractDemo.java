package ClassProgram;

abstract class JavaTrng {
	static String name = "Java";
	String mas = "Welcome ";

	public JavaTrng(String name, String mas) {
		this.name = name;
		this.mas = mas;
		System.out.println(name+" "+mas);
	}

	abstract void usetrng();

	void printMassage() {
		System.out.println("I am in java Traning");
	}

	abstract void useKeyboard();
}

class Podetrng extends JavaTrng {

	public Podetrng(String name, String mas) {
		super(name, mas);
		 
	}

	@Override
	void usetrng() {
		 System.out.println("NodeTrng method");

	}

	@Override
	void useKeyboard() {
		 System.out.println("Nodetrang keyboard");

	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		Podetrng n=new Podetrng("Kritika","welcome");
		
		
	}

}
