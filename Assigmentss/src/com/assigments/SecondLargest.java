package com.assigments;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = { 12,7};
		int Secondlargest = SecondLargestElement(arr);

		System.out.println(Secondlargest);
	}

	public static int SecondLargestElement(int[] arr) {
		int temp;
		if (arr.length < 2) {
			return -1;
		} 
		else {
			for(int i =0; i<arr.length;i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					 }
				  }
			 }
		
			return arr[arr.length - 2];
		}
	}

}
