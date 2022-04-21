import java.io.IOException;

class A {
	public void add() throws InterruptedException {
		for(int i=0;i<10;i++) {
			Thread.sleep(5000);
		System.out.println(i);
		}
	}
}

class B extends Thread  {
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(5001);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Object Updation"+i);
		}
	}
}

 class C {
	public static void main(String[] args) throws Exception {
		A a=new A();
		B b=new B();
		b.start();
		a.add();
	}
}