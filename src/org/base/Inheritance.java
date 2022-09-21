package org.base;

public class Inheritance {

	public static void main(String[] args) {
		Bank b;
		b = new StateBank();
		b.savings();
		b.fixedDeposit();
		b = new IndianBank();
		b.fixedDeposit();
		b.savings();
		b = new ICICI();
		b.fixedDeposit();

	}
}