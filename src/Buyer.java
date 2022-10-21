import java.util.Scanner;

public class Buyer extends Person {

	public void showMenu() {
		System.out.println("Bridge Design Pattern in action...");
		System.out.println("Welcome Buyer!");
		int menuType;
		System.out.println("Choose the type of menu!");
		Scanner menuInput = new Scanner(System.in);
		System.out.println("1. Meat, 2. Produce");
		menuType = menuInput.nextInt();
		System.out.println("Factory Design Pattern in Action...");
		if(menuType==1){
			MeatProductMenu meatProductMenu = new MeatProductMenu();
			meatProductMenu.showMenu();
			Person person = new Person();
			person.userStateChange(0);
		} else if (menuType==2) {
			ProduceProductMenu produceProductMenu = new ProduceProductMenu();
			produceProductMenu.showMenu();
			Person person = new Buyer();
			person.userStateChange(0);
		}
		else{
			System.out.println("Input Error");
		}
	}

	public ProductMenu CreateProductMenu() {
    return null;
	}

}
