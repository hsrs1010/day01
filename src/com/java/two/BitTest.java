package com.java.two;

public class BitTest {

	public static void main(String[] args) {
		byte a=10;//0000 1010
		byte b=9;// 0000 1001
		byte c=1;// 0000 0001
		
		System.out.println(a+"&"+b+"="+(a&b));
		System.out.println(a+"|"+b+"="+(a|b));
		System.out.println(a+"^"+b+"="+(a^b));
		
		//왼쪽시프트
		System.out.println(a+"<<"+c+"="+(a<<c));
		//오른쪽시프트
		System.out.println(a+">>"+c+"="+(a>>c));
	
	}

}
