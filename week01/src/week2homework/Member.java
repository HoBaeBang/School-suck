package week2homework;

import java.util.*;

class NotExistIDException extends Exception{
	public NotExistIDException() {
		super("ID가 없음");
	}
}

class WrongPasswordException extends Exception{
	public WrongPasswordException() {
		super("Password가 잘못됨");
	}
}
public class Member {

	public static void main(String[] args) {

		String id, passwd;
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ID 입력: ");
			id = sc.next();
			loginId(id);
			
			System.out.print("password 입력: ");
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
