package com.assigments;

public class Duplicate {

	public static void main(String[] args) {
		int arr[] = {12,34,56,78,89,12,34};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
