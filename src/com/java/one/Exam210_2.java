package com.java.one;

public class Exam210_2 {
	public static void main(String[] args) {
		int width=100;
		int height=200;
		double result=0.0;
		float p=3.141592f;
		result=+width*height/2;//계산
		
		System.out.println("삼각형 면적 : "+result+"㎡");
		result=width*height;
		System.out.println("사각형 면적 : "+result);
		
		//원의 넓이
		//파이 : 3.14
		double p2=3.14;
		int r=10;
		result=p2*r*r;
		
		System.out.println("원의 넓이 : "+result);
		//소수점 둘째자리까지 출력
		System.out.printf(String.format("둘째자리 : " +"%.2f\n", result));
		
		//원통형의 넓이
		result=r*r*Math.PI*height;
	System.out.println("원통형의 부피 : "+result+"㎥");
	
	//15+5*2=25
	}
	
}