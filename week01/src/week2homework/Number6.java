package week2homework;

import java.util.*;
class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("음수 입력 오류입니다.");
	}
}

public class Number6 {

	public static void main(String[] args) {
		
		try {
		String a = "";
		System.out.print("정수의 개수: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();
		int[] intarr = new int[num];
		
		
		for( int i= 0; i< num; i++) {
			System.out.print("정수를 입력하시오 : ");
			intarr[i] = sc.nextInt();
			if(intarr[i]<=0) {
				throw new NegativeNumberException();
			}
		}
		
		System.out.println(average(intarr));
		}catch(ArithmeticException e) {
			System.out.println("by zero 산술오류");
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
