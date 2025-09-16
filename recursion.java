// public class recursion {
//     public static void printnum(int n){
//         if(n==0){
//             return;
//         }
//             System.out.println(n);
//             printnum(n-1);

//     }
//     public static void main(String[] args) {
//         int n=5;
//         printnum(5);

        
//     }
    
// }
// public class recursion {
//     public static void printnum(int n){
//         if(n==6){
//             return;
//         }
//             System.out.println(n);
//             printnum(n+1);

//     }
//     public static void main(String[] args) {
//         int n=1;
//         printnum(1);

        
//     }
    
// }
// public class recursion {
//     public static void printnum(int i,int n,int sum){
//         if(i==n){
//             sum=sum+i;
//             System.out.println(sum);
//             return;
//         }
//         sum=sum+i;
//         printnum(i+1,n,sum);
//     }

//     public static void main(String[] args) {
//         printnum(1,5,0);
//     }
// }
//count even odd number
// public class recursion {
//     public static void countevenodd(int n,int even,int odd){
//         if(n==0){
//             System.out.println("even"  +even+  "odd"  +odd);
//             return;
//         }
//         if(n%2==0){
//             even++;

//         }
//         else{
//             odd++;
//         }
//         countevenodd(n-1, even, odd);

//     }

//     public static void main(String[] args) {
//         countevenodd(100, 0, 0);
        
//     }

    
// }
// public class recursion {

// static int [] countevenodd(int n){
//     if(n==0){
//         int a[]=new  int[2];
//         return a;
//     }
//     int a[]=countevenodd(n-1);
//     if(n%2==0){
//         a[0]++;
//     }
//     else{
//         a[1]++;
//     }
//     return a;

// }
// public static void main(String[] args) {
//     countevenodd(100);
// }
// }
// print tabl
// public class recursion {
//     static void printtable(int num,int i){
//         if(i==0){
//             return;
//         }
//         printtable(num, i-1);
//         System.out.println(num+"*"+i+"="+(num*i));

//     }


//     public static void main(String[] args) {
        
//         printtable(5, 10);
//     }
// }
// //123 sum of digit like 1+2+3=6
// // find out num is prime or not
// //find out number is armstrong
// //number to string conversion like 763 mean seven  six three
// //
// public class recursion {
//     public static int fact(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact_n1=fact(n-1);
//         int fact_n=n * fact_n1;
//         return fact_n;


//     }
//     public static void main(String[] args) { 
//         int n=5;
//        int ans= fact(n);
//        System.out.println(ans);
        
//     }

    
// }
// public class recursion {
//     public static void fiboo(int a, int b,int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         fiboo(b, c, n-1);

//     }
//     public static void main(String[] args) { 
//         int a=0,b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         fiboo(a, b, n-2);
//          }
// }
//123 sum of digit like 1+2+3=6
// public class recursion {
//     public static void sumof(int num,int sum){
//         if(num==0){
//             System.out.println(sum);
//             return;
//         }
//         int digit=num%10;
//         sum=sum+digit;
//         sumof( num/10,sum);

//     }
//     public static void main(String[] args) {
//         int num=123;
//         sumof(num, 0);
//     }

// public class recursion {
//     public static void printarms(int n,int sum,int org){
//         if(n==0){
//             if(sum==org){
//                 System.out.println("arm");
//             }
//             else{
//                 System.out.println("not");
//             }
//             return;
//         }
//         int rem=n%10;
//         sum=(rem*rem*rem)+sum;
//         printarms(n/10, sum,org);


//     }
//     public static void main(String[] args) {
//         int n=155;
//         printarms(n, 0,n);
        
//     }
// }
// class Countevenodd{
//     static void countevenodd(int range ,int even,int odd){
//         if(range==0){
//             System.out.println("evnn is " + even + " odd is " + odd);
//             return;
//         }
//         if(range%2==0){
//             even++;
//         }
//         else{
//             odd++;
//         }
//         countevenodd(range-1, even, odd);
//     }
//     public static void main(String[] args) {
//         countevenodd(15, 0, 0);
        
//     }
// }
class Countevenodd{
    static int[] countevenodd(int range){
        if(range==0){
            int res[]=new int[2];
            return res;
        }
       int res[] =countevenodd(range-1);
       if(range%2==0){
        res[0]=res[0]+1;
       }
       else{
        res[1]=res[1]+1;
       }
       return res;

    }
    public static void main(String[] args) {
        int arr[]=countevenodd(10);
        System.out.println("even no" + arr[0]);
        System.out.println("odd no"  + arr[1]);
        
    }
}