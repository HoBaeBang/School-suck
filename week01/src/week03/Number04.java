package week03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number04 {

	public static void main(String[] args) throws IOException {//���� ����� ����ó��
		
		//���� �о����
		FileReader fr = new FileReader("D:/webhw/output3.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		float num[] = new float[100] ;		//���� ��ū�� �޴� �迭
		float number[] = new float[100];	//���� ��ū�� �޴� �迭
		int cnt=0;							//�迭 ������ ī����
		
		String line;
		while((line = br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(line, " : ");
			while(st.hasMoreTokens()) {
				num[cnt] = Float.parseFloat(st.nextToken()); // : ���� ��ū �Ľ� & �迭�� ���� �ֱ�
				number[cnt++] = Float.parseFloat(st.nextToken()); // : ���� ��ū �Ľ� & �迭�� ���� �ֱ�
			}	
		}
		
		//�ٽ� ũ�⿡ �´� �迭�� �����
		float number2[] = new float[cnt];
		for(int i=0;i<cnt;i++) {
			number2[i] = number[i];
		}
		//�迭 �������� �����ϱ�
		Arrays.sort(number2);
		//���Ӱ� ������ ���� output4.txt
		FileWriter fr1 = new FileWriter("D:/webhw/output4.txt");
		BufferedWriter br1 = new BufferedWriter(fr1);

		for (int k = 0; k < number2.length; k++) {
			String bb = Float.toString(number2[k]);
			br1.write((k+1) +" : " +bb);
			br1.newLine();
		}
		br1.close();
	}

}