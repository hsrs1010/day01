package com.java.one;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;//1����Ʈ
		int i = 100;//4����Ʈ
		int tot=b+i;
		//����ȯ
		//�ڵ�����ȯ(����������ȯ)
		//����(����)����ȯ
		System.out.println(b+i);//�ڵ�����ȯ
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x41);//��������ȯ
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9 + (int)1.8);
	
		
	}

}
