package week03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Number03 {

	public static void main(String[] args) throws IOException {

		FileReader fr1 = new FileReader("D:/webhw/output1.txt");
		BufferedReader br1 = new BufferedReader(fr1);

		FileReader fr2 = new FileReader("D:/webhw/output2.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		
//		float[] flist1 = new float[100];	//1번 담을 리스트
//		float[] flist2 = new float[100];	//2번 담을 리스트

		FileWriter fr3 = new FileWriter("D:/webhw/output3.txt");
		BufferedWriter br3 = new BufferedWriter(fr3);

		
		String c;
		
		while((c=br1.readLine())!=null) {
			br3.write(c+"\n");
		}
		
		while((c=br2.readLine())!=null) {
			br3.write(c+"\n");
		}
		
		br3.flush();
	}

}
