import java.util.ArrayList;

public class ProductIterator {

	private ClassProductList classProductList;

	/********************* Iterator Design Pattern ******************************/

	public void iterator(ArrayList<String> productNames){
		int index = 0;
		System.out.println("Loading Menu...");
		System.out.println("Iterator Design pattern in action...");
		System.out.println("Menu:");
		while(hasNext(index,productNames.size())){
			System.out.println(productNames.get(index));
			index++;
		}
	}

	public boolean hasNext(int index,int end) {
		if(index<end){
			return true;
		}
		return false;
	}

	public String Next() {
		return "";
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
