import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.*;

public class Seller extends Person {

	public void showMenu() {
		System.out.println("Bridge Design Pattern in action...");
		System.out.println("Welcome Seller!");
		System.out.println("Factory Design Pattern in Action...");
		int menuType;
		System.out.println("Choose the type of menu!");
		Scanner menuInput = new Scanner(System.in);
		System.out.println("1. Meat, 2. Produce");
		menuType = menuInput.nextInt();
		if(menuType==1){
			MeatProductMenu meatProductMenu = new MeatProductMenu();
			meatProductMenu.showMenu();
			AddToProductMenu("Meat");
		} else if (menuType==2) {
			ProduceProductMenu produceProductMenu = new ProduceProductMenu();
			produceProductMenu.showMenu();
			AddToProductMenu("Produce");
		}
		else{
			System.out.println("Input Error");
			System.exit(0);
		}
	}

	public void AddToProductMenu(String productType) {
		String productName = "";
		Scanner addProductInput = new Scanner(System.in);
		System.out.println("Would you like to add a new product?(Yes/No)");
		String input = addProductInput.next();
		if(input.equals("Yes")){
			System.out.println("Please enter the name of the product");
			productName = addProductInput.next();
		}
		else{
			System.exit(0);
		}
		String productEntry = "\n"+productType + ":" + productName;
		try {
			Files.write(Paths.get("src/ProductInfo.txt"), productEntry.getBytes(), StandardOpenOption.APPEND);
			System.out.println("Product successfully added!");
			Person person = new Person();
			person.userStateChange(1);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
