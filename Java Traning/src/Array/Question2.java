package Array;

import java.util.Arrays;

/**
 * WAP to create a dynamic array. Dynamic Array means when user want to input
 * the number more than size of array it will increase the size of array without
 * throwing exception.
 * 
 *  
 *
 */
public class  Question2 {
	private int array[];
	private int size;
	private int capacity;

	public  Question2() {
		array = new int[2];
		size = 0;
		capacity = 2;
	}

	public void addElement(int element) {
		if (size == capacity) {
			ensureCapacity(2);
		}
		array[size] = element;
		size++;
	}

	public void ensureCapacity(int minCapacity) {
		int temp[] = new int[capacity * minCapacity];
		for (int i = 0; i < capacity; i++) {
			temp[i] = array[i];
		}
		array = temp;
		capacity = capacity * minCapacity;
	}

	public void printElements() {
		System.out.println("elements in array are :" + Arrays.toString(array));
	}

	public static void main(String args[]) {
		Question2 d = new  Question2();
		d.addElement(1);
		d.addElement(2);
		d.printElements();
	}
}
