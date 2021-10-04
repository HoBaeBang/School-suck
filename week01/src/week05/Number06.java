package week05;

import java.util.HashSet;
import java.util.Scanner;

public class Number06 {

	public static void main(String[] args) {
		boolean tf = true;
		while (tf) {
			System.out.println("구입 갯수 ?");
			Scanner sc = new Scanner(System.in);
			int cnt = sc.nextInt();

			HashSet<Integer> set1 = new HashSet<Integer>();
			int r;

			for (int x = 0; x < cnt; x++) {
				for (int i = 0; i < 6; i++) {
					r = (int) (Math.random() * 45) + 1;
					if (set1.contains(r)) {
						r = (int) (Math.random() * 45) + 1;
						set1.add(r);
					}
					set1.add(r);
				}

				System.out.println("Lotto "+ (x+1) + " = " + set1);
				set1.removeAll(set1);
			}
			System.out.println("다른 번호를 원하십니까?");
			Scanner yn = new Scanner(System.in);
			String re = yn.next();			
			String y = "y";
			String n = "n";
			if(re.equals(n)) {
				System.out.println("감사합니다.");
				break;
			}
		}
	}

}
