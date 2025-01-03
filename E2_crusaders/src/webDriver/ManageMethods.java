package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Options opt = driver.manage();
		Window win = opt.window();

//		win.maximize();
//		win.minimize();
//		win.fullscreen();

//		Dimension dim = win.getSize();
//		System.out.println(dim);
////
//		int h = dim.getHeight();
//		int w = dim.getWidth();
//		
//		System.out.println("height is : " + h);
//		System.out.println("width is : " + w);
//		
//		Dimension dim1 = new Dimension(1000, 500);
//	
//		win.setSize(dim1);
//		Thread.sleep(5000);
//		
//		win.setSize(dim);
//		Thread.sleep(5000);
//		
//		Point pt = win.getPosition();
//		
//		System.out.println(pt.getX());
//		System.out.println(pt.getY());
//		
//		Point pt1 = new Point(50,50);
//		win.setPosition(pt1);

		/**
		 * getPosition() setPosition()
		 */

		Point pt = win.getPosition();
		System.out.println(pt);
		
		Point pt2 = new Point(10,10);
		win.setPosition(pt2);
		
		Thread.sleep(2000);
		win.setPosition(pt);

		Thread.sleep(2000);
		driver.close();
	}

}
