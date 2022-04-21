package org.sampletest;

public class B {
//	public static class C {
//	int a=20;
//		  public  static int main1(String[] args) {
//			int c=20;
//			System.out.println("Hi this is nested class.");
//			return c;
//			
//		}
//		 public static void main2(String[] args) {
//			 int main1 = main1(args);
//			 System.out.println(main1);
//			 System.out.println("C value is"+main1(args));
//			 
//		}
//		 static public void main(String[] args) {
//			main2(args);
//			C s=new C();
//			System.out.println(s.a);
//		}
//	}
	static int b=20;
	public void C() {
		System.out.println("C is a method"+b);
	}
	public static void main(String[] args) {
		B b=new B();
		b.C();
	}
	
}

