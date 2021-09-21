package week03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Number05 {
	public static void main(String args[]) throws IOException {
		
		//파일 읽어오기
				FileReader fr = new FileReader("D:/webhw/output3.txt");
				BufferedReader br = new BufferedReader(fr);
				
				
				float num[] = new float[100] ;		//앞쪽 토큰을 받는 배열
				float number[] = new float[100];	//뒷쪽 토큰을 받는 배열
				int cnt=0;							//배열 사이즈 카운팅
				
				String line;
				while((line = br.readLine())!=null) {
					StringTokenizer st = new StringTokenizer(line, " : ");
					while(st.hasMoreTokens()) {
						num[cnt] = Float.parseFloat(st.nextToken()); // : 앞의 토큰 파싱 & 배열에 집어 넣기
						number[cnt++] = Float.parseFloat(st.nextToken()); // : 뒤의 토큰 파싱 & 배열에 집어 넣기
					}	
				}
				
				//다시 크기에 맞는 배열을 만들기
				Float number2[] = new Float[cnt];
				for(int i=0;i<cnt;i++) {
					number2[i] = number[i];
				}
				//배열 오름차순 정렬하기
				Arrays.sort(number2, Collections.reverseOrder());
				//새롭게 생성할 파일 output4.txt
				FileWriter fr1 = new FileWriter("D:/webhw/output5.txt");
				BufferedWriter br1 = new BufferedWriter(fr1);

				for (int k = 0; k < number2.length; k++) {
					String bb = Float.toString(number2[k]);
					br1.write((k+1) +" : " +bb);
					br1.newLine();
				}
				br1.close();				
	}

}
