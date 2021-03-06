package week03;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.StringTokenizer;

class Student implements Serializable{
	String num;
	int grade;
	String name;
	String tel_number;
	
	public Student(String num, int grade, String name, String tel_number) {
		super();
		this.num = num;
		this.grade = grade;
		this.name = name;
		this.tel_number = tel_number;
	}
	
}
public class Number06 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("student0.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String num = null;
		int grade = 0;
		String name = null;
		String tel_number = null;
		
		int cnt=0;
		
		Student[] student = new Student[24];
		
		String line;
		while((line = br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(line, " ");
			while(st.hasMoreTokens()) {
				num = st.nextToken();
				grade =Integer.parseInt(st.nextToken());
				name = st.nextToken();
				tel_number =st.nextToken();
			}
			student[cnt++] = new Student(num, grade, name, tel_number);
		}
		
//		System.out.println("?л? ??ü?? ?? "+cnt+"?? ??????");
		
		
		for(int i=1;i<5;i++) {
			int studentNumber =0 ;
			for(Student x : student) {
				if(x.grade == 2) {
					System.out.println(x.num+ "\t" + x.grade + "\t" + x.name + "\t" + x.tel_number);
					studentNumber++;
				}
			}
			System.out.println("?? : "+studentNumber+"??\n");
		}
	}
}
