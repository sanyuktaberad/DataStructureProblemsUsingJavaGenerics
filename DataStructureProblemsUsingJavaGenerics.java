package com.bridgelabz;

import java.util.LinkedList;

public class DataStructureProblemsUsingJavaGenerics {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.add(56);
		linkedList.add(70);
		linkedList.set(2, 30);

		System.out.println("Elements in the list are =>" + linkedList);
	
	}
}
