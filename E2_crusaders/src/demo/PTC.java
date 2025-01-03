package demo;

import org.openqa.selenium.WebDriver;

public class PTC {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double x = (double) 20;
//		System.out.println(x);
//		
//		int a = (int) 59.8d;
//		System.out.println(a);
//		a = (int) 99.9f;
//		System.out.println(a);
//		a = (int) 68L;
//		
//		double y = (double) 36.6f;
//		System.out.println(y);
//		
//		float z = (float) 40;
//		System.out.println(z);
		
        byte byteVar = 100; // range: -2^7 to 2^7-1 or -128 to 127
        int byt = byteVar;
        
        short shortVar = 10000; // range: -2^15 to 2^15-1 or -32568 to 32567
        int sot = shortVar;

        int intVar = 100000; // range: -2^31 to 2^31-1 or -2147483648 to 2147483647
        
        long longVar = 10000000000L; // range: -2^63 to 2^63-1
        
        float floatVar = 3.14f; 
        double doubleVar = 3.14d;
        
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        
        System.out.println(floatVar);
        System.out.println(doubleVar);

		
		
		
	}

}
