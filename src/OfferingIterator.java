import java.io.*;
import java.util.*;
public class OfferingIterator {

	private OfferingList offeringList;

	public void iterator(ArrayList<String>productNames){
		int index = -1;
		while(hasNext(index+1,productNames.size()-1)){
			System.out.println(Next(index,productNames));
		}
	}

	public boolean hasNext(int index,int end) {
		if(index<end){
			return true;
		}
		return false;
	}

	public String Next(int index,ArrayList<String>productNames) {
		index++;
		return productNames.get(index);
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
