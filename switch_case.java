import java.util.Scanner;
public class switch_case {
    public static void main(String[]args){
        Scanner umi = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number = umi.nextInt();

        switch(number){
            case 1 : System.out.println("Apple") ;
            break;
            case 2 : System.out.println("Mango");
            break;
            case 3 : System.out.println("Banana");
            break;
            case 4 : System.out.println("Pear");
            break;
            case 5 : System.out.println("Plum");
        default:
            System.out.println("Invalid Output");
        }
    umi.close();
    } 
}
