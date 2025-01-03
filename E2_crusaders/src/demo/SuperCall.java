package demo;

class E2{
	E2(){
		System.out.println("cool....");
	}
}

class A3 extends E2{
	A3(){
//		super();
	}
}

class M1 extends A3{
	M1(){
		
	}
}

public class SuperCall {
	public static void main(String[] args) {
//		A3 a = new A3();
		M1 m = new M1();
	}
}
