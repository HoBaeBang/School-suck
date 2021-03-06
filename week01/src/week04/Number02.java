package week04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Number02 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하시요 : ");
		
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
		System.out.println("모두 "+cnt+"개의 단어가 있습니다.");
		
		String[] stringList2 = new String[cnt];
		for(int i=0; i<cnt;i++) {
			stringList2[i]=stringList[i];
		}
		
		Arrays.sort(stringList2);
		System.out.println("====== 정렬 후 데이터 =========");
		System.out.println(Arrays.toString(stringList2));
	}

}
