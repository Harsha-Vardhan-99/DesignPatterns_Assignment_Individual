import java.io.File;
import java.io.FileReader;

import java.io.*;
import java.util.*;
public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		try{
			File productFile = new File("ProductInfo.txt");
			FileReader productDetails = new FileReader(productFile);
			BufferedReader productBuffer = new BufferedReader(productDetails);
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
