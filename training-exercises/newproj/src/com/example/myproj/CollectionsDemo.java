package com.example.myproj;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("Mango");
		al.add(0,"grapes");
		for(String i:al) {
			System.out.println(i);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.forEach(x->{System.out.println(x);});
	}




}

