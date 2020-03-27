package com.java.one;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;//1바이트
		int i = 100;//4바이트
		int tot=b+i;
		//형변환
		//자동형변환(묵시적형변환)
		//강제(수동)형변환
		System.out.println(b+i);//자동형변환
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x41);//강제형변환
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9 + (int)1.8);
	
		
	}

}
