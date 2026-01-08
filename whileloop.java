import java.util.Scanner;
public class whileloop{
    public static void main(String[] args){
        Scanner umi = new Scanner(System.in);

        System.out.print("Enter the number ,upto which you want the print = ");
        int count = umi.nextInt();

        int number = 1;
        while(number <= count){
            System.out.println(number);
            number = number + 1;
        }
        umi.close();
    }
}
