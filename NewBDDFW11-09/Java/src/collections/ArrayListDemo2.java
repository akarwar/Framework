package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
ArrayList <Object> listObj = new ArrayList<Object>();
		
		listObj.add("Ahmed");
		listObj.add("John");
		listObj.add("Eric");
		listObj.add("Ahmed");
		listObj.add("Ahmed");
		
		
		listObj.remove("Ahmed"); // will remove the names 
		listObj.remove(0);
		listObj.removeAll(listObj);
		Iterator <Object> itrObj=listObj.iterator();
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
			
	}}

}
