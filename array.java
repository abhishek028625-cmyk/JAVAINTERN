// class arrayoperation {
//     int size;

//     public static void main(String[] args) {
//         System.out.println("1 for add");
//         System.out.println("2 for delete");
        
//     }
    
//}
// second largest element in array
//best time to buy and sell stock 
//rotate array
// public class array {
//     public static void main(String[] args) {
//         int [] marks=new int [3];

//         marks[0]=10;
//         marks[1]=20;
//         marks[2]=40;
//         for(int i=0; i<marks.length; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// public class array {
//     public static void main(String[] args) {
//         int []a={2,7,5,3,4,10};
//         for(int i=0; i<a.length; i++){
//             System.out.println(a[i]);
//         }
//     }
// }

// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner ref=new Scanner(System.in);
//         int numbers=ref.nextInt();
//         int[] a= new int[numbers];
//         for(int i=0; i<numbers; i++){
//             a[i]=ref.nextInt();
//         }
//         int x=ref.nextInt();

//         for(int i=0; i<a.length; i++){
//             if(a[i]==x){
//                 System.err.println("x is found on index"+i);
//             }
//         }

//     }
// }

// import java.util.Scanner;

// class nums{
//     public static void main(String[] args) {
//         // int n=5;
//         // int sum=0;
//         // for(int i=1; i<=n; i++){
//         //     sum=sum+i;
//         // }
//         // System.out.println(sum);
//         //int sum=0;
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=ref.nextInt();
//         // for(int i=1; i<=n; i++){
//         //     //System.out.println(i);
//         //   //  sum=sum+i;
//         // }
//         //System.out.println(sum);
//         for(int i=1; i<=10; i++){
//             System.out.println("mul is" + i + "*" + n + "="+i*n);
//         }
//     }
// }

// import java.util.Scanner;

// import javax.script.ScriptException;

// class factofnum {
//     public static void main(String[] args) {
//         int factorial=1;
//         Scanner r=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=r.nextInt();
//         while (n>0) {
//             factorial=n*factorial;
//             n--;
//         }
//         System.out.println(factorial);
//     }

    
// 

// import java.util.Scanner;

// public class array {

//     public static int factofnum(int num){
//         if(num==0||num==1){
//             return 1;
//         }
//         return num*factofnum(num-1);
        

//     }
//     public static void main(String[] args) {
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter the number");
//         int num=ref.nextInt();
//         int result=factofnum(num);
//         System.out.println(result);

//     }
// }

// import java.util.Scanner;

// public class array {

//     public static void main(String[] args) {
//         int rem;
//         int num;
//         int reverse=0;
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter the number");
//         num=ref.nextInt();
//         while (num>0) {
//             rem=num%10;
//             reverse=reverse*10+rem;
//             num=num/10;
            
//         }
//         System.out.println("the original num"+reverse);
//     }
// }
// public class array {
//     public static int reversenum(int num,int reverse){
//         if(num==0){
//             return reverse;
//         }
//         reverse=reverse*10+(num%10);
//         return reversenum(num/10, reverse);
        
//     }

//     public static void main(String[] args) {
//         int num=1234;
//         int res=reversenum(num,0);
//         System.out.println(res);
        
//     }
// }

// import java.util.Scanner;

// public class array {

//     public static void main(String[] args) {
//         int digit=0;
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=ref.nextInt();
//         int temp=n;

//         while (n>0) {
//             digit=digit*10+(n%10);
//             n=n/10;
//         }
//         if(digit==temp){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not");
//         }
//     }
// }}

// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         int digit;
//         int sum=0;
//         Scanner re=new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=re.nextInt();
//         int temp=n;
//         int t=n;
//         int count=0;
//         while ((t>0)) {
//             count++;
//             t=t/10;
            
//         }
//         while (n>0) {
//             digit=n%10;
//             sum+=(int)Math.pow(digit,count);
//             n=n/10;           
//         }
//         if(temp==sum){
//             System.out.println("arm");
//         }
//         else{
//             System.out.println("not");
//         }
//     }
// }
// public class array {
//     public static void main(String[] args) {
//         int n=123;
//         int digit;
//         int sum=0;
//         while (n>0) {
//             digit=n%10;
//             sum=sum+digit;
//             n=n/10;
//         }
//         System.out.println("sum is"+sum);
//     }

    
// }

// import java.util.Scanner;

// public class array {
//     public static int sumofdigit(int num,int sum){
//         if(num==0){
//             return sum;
//         }
//         int digit=(num%10);
//         return sumofdigit(num/10, sum+digit);

//     }
//     public static void main(String[] args) {
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter the number");
//         int num=ref.nextInt();
//         int res=sumofdigit(num, 0);
//         System.out.println(res);

//     }
// }
// count digit in a number example 1234
//class contdigt {
    //public static void main(String[] args) {
    //      int n=1235;
    //      int count=0;
    //      while ((n>0)) {
    //         n=n%10;
    //         count++;
    //         n=n/10;

            
    //      }
    //      System.out.println(count);
    // }
//}//
// public class array {
//     public static int coutdigit(int num,int count){
//         if(num==0){
//             return count;
//         }
//         return coutdigit(num/10, count+1);

//     }
//     public static void main(String[] args) {
//         int num=1234;
//         int res=coutdigit(num, 0);
//         System.out.println(res);
//     }
// }

// import java.util.Scanner;

// public class array {

//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter first");
//         a=ref.nextInt();
//         System.out.println("enter second");
//         b=ref.nextInt();
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println(" a = " + a + " b = " + b);
//     }
// }
class swaptwonum{
    public static int swap(int a,int b,int step){
        if(step==0){
            a=a+b;
            System.out.println("a"+a+"b"+b);
             return swap(a, b, 1);
        }
        else if (step==1) {
            b=a-b;
            return swap(a, b,2);
        }
        else if(step==2){
            a=a-b;
            System.out.println("a"+a+"b"+b);
        }
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a, b,0);

    }
}