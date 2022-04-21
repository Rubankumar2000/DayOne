package org.sampletest;

	public class GrandParent {
		public void grandparent() {
			int a=20,b=30,c;
			c=a+b;
			System.out.println(c);
		}
		public void parents() {
			int n1=100,n2=200,n;
			n=n1+n2;
			System.out.println(n);
		}
		public static void main(String[] args) {
			GrandParent gp=new GrandParent();
			gp.parents();
			gp.grandparent();
		}
}
class Parent extends GrandParent {
	public void parent() {
		int p1=1000,p2=2000,p;
		p=p1+p2;
		System.out.println(p);
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.parent();
		p.grandparent();
		p.parents();
		
	}
}
class Child extends Parent {
	private void child() {
		int c1=784,c2=748,c;
		c=c1+c2;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.child();
		c.parent();
		c.grandparent();
		c.parents();
	}
}