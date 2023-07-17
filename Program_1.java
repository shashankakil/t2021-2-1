import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a = 10;
		double b = 20;
		//double result;
		//String Cal =sc.nextLine();
		String Cal ="*";
		switch(Cal) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		default :
			System.out.println("Invalid input");
		}
	}

}
