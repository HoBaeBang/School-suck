package week2homework;

import java.util.Scanner;

public class Number2 {
	public int getAverage(int[] inputArray) {
		int result =0, sum = 0;
		
		for(int x : inputArray) {
			sum += inputArray[x]; 
		}
		System.out.println("��ü �� �ջ�"+sum);
		result = sum/inputArray.length;
		
		return result;
	}
	
	public static void main(String[] args) {
		

		Number2 number2 = new Number2();
		try {
		int[] a = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			a[i] = scanner.nextInt();
//			if(a[i] == null) {
				
//			}
		}
		System.out.println(number2.getAverage(a));
		
		}catch(ArithmeticException e) {
			System.out.println("�����Դϴ�.");
		}catch(NegativeArraySizeException e) {
			System.out.println("������ �Է� �� �� �����ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ڸ� ������ �Է��� �ֽʽÿ�");
		}catch(NullPointerException e) {
			System.out.println("���� �Է� �ٶ��ϴ�.");
		}
		
	}

}
