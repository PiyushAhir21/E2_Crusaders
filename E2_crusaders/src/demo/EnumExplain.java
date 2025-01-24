package demo;

public class EnumExplain {

	public static void main(String[] args) {
		
		System.out.println(BrowserKeys.ENTER); // Outputs: ENTER
	}

	public enum BrowserKeys {
	    ENTER,
	    TAB,
	    CONTROL,
	    SHIFT;
	}
}
