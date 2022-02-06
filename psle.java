import java.util.Scanner;
public class psle {
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter a score");
            int score = in.nextInt();
            if(score>=0 && score<=100){
                if(score>90){
                    System.out.println("A*");
                }
                else if(score>=75 && score<=90){
                    System.out.println("A");
                }
                else if(score>=60 && score<=74){
                    System.out.println("B");
                }
                else if(score>=50 && score<=59){
                    System.out.println("c");
                }
                else if(score>=35 && score<=49){
                    System.out.println("D");
                }
                else if(score>=20 && score<=34){
                    System.out.println("E");
                }else{
                    System.out.println("U");
                }
            }else{
                System.out.println("Error");
            }
        }
}
}