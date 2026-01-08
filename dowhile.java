import java.util.Scanner;
public class dowhile{
    public static void main(String[]args){
        Scanner umi = new Scanner(System.in);
        int count = umi.nextInt();

        int number = 1;
        do{
            System.out.print(number);
        }while(number <= count);

        umi.close();
    }
}