import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MeatProductMenu implements ProductMenu {
	ArrayList<String> productNames = new ArrayList<>();
	public void showMenu() {
		try{
			File productFile = new File("src/ProductInfo.txt");
			FileReader productDetails = new FileReader(productFile);
			BufferedReader productBuffer = new BufferedReader(productDetails);
			String productLine;
			while((productLine=productBuffer.readLine()) !=null){
				String[] productParts = productLine.split(":");
				String temp = productParts[0];
				if(temp.equals("Meat")){
					productNames.add(productParts[1]);
				}
			}
			ProductIterator productIterator = new ProductIterator();
			productIterator.iterator(productNames);
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
