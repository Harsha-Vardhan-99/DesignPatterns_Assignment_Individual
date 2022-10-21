public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	/********************* Visitor Design Pattern ******************************/

	public void visitMenu(int userType) {
		System.out.println("Visitor Design Pattern in action...");
		System.out.println("userType: " + userType);
		if(userType == 0){
			Buyer buyer = new Buyer();
			buyer.showMenu();
		}
		else if(userType == 1){
			Seller seller = new Seller();
			seller.showMenu();
		}
	}

	public void visitTrading(Trading trading) {

	}

	public void visitFacade() {
		System.out.println("Visitor Design Pattern in action...");
		Facade facade = new Facade();
		facade.login();
	}

}
