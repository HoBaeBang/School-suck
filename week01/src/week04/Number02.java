package week04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Number02 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��Ͻÿ� : ");
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(inputString," ");
		
		int cnt=0;
		
		String[] stringList = new String[100];
		
		while(st.hasMoreTokens()) {
			String aa = st.nextToken();
			System.out.println(aa);
			stringList[cnt] = aa;
			cnt++;
		}
		System.out.println("��� "+cnt+"���� �ܾ �ֽ��ϴ�.");
		
		String[] stringList2 = new String[cnt];
		for(int i=0; i<cnt;i++) {
			stringList2[i]=stringList[i];
		}
		
		Arrays.sort(stringList2);
		System.out.println("====== ���� �� ������ =========");
		System.out.println(Arrays.toString(stringList2));
	}

}