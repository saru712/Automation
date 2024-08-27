package BuilderPattern;

public class Shooping {

	public Shooping login() {
		System.out.println("Login into App ");
		return this;// current class object (shooping) class object
	}

	public Shooping login(String um, String pwd) {
		System.out.println("Login into App with " +" "+ um + " " + pwd);
		return this;
	}

	public Shooping Search() {
		System.out.println("Product Search ");
		return this;
	}

	public Shooping search(String name) {
		System.out.println("Product search" + name);
		return this;
	}

	public Shooping dopayment(String cvv, String upi) {
		System.out.println("Make payment with " + cvv + " " + upi);
		return this;
	}

	public Shooping dopayment(String upi) {
		System.out.println("Make payment with" + upi);
		return this;
	}

	public Shooping generateOrder() {
		System.out.println("order is generated");
		return this;
	}

	public Shooping addToCart(String name) {
		System.out.println("adding to cart:" + name);
		return this;
	}
	public Shooping Logout() {
		System.out.println("Logout ");
		return this;// current class object (shooping) class object
	}
}
