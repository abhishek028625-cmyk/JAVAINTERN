// import java.util.Scanner;
// import java.lang.Math;

// public class arms {
//     public static void main(String[] args) {
//         int n,arm =0 ,rem,c,po=0;
//         Scanner r =new Scanner(System.in);
//         System.out.println("enter the number");
//         n=r.nextInt();
//         c=n;
//        int temp =n;

//         while (n>0) {
//             while (temp>0) {
//                 temp=temp/10;
//                 po++;
//             }
//             rem=n%10;
//             arm= arm+(int)Math.pow(rem,po);
//             n=n/10;
            
//         }
//         if (c==arm) {
//             System.out.println("num is arms");
            
//         }
//         else{
//             System.out.println("not an armstron");
//         }



//     }
    
// }
class strongnum{
    public static void main(String[] args) {
        int num=115;
        int sum=0; 
        int temp=num;
        while (temp>0) {
            int digit=temp%10;
            int fact=1;
            int i=digit;
            while (i>0) {
                fact=fact*i;
                i--;
            }
            sum=sum+fact;
            temp=temp/10;

        }
        if(num==sum){
            System.out.println("strong");
        }
        else{
            System.out.println("not");
        }
    }
}
