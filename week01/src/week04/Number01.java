package week04;

import java.util.Random;
import java.util.Scanner;

public class Number01 {

	public static void main(String[] args) {

		Random random = new Random();
		int com = random.nextInt(3);
		System.out.println("하나를 선택하시요: 가위(0) 바위(1) 보(2) : ");
		
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		
		if(player==0 || player==1 || player==2) { 
			//컴퓨터의 패 표기
			if(com==0) {
				System.out.println("컴퓨터는는 가위를 냈습니다.");
			}else if(com==1) {
				System.out.println("컴퓨터는는 바위를 냈습니다.");
			}else if(com==2) {
				System.out.println("컴퓨터는는 보를 냈습니다.");
			}

			//가위바위보 승패판정
			if((player==0&&com==2)||(player==1&&com==0) ||(player==2&&com==1)) {
				System.out.println("당신이 이겼습니다.");
			}else if((player==2&&com==0)||(player==0&&com==1) ||(player==1&&com==2)) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(player==com){
				System.out.println("비겼습니다");
			}
		}
	}

}
