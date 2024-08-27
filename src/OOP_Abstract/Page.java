package OOP_Abstract;

public abstract class Page {

	// can not create the object of abst.. class
	// but can create the const....of abstract class
	// and this constructor will be called when we create object of child class
	
	public Page() {
		System.out.println("Page constructor....");
	}
	
	public Page(int i) {
		System.out.println("P constructor...."+ i);
	}

	public abstract void title();

	public abstract void Url();

	public void CalculatePagTimeOut() {
		System.out.println("page time out -- 10 secs");
	}

	public final void displayLOgo() {
		System.out.println("display logo");
	}

	public static void footer() {
		System.out.println("page footer");
	}

}
