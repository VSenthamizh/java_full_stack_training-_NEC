package com.ot9.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();// 16
		emps.put(123, "sandeep");// entry
		emps.put(23, "suresh");
		emps.put(14, "kalyan");
		emps.put(5, "somesh");
		emps.put(64, "rajesh");
		emps.put(123, "mahesh");
		System.out.println(emps);
		
		
		
		Collection<String> al =emps.values();
		for(String name:al)
		{
			System.out.println(name);
		}
		
//		Set<Integer> keys = emps.keySet();
//
//		Iterator<Integer> itr = keys.iterator();
//
//		while (itr.hasNext()) {
//			int key = itr.next();
//			System.out.println(emps.get(key));
//		}

		Set<Entry<Integer, String>> keys = emps.entrySet();

		Iterator<Entry<Integer, String>> itr = keys.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// emps.remove(123);
		System.out.println(emps);
		System.out.println(emps.containsKey(1231));
		System.out.println(emps.containsValue("mahesh"));
		System.out.println(emps);
		System.out.println(emps.get(64));
		HashMap<Integer, String> emps1 = new HashMap<Integer, String>();// 16
		emps1.put(143, "navya");
		emps1.putAll(emps);
		System.out.println(emps1);

	}

}
