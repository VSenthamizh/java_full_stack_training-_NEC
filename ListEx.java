package com.ot9.collections;

import java.util.ArrayList;
import java.util.Iterator;

//Collection:
//1)collections will allow both homogeneous data and heterogeneous is allowed
//2)collections are not fixed in size/  growable in nature  AIOE  AL-10-->16--->25
//3)lots of methods
//List
//1)duplicates are allowed 
//2)insertion order is preserved 

public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// generic -->10-->16 -->(cc*3/2)+1
		list.add("suresh");
		list.add("naresh");
		list.add("mahesh");
		list.add("rajesh");
		list.add("somesh");
		list.add("suresh");
		list.add(2, "sandeep");

		System.out.println(list);

		ArrayList list1 = new ArrayList();// generic -->10-->16 -->(cc*3/2)+1
		list1.add("suresh");
		list1.add(true);
		list1.add("mahesh");
		list1.add(45);
		list1.add('a');
		list1.add("suresh");
		list1.add(2, "sandeep");

		System.out.println(list1);
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Object[] array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

//		System.out.println(list.contains("suresh"));
//		System.out.println(list.size());
//		System.out.println(list);
//		list.remove("sandeep");
//		System.out.println(list);
//		// list.clear();
//		System.out.println(list);
//		ArrayList<String> list1 = new ArrayList<String>();// generic -->10-->16 -->(cc*3/2)+1
//		list1.add("capgemini");
//		list1.add("cognizant");
//		System.out.println(list1);
//		list1.addAll(list);
//		System.out.println(list1);
//		// list1.removeAll(list);
//		// list1.retainAll(list);
//		System.out.println(list1.containsAll(list));
//		System.out.println(list1.isEmpty());

	}

}
