import java.util.Scanner;

public class checkmultiples {
  public static void main(String args[]){
      try(Scanner in = new Scanner(System.in)){
          System.out.println("Enter two numbers");
          int a = in.nextInt();
          int b = in.nextInt();
          if(a%b==0){
              System.out.println("Yes");
          } else{
              System.out.println("No");
          }
      }
  }  
}
