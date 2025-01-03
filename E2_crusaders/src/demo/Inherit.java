package demo;

class A {
	int num1;

	A(){
		System.out.println("Use of super() :" + num1);
	}

	void add() {
		System.out.println("add method in A");
	}
}

class B extends A {
	B(){
		super();
	}
	
	int num2 = 2;
	
	void sub() {
		System.out.println("next you will see use of super keyword");
		super.add();
		System.out.println("you have seen use of super keyword");
	}
}

public class Inherit {
	public static void main(String[] args) {
//		A a = new A(1);
//		System.out.println(a.num1);

		B b = new B();
		b.sub();
//		System.out.println(b.num2);
//		System.out.println(b.num1);
	}
}
