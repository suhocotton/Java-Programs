import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter an operation");
            String input = in.nextLine();
            if(input.contains("+")){
                String[] parts = input.split("\\+");
                String a = parts[0]; 
                String b = parts[1];
                int n1 = Integer.parseInt(a);
                int n2 = Integer.parseInt(b);
                System.out.println("Answer:"+(n1+n2));
            }
            else if(input.contains("-")){
                String[] parts = input.split("\\-");
                String a = parts[0]; 
                String b = parts[1];
                int n1 = Integer.parseInt(a);
                int n2 = Integer.parseInt(b);
                System.out.println("Answer:"+(n1-n2));
            }
            else if(input.contains("*")){
                String[] parts = input.split("\\*");
                String a = parts[0]; 
                String b = parts[1];
                int n1 = Integer.parseInt(a);
                int n2 = Integer.parseInt(b);
                System.out.println("Answer:"+(n1*n2));
            }
            else if(input.contains("/")){
                String[] parts = input.split("\\/");
                String a = parts[0]; 
                String b = parts[1];
                int n1 = Integer.parseInt(a);
                int n2 = Integer.parseInt(b);
                System.out.println("Answer:"+(n1/n2));
            }
            else{
                System.out.println("Invalid operation!");
            }
        }
    }
}
