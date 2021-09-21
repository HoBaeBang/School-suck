package week2homework;

import java.util.Scanner;

public class Number2 {
	public int getAverage(int[] inputArray) {
		int result =0, sum = 0;
		
		for(int x : inputArray) {
			sum += inputArray[x]; 
		}
		System.out.println("전체 총 합산"+sum);
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
			System.out.println("오류입니다.");
		}catch(NegativeArraySizeException e) {
			System.out.println("음수는 입력 할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("한자리 정수를 입력해 주십시오");
		}catch(NullPointerException e) {
			System.out.println("값을 입력 바랍니다.");
		}
		
	}

}
