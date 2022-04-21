package org.test;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int empId=sc.nextInt();
		System.out.println(empId);
		String empName=sc.nextLine();
		System.out.println(empName);
		String empEmail=sc.nextLine();
		System.out.println(empEmail);
		long empPhoneno=sc.nextLong();
		System.out.println(empPhoneno);
		float empSalary=sc.nextFloat();
		System.out.println(empSalary);
		String empGender=sc.next();
		System.out.println(empGender);
		String empCity=sc.nextLine();
		System.out.println(empCity);
		sc.close();
	}
}
