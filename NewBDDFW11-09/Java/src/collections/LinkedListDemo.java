package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> linkObj = new LinkedList<Object>();
		
		linkObj.add("123");
		linkObj.add("Hashmat");
		linkObj.add("Ahmad");
		linkObj.add("John");
		linkObj.add("James");
		linkObj.add("123");
		linkObj.add("Ramin");
		linkObj.add("Hashmat");
		
		Iterator <Object>itrObj = linkObj.iterator();
		while(itrObj.hasNext()){
			System.out.println(itrObj.next());
		}

	}

}
