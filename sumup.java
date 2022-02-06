import java.util.Scanner;

public class sumup {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter three numbers");
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int sum = (a+b+c);
			System.out.println(a+"+"+b+"+"+c+"="+sum);
		}
    }
}
