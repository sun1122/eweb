package com.zzu.test;

import org.junit.Test;

public class CsiiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void test2(){
		
	}
	
	@Test
	public void test1(){
		int[] arr ={23,9,65,99,5,9,67};
		
		for (int i = 0; i < arr.length-1; ++i) {
			for (int j = i+1; j < arr.length; ++j) {
				if(arr[j] >arr[i]){
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i]=arr[j];
				}
			}
		}
	}
}
