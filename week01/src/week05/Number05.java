package week05;

import java.util.*;
import java.util.TreeSet;

public class Number05 {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		int r;

		for (int i = 0; i < 6; i++) {
			r = (int) (Math.random() * 45) + 1;
			if (set1.contains(r)) { 
				r = (int) (Math.random() * 45) + 1;
				set1.add(r);
			}
			set1.add(r);
		}

		for (int i = 0; i < 6; i++) {
			r = (int) (Math.random() * 45) + 1;
			if (set2.contains(r)) { 
				r = (int) (Math.random() * 45) + 1;
				set2.add(r);
			}
			set2.add(r);
		}

		System.out.println("Lotto ��ȣ(HashSet) = " + set1);
		System.out.println("Lotto ��ȣ(TreeSet) = " + set2);

	}

}
