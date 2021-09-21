package week2;

class MyException extends Exception{
	public MyException() {
		super("사용자 정의 예외");
	}
}

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage()+"\n호출 스택 내용: ");
			e.printStackTrace();
		}
	}
	
	public static void method1() throws MyException {
		throw new MyException();
	}

}
