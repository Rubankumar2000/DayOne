package org.sampletest;

public class C extends A{
//	public void add(int a,int b) {
//		int c=a+b;
//		System.out.println(c);
//	}
//	public static void main(String[] args) {
//		C c=new C();
//		c.add(11, 22);
//	}
	
	public static void main(String[] args) {
		String s1="Java";
		String s2="Python";
		int i1 = System.identityHashCode(s1);
		int i2 = System.identityHashCode(s2);
		System.out.println(i1);
		System.out.println(i2);
		String string = s2.concat("Python");
		int i3= System.identityHashCode(string);
		System.out.println(i3);
		String sb1=new String("Java");
		String sb2=new String("Java");
		int si1 = System.identityHashCode(sb1);
		int si2 = System.identityHashCode(sb2);
		System.out.println(si1);
		System.out.println(si2);
		String append = sb1.concat(sb2);
		int si3 = System.identityHashCode(append);
		System.out.println(si3);
		
	}

}
