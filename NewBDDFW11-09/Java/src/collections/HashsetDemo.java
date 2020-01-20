package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetDemo {

	public static void main(String[] args) {
		
		TreeSet<Object> Obj = new TreeSet<Object>();
		
		Obj.add("Ahmed");
		Obj.add("John");
		Obj.add("James");
		Obj.add("Ahmed");
		Obj.add("Frank");
		Obj.add("Larry");
		Obj.add("Steve");
		Obj.add("Ahmed");
		
		Obj.remove("Ahmed"); // will remove Ahmed from the Collection
		Iterator <Object>itrObj = Obj.iterator();
		while(itrObj.hasNext()){
			System.out.println(itrObj.next());
			
			
		}
		

	}
}
