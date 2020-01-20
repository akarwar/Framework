package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	

	public static void main(String[] args) {
		
		
		ArrayList <Object> listObj = new ArrayList<Object>();
		
		listObj.add("Ahmed");
		listObj.add("John");
		listObj.add("Eric");
//		listObj.add("James");
//		listObj.add("123");
//		listObj.add("Ramin");
//		listObj.add("Hashmat");
		
//		Iterator <Object> itrObj=listObj.iterator();
//		while(itrObj.hasNext()) {
//			System.out.println(itrObj.next());
			
			ArrayList <Object> listObj2 = new ArrayList<Object>();
			
			listObj2.add("Basir");
			listObj2.add("Hashim");
			listObj2.add("Johna");
			listObj2.addAll(listObj);
			System.out.println(listObj2.size());
			System.out.println(listObj.get(1));
			listObj.containsAll(listObj);		
			
			
			Iterator <Object> itrObj2=listObj.iterator();
			while(itrObj2.hasNext()) {
				System.out.println(itrObj2.next());
			}
		}
			

	}


