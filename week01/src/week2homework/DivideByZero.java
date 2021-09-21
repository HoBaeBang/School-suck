package week2homework;

import java.util.*;

class DivideByZeroException extends Exception{
	public DivideByZeroException() {
		super("����� ���� ���ܰ� �߻��Ͽ����ϴ�.");
	}
}

public class DivideByZero {
   public static void main(String[] args) {
	   	try {
	   	int number1, number2, result;
	   	
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		number1 = sc.nextInt();
		  
		System.out.print("�ι�° ����: ");
		number2 = sc.nextInt();
		
		result = quotient(number1,number2);
		System.out.println(result);
		
	   	}catch(DivideByZeroException e) {
	   		System.out.println(e.getMessage());
	   	}
		}
	   	
		   
   public static int quotient(int numerator, int denominator) throws DivideByZeroException {
	   if(denominator == 0) {
		   throw new DivideByZeroException();
	   }
	   
	   return numerator/denominator;
   }
}