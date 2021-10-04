package week05;
import java.util.*;

public class Number07 {

	public static void main(String[] args) {
		
		Map<String, String> st = new HashMap<String, String> ();

		st.put("map", "지도");
		st.put("java", "자바");
		st.put("school", "학교");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("영어단어 ? ");
			String key = sc.next();
			if(key.equals("quit")) {
				System.out.println("done!");
				break;
			}
			if(st.get(key) != null)
				System.out.println("한글 : "+ st.get(key));
			else 
				System.out.println("Not exist!");
						
		}while(true);
		sc.close();
	}

}
