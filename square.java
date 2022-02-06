import java.util.Scanner;

public class square {
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
        System.out.println("Enter a number");
        int number = in.nextInt();
        for(int i=0;i<number;i++){
        for(int j=0;j<number;j++){
            System.out.print("*");
        }
        System.out.println("");
        }
    }
    }
}
