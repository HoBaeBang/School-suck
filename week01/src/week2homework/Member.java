package week2homework;

import java.util.*;

class NotExistIDException extends Exception{
	public NotExistIDException() {
		super("ID�� ����");
	}
}

class WrongPasswordException extends Exception{
	public WrongPasswordException() {
		super("Password�� �߸���");
	}
}
public class Member {

	public static void main(String[] args) {

		String id, passwd;
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ID �Է�: ");
			id = sc.next();
			loginId(id);
			
			System.out.print("password �Է�: ");
			passwd = sc.next();
			loginPw(passwd);
			
		}catch(NotExistIDException e) {
			System.out.println(e.getMessage());
		}
		catch(WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void loginId(String id) throws NotExistIDException{
		String zero = "0";
		if(id.equals(zero)) {
			throw new NotExistIDException();
		}
	}
	public static void loginPw(String pw) throws WrongPasswordException{
		if(pw.equals(pw)) {
			throw new WrongPasswordException();
		}
	}

}
