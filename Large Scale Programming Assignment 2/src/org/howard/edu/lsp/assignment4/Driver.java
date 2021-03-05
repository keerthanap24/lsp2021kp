package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void main(String args[]) {
		IntegerSet set = new IntegerSet();
		set.add(2);
		set.add(4);
		set.add(7);
		set.add(1);
		IntegerSet b = new IntegerSet();
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(2);
		System.out.println(set.intersect(b));
		
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(4);
		set2.add(5);
		set2.add(9);
		try {
			System.out.println(set2.largest());
		}catch(IntegerSetException e) {
			e.printStackTrace();
		}
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(5);
		set3.add(2);
		set3.add(9);
		set3.add(1);
		IntegerSet c = new IntegerSet();
		c.add(2);
		c.add(9);
		c.add(6);
		c.add(1);
		System.out.println(set3.equals(c));
		
		
		IntegerSet set4 = new IntegerSet();
		set4.add(10);
		set4.add(7);
		set4.add(8);
		set4.add(2);
		set4.add(20);
		System.out.println(set4);
		set4.clear();
		System.out.println(set4);
		
		
		IntegerSet set5 = new IntegerSet();
		set5.add(10);
		set5.add(7);
		set5.add(8);
		set5.add(2);
		set5.add(20);
		System.out.println(set5.contains(8));
		
		
		IntegerSet set6 = new IntegerSet();
		set6.add(11);
		set6.add(42);
		set6.add(3);
		set6.add(9);
		try {
			System.out.println(set6.smallest());
		}catch(IntegerSetException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
