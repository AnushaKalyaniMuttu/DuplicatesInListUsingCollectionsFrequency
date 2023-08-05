package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicatesInListUsingCollectionsFrequency {

	public static void main (String [] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,1,2,3);
		list.stream().filter(n->Collections.frequency(list,n)>1).distinct().forEach(System.out::println);
		
	}
}
