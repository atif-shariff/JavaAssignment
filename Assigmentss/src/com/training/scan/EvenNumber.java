package com.training.scan;

public class EvenNumber {

		public static void main(String[] args) {
			  int[] arr = new int[20];
			  
			  for(int i =0;i<arr.length;i++) {
				  arr[i]=i;
				  if(arr[i]%2==0) {
					  System.out.println(arr[i]);
				  }
			  }  

		}

}