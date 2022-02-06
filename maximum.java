import java.util.Scanner;

public class maximum {
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter two numbers");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Math.max(a, b));
        }
    }
}
