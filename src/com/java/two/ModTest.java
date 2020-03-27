package com.java.two;

public class ModTest {

	public static void main(String[] args) {
		// % - 나머지 연산자
		int i=103;
		int j=5;
		
		int result=0;
		result=i%j;
		
		System.out.println("결과 : "+ result); //3
		++i;
		System.out.println("i : "+i); //104
		System.out.println("i : "+(++i));//105
		System.out.println("i : "+(i++));//105
		System.out.println("i : "+(i));//106
		
	}

}
