package week04;

import java.util.Random;
import java.util.Scanner;

public class Number01 {

	public static void main(String[] args) {

		Random random = new Random();
		int com = random.nextInt(3);
		System.out.println("�ϳ��� �����Ͻÿ�: ����(0) ����(1) ��(2) : ");
		
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		
		if(player==0 || player==1 || player==2) { 
			//��ǻ���� �� ǥ��
			if(com==0) {
				System.out.println("��ǻ�ʹ´� ������ �½��ϴ�.");
			}else if(com==1) {
				System.out.println("��ǻ�ʹ´� ������ �½��ϴ�.");
			}else if(com==2) {
				System.out.println("��ǻ�ʹ´� ���� �½��ϴ�.");
			}

			//���������� ��������
			if((player==0&&com==2)||(player==1&&com==0) ||(player==2&&com==1)) {
				System.out.println("����� �̰���ϴ�.");
			}else if((player==2&&com==0)||(player==0&&com==1) ||(player==1&&com==2)) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}else if(player==com){
				System.out.println("�����ϴ�");
			}
		}
	}

}
