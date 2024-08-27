package OOP_Encapsulation;

// Page Object Model is classic example of encapsulation(Private locators, constructors and public methods)

// encapsulating: binding private data with public layer 
public class LoginPage {
	private String username;
	private String password;

	// create constructors to avoid unnecessary object creation.
	public LoginPage(String username, String password) {

		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("Enter Username" + " " + un);
		System.out.println("Enter Username" + " " + pwd);
		System.out.println("click on login button...");
		if (isUserActive(un)) {
			System.out.println("User is logged in............");
		} else {
			System.out.println("User is inactive.. account is blocked............");
		}

	}

	private boolean isUserActive(String un) {
		System.out.println("checking user status: " + un);
		return true;
	}
}
