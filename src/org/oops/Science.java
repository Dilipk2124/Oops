package org.oops;

public class Science implements Maths {
	public int a, b;
    @Override
	public int add(int a, int b) {
		System.out.print("The Addition of given numberis :");
		System.out.println(a + b);
		return a + b;

	}

	@Override
	public int sub(int a, int b) {
		System.out.print("The Subtraction of given numberis :");
		System.out.println( a - b);
		return a - b;
	}

	@Override
	public int mult(int a, int b) {
		System.out.print("The Multi of given numberis :");
		System.out.println(a * b);
		return a * b;
	}
}