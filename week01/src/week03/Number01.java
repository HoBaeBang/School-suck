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
		
		int[] list = new int[100];	//���پ� ���� ������ �����ϱ� ���� ������ �迭 List�� ����
		
		int cnt = 0;
		String line = null;
		
		while((line = br.readLine())!=null) {		//���� �о���� �ݺ���
//		System.out.println(line); //�α�
		int value = Integer.parseInt(line);	//���ڿ��� ���� ������ ��ȯ
		list[cnt++] = value;
//		System.out.println(list);  //�α�
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