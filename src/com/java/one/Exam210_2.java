package com.java.one;

public class Exam210_2 {
	public static void main(String[] args) {
		int width=100;
		int height=200;
		double result=0.0;
		float p=3.141592f;
		result=+width*height/2;//���
		
		System.out.println("�ﰢ�� ���� : "+result+"��");
		result=width*height;
		System.out.println("�簢�� ���� : "+result);
		
		//���� ����
		//���� : 3.14
		double p2=3.14;
		int r=10;
		result=p2*r*r;
		
		System.out.println("���� ���� : "+result);
		//�Ҽ��� ��°�ڸ����� ���
		System.out.printf(String.format("��°�ڸ� : " +"%.2f\n", result));
		
		//�������� ����
		result=r*r*Math.PI*height;
	System.out.println("�������� ���� : "+result+"��");
	
	//15+5*2=25
	}
	
}