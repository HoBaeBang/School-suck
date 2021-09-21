package week2homework;

import java.util.*;
class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("���� �Է� �����Դϴ�.");
	}
}

public class Number6 {

	public static void main(String[] args) {
		
		try {
		String a = "";
		System.out.print("������ ����: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		int[] intarr = new int[num];
		
		
		for( int i= 0; i< num; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			intarr[i] = sc.nextInt();
			if(intarr[i]<=0) {
				throw new NegativeNumberException();
			}
		}
		
		System.out.println(average(intarr));
		}catch(ArithmeticException e) {
			System.out.println("by zero �������");
		}catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	public static int average(int[] intarr) throws NegativeNumberException {
		int result = 0;
		for(int x : intarr) {
			result += x;
		}
		result = result/intarr.length;
		return result;
	}

}
