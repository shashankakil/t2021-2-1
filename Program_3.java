import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = input.nextInt();
		for(int i=1;i<=x; i+=2) {
			System.out.print(i+" ");
		}

	}

}
