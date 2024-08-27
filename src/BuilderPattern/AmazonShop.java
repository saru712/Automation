package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {
		Shooping shop = new Shooping();
		// sc1

		shop.login("sarikaname@gmail.com", "Sarika!21832").search("Tshirt").addToCart("Tshirt").dopayment("63226238")
				.generateOrder().Logout();

		// sc2
		shop.login("sarikaname@gmail.com", "Sarika!21832").search("Tshirt").addToCart("Tshirt").Logout();
		// sc3

				shop.login("sarikaname@gmail.com", "Sarika!21832").dopayment("289").generateOrder().Logout();
				// sc4

				shop.login("sarikaname@gmail.com", "Sarika!21832").Logout();

				// sc5

				shop.login("sarikaname@gmail.com", "Sarika!21832").Logout().login("sarikaname@gmail.com", "Sarika!21832");
	}
}


