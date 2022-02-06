import java.util.Scanner;
public class multiples {
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter a number");
            int n = in.nextInt();
            if(n>=-100000 && n<=100000){
                System.out.println("Enter the number of multiples to be displayed");
                int m = in.nextInt();
                if(m>=0 && m<=10000){
                    for(int i=1;i<=m;i++){
                        System.out.println(n*i);
                    }
                }else{
                    System.out.println("Error");
                }
            }else{
                System.out.println("Error");
            }
        }
    }
}
