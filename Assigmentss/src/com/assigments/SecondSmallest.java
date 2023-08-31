package com.assigments;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr = { 3,7,56,77};
		int Secondlargest = SecondSmallestElement(arr);

		System.out.println(Secondlargest);
	}

	public static int SecondSmallestElement(int[] arr) {
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
		
			return arr[1];
		}
	}

}