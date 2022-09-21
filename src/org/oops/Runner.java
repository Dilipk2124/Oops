package org.oops;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Science s = new Science();
		System.out.println("Enter Number1:");
		int a =sc.nextInt();
		System.out.println("Enter Number2:");
		int b =sc.nextInt();
		s.add(a, b);
		s.sub(a, b);
		s.mult(a, b);
	}

}
