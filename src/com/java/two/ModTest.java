package com.java.two;

public class ModTest {

	public static void main(String[] args) {
		// % - ������ ������
		int i=103;
		int j=5;
		
		int result=0;
		result=i%j;
		
		System.out.println("��� : "+ result); //3
		++i;
		System.out.println("i : "+i); //104
		System.out.println("i : "+(++i));//105
		System.out.println("i : "+(i++));//105
		System.out.println("i : "+(i));//106
		
	}

}
