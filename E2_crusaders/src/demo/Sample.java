package demo;
class Utkarsh{
	int a = 1;
	void add() {
		System.out.println("hey i'm add from u1");
	}
}
class Utkarsha extends Utkarsh{
	int b = 10;
	void add() {
//		super.add();
		System.out.println("hey im add from u2");
	}
}
public class Sample {
	public static void main(String[] args) {
		Utkarsha u2 = new Utkarsha();
		u2.add();
	}
}