package demo;

import net.bytebuddy.implementation.bytecode.Division;

public class MethodOverloading {

	public static void add(int a) {
		System.out.println(a);
	}

	public static void add(String b) {
		System.out.println(b);
	}

	public void sub() {
		System.out.println("hey it's sub");
	}

	public void sub(int a) {
//		sub();
		System.out.println(a);
	}

	public static void main(String[] args) {
		add(1);
		add("hey");
		
		MethodOverloading mo = new MethodOverloading();
		mo.sub();
		mo.sub(1);
	}

}
