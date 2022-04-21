package org.sampletest;

public class B {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		B b=new B();
		b.add(12, 120);
		b.add(21,12,23);
	}
}

