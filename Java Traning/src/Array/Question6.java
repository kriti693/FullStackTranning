package Array;

/**
 * WAP to find third maximum number from list of numbers.
 * 
 *
 */
public class Question6 {
	public static void main(String args[]) {
		int num[] = { 4, 5, 6, 1, 2, 3, 9, 8 };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(num[2]);
	}

}
