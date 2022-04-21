package org.sampletest;

public class A extends B{
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		A a=new A();
		a.add(12,25);
	}

}
