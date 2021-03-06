package week03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Number01 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int[] list = new int[100];	//한줄씩 읽은 정수를 저장하기 위해 정수형 배열 List를 선언
		
		int cnt = 0;
		String line = null;
		
		while((line = br.readLine())!=null) {		//파일 읽어오는 반복문
//		System.out.println(line); //로그
		int value = Integer.parseInt(line);	//문자열을 정수 값으로 변환
		list[cnt++] = value;
//		System.out.println(list);  //로그
		}


		int[] list2 = new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			list2[i] = list[i];
		}
		Arrays.sort(list2);		
		
		FileWriter fr1 = new FileWriter("D:/webhw/output1.txt");
		BufferedWriter br1 = new BufferedWriter(fr1);

		
		for (int k = 0; k < list2.length; k++) {
			String bb = Integer.toString(list2[k]);
			br1.write((k+1) +" : " +bb);
			br1.newLine();
		}
		
		br1.close();
	}
}
