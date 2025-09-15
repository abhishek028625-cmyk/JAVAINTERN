// import java.util.Scanner;

// public class function {
//     public static void printname(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner r=new Scanner(System.in);
//         String name=r.next();
//         printname(name);
        
//     }
    
// }

// import java.util.Scanner;

// public class function {

//     public static int printsum(int a, int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter");
//          int a=ref.nextInt();
//          System.out.println("enter");1
//          int b=ref.nextInt();
//          int sum=printsum(a, b);
//          System.out.println(sum);
        
//     }
// }
// public class function {

//     public static int factorial(int n){
//        int fact=1;
//         for(int i=n; i>=1; i--){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         int n=5;
//       int re=  factorial(n);
//       System.out.println(re);
//     }
// }

import java.util.Scanner;

public class function {
    public static int checknum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;

        }

    }
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.println("enter thr number");
       int  a=ref.nextInt();
       System.out.println("enter second number10");
       int b=ref.nextInt();
       int res=checknum(a, b);
       System.out.println("the greater number is "+res);
    }
}