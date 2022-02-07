import java.util.Scanner;

public class nseq{
public static void main(String args[]){
    try(Scanner in = new Scanner(System.in)){
        System.out.println("Enter a number");
        int n = in.nextInt();
        if(n<=10000){
            while(n>1){
                if(n % 2 == 0){
                    n = n/2;
                    System.out.print(n+" ");
                }else{
                    n = 3*n+1;
                    System.out.print(n+" ");
                }
            }
        }else{
            System.out.println("Error!");
        }
    }
}
}
