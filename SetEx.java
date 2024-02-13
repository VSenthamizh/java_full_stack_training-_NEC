package com.ot9.collections;

import java.util.TreeSet;

//Collection:
//1)collections will allow both homogeneous data and heterogenous is allowed
//2)collections are not fixed in size/  growable in nature  AIOE  AL-10-->16--->25
//3)lots of methods
//Set
//1)duplicates are not allowed 
//2)insertion order is  not preserved 

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();// generic -->10-->16 -->(cc*3/2)+1
		set.add("suresh");
		set.add("naresh");
		set.add("mahesh");
		set.add("akash");
		set.add("rajesh");
		set.add("somesh");
		set.add("suresh");
		set.add("bargav");
		set.add("sandeep");//NSO-->Comparable-->FI-->SAM

		System.out.println(set);// hashset--->hashmap

	}

}
