package demo;

class C {
	int num1 = 1;
	int num2 = 2;
}

class D extends C {
//	int num1 = 10;
	int num2 = 20;
	int num3 = 30;
}

public class CTC {
	public static void main(String[] args) {
//		Upcasting
		C c = new C();
//		System.out.println(c.num1);

//		downcasting
		D d = (D) c;
		System.out.println(d.num1);
		System.out.println(d.num2); // overriden member
		System.out.println(d.num3); // overriden member

	}
}
