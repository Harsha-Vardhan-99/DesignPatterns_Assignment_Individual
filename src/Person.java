import java.util.Scanner;

public class Person {

	public void userStateChange(int userType){
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to go back to choosing the menu," + "Press 2 to logout");
		int userStateChange = sc.nextInt();
		ReminderVisitor reminderVisitor = new ReminderVisitor();
		if(userStateChange == 1){
			reminderVisitor.visitMenu(userType);
		}
		else if(userStateChange == 2){
			reminderVisitor.visitFacade();
		}
	}

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}


}
