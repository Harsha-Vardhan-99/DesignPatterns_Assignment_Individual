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
			File buyerFile = new File("BuyerInfo.txt");
			File sellerFile = new File("SellerInfo.txt");
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
			while((currentLine = buyerBuffer.readLine())!=null)
			{
				String[] lineArray = currentLine.split(":");
				String currentUsername = lineArray[0];
				String currentPassword = lineArray[1];
				if(currentUsername==username && currentPassword == password){
					System.out.println("buyer found");
					userType = 0;
				}
			}
			currentLine = sellerBuffer.readLine();
			while((currentLine !=null))
			{
				String[] lineArray = currentLine.split(":");
				String currentUsername = lineArray[0];
				String currentPassword = lineArray[1];
				if(currentUsername==username && currentPassword == password){
					System.out.println("seller found");
					userType = 0;
				}
				currentLine = sellerBuffer.readLine();
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
