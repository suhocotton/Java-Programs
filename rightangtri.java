import java.util.Scanner;

public class rightangtri {
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter a value of n");
            int n = in.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
