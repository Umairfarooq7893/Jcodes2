import java.util.Scanner;
public class forloop {
    public static void main(String[] args){
        Scanner umi = new Scanner(System.in);

        System.out.print("Enter the number ,upto which you want the print = ");
        int n = umi.nextInt();

        for(int i = 0; i <= n ; i++){
            System.out.print(i);
            System.out.print("\t");
        }
        umi.close();
    }
}