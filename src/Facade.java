import java.io.*;
import java.util.*;

public class Facade {
    /****************** Facade Design Pattern **********************/
	public int userType;

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
			/********************* Bridge Design Pattern ******************************/
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
			currentLine = sellerBuffer.readLine();
			while((currentLine !=null))
			{
				String[] lineArray = currentLine.split(":");
				System.out.println(lineArray[1]);
				String currentUsername = lineArray[0];
				String currentPassword = lineArray[1];
				if(currentUsername.equals(username) && currentPassword.equals(password)){
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
			thePerson = new Buyer();
			thePerson.showMenu();
		}
		else if(userType==1) {
			thePerson = new Seller();
			thePerson.showMenu();
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
