package org.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Method {

	private void m1() {

	}
	private int m2(int a,int b) {
		int c=a+b;
		int d=a*b;
		int e=a/b;
		
		
		return d;

	}
	private List<Integer> m3(List<Integer> li, int i) {
		li.add(10);
		li.add(20);
		li.add(30);
		
		return li;
		
	}
	private Set<Integer> m4(List<Integer> a) {
		Set<Integer> si=new LinkedHashSet<>();
		si.addAll(a);
		si.add(12);
		si.add(13);
		si.add(15);
		
		
		return si;
				
	}
	public static void main(String[] args) {
		Method m=new Method();
		m.m1();
		int i = m.m2(10, 20);
		System.out.println(i);
		List<Integer> li=new LinkedList<>();
		List<Integer> list = m.m3(li, i);
		System.out.println(li+" "+i);
		Set<Integer> set = m.m4(li);
		System.out.println(set);
		
		
		
		
	}
}
