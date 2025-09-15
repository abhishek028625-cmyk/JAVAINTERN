import java.util.Scanner;

public class conditionalstatement {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter first num");
        int num1=r.nextInt();
        System.out.println("enter second num");
        int num2=r.nextInt();
        System.out.println("enter the third num");
        int num3=r.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("num1 is greatyer");

        }
        else if (num2>num1 && num2>num3) {
            System.out.println("num2 is greater");
            
        }
        else{
            System.out.println("num3 is greater");
        }
        
    }
    
}
