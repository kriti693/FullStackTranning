package String;

public class Question6 {

	public static void stringPool() {
		String str="kritika";
		String str1="kritika";
		if(str==str1) {
			System.out.println("this is in string pool");
		}
		else {
			System.out.println("no");
		}
	}
	
	public static void heapMemory() {
		String str=new String("kritika");
		String str1=new String("kritika");
		if(str==str1) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		stringPool();
		heapMemory();
	}
}
