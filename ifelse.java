import java.util.Scanner;

public class ifelse {
    public static void main(String[]args){
        Scanner umi = new Scanner(System.in);

        System.out.print("Enter the Number");
        int num = umi.nextInt();

        if(num%2==0){
            System.out.print("Number = "+num+" is even");
        }else{
            System.out.print("Number = "+num+" is odd");
        }
    
    umi.close();
    }
}
