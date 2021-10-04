package week05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Number08 {

	public static void main(String[] args) throws Exception {
		
		Map<String, String> st = new HashMap<String, String> ();
		
		FileReader fr = new FileReader("Dic.dat");
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;		
		StringTokenizer stk;
		
		String k =null, v =null;
		while((line = br.readLine())!=null) {		//���� �о���� �ݺ���
			String value = line;	
			stk = new StringTokenizer(value," \t");
			k = stk.nextToken();
			v = stk.nextToken();
			st.put(v,k);
			}
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�ѱ� ? ");
			String key = sc.next();
			if(key.equals("�׸�")) {
				System.out.println("����!");
				break;
			}
			if(st.get(key) != null)
				System.out.println("english : "+ st.get(key));
			else 
				System.out.println("���� �ܾ�!");
						
		}while(true);
		sc.close();
	}
}