import java.io.*;
import java.util.*;

public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	String username;

	String password;

	public boolean login() {
		System.out.println("Facade design pattern in action...");
		try {
			File buyerFile = new File("src/BuyerInfo.txt");
			File sellerFile = new File("src/SellerInfo.txt");
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please enter username");
			this.username = userInput.next();
			System.out.println("Please enter password");
			this.password = userInput.next();
			FileReader buyerDetails = new FileReader(buyerFile);
			FileReader sellerDetails = new FileReader(sellerFile);
			BufferedReader buyerBuffer = new BufferedReader(buyerDetails);
			BufferedReader sellerBuffer = new BufferedReader(sellerDetails);
			String currentLine;
			boolean flag = false;
			while((currentLine = buyerBuffer.readLine())!=null)
			{
				String[] lineArray = currentLine.split(":");
				String currentUsername = lineArray[0];
				String currentPassword = lineArray[1];
				if(currentUsername.equals(username) && currentPassword.equals(password)){
					flag = true;
					System.out.println("buyer found");
					userType = 0;
					break;
				}
			}
			while((currentLine !=null))
			{
				String[] lineArray = currentLine.split(":");
				String currentUsername = lineArray[0];
				String currentPassword = lineArray[1];
				if(currentUsername==username && currentPassword == password){
					flag = true;
					System.out.println("seller found");
					userType = 1;
					break;
				}
				currentLine = sellerBuffer.readLine();
			}
			if(!flag){
				System.out.println("Invalid Credentials");
				System.exit(0);
			}
			createUserInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	private void createUserInstance() {
		if(userType==0){
			int menuType;
			System.out.println("Choose the type of menu!");
			Scanner menuInput = new Scanner(System.in);
			System.out.println("1. Meat, 2. Produce");
			menuType = menuInput.nextInt();
			if(menuType==1){
				MeatProductMenu meatProductMenu = new MeatProductMenu();
				meatProductMenu.showMenu();
			} else if (menuType==2) {
				ProduceProductMenu produceProductMenu = new ProduceProductMenu();
				produceProductMenu.showMenu();
			}
			else{
				System.out.println("Input Error");
			}
			thePerson = new Buyer();
		}
		else if(userType==1) {
			thePerson = new Seller();
		}
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}

}
