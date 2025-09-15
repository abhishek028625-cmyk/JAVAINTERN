// public class pattern {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//             System.out.print("*");
//             }
//             System.out.println( " ");
//         }
//     }

// }
//  public class pattern {
 
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 if(i==1||i==5||j==1||j==5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//  }   
// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class pattern{
//     public static void main(String[] args) {
//         int n;
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter the number");
//         n=ref.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n*n-1; j++){
//                 if(j>=n-i && j<=n+i){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print("");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class pattern {

//     public static void main(String[] args) {
//         int num;
//         int i=1;
//        int su=0;
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter the num =");
//         num=ref.nextInt();
//         while (i<=num) {
//            // System.out.println(i);
//             su=su+i;
//             i++;
//         }
//         System.out.println(su);

        
//     }
// }
// public class pattern {
 
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 if(i==1||i==5||j==1||j==5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//  }   
// public class pattern {

//     public static void main(String[] args) {
        
//         int row=4;
//         int col=5;
//         for(int i=1; i<=row; i++){
//             for(int j=1; j<=col; j++){
//                 System.out.print("*");
//             }
//             System.out.println('\n');
//         }
//     }
// }

// import java.util.Scanner;

// public class pattern {

//     public static void main(String[] args) {
        
//         int row=4;
//         int col=5;
//         for(int i=1; i<=row; i++){
//             for(int j=1; j<=col; j++){
//                 if(i==1||i==row||j==1||j==col){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println('\n');
//         }
//     }
// }
// public class pattern {

//     public static void main(String[] args) {
//         int n=4;
//         int m=5;
//         for(int i=4; i>=1; i-- ){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println('\n');
//         }
//     }
// }
// public class pattern {

//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println('\n');
//         }
//     }
// }
public class pattern {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print( number+" ");
                number++;
            }
            System.out.println('\n');
        }
    }

    
}