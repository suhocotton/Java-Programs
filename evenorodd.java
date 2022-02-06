import java.util.Scanner;

public class evenorodd {
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
        System.out.println("Enter a number");
        int number = in.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    }
}
