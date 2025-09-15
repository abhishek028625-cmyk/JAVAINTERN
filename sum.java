// public class sum {
//     public static void main(String[] args) {
//         int n=736876;
//         int sum1=0;
//         int sum2=0;
//        int pos=1;
//         while(n>0){
//                 int digit=n%10;
//                 if(digit%2==0){
//                     sum1=sum1+digit;
//                 }
//                 else{
//                     sum2=sum2+digit;
//                 }
//                 n=n/10;
//                 pos++;
//         }
//         System.out.println("Sum of even places digits is "+sum1);
//         System.out.println("Sum of odd places digits is "+sum2);
//     }
// }
// class flipdigit{
//     public static void main(String[] args) {
//         int num=32145;
//         int pos=0;
//         int sum=0;
//         while (num!=0){
//          int digit=num%10;
//          pos++;
//          int pow=(int)Math.pow(10, digit-1);
//          sum=sum+pos*pow;
//          num=num/10;
//         }
//         System.out.println(sum);
    

//     }
// }

// import java.util.Scanner;

// class rotatenum{
//     public static void main(String[] args) {
//         int num;
//         int rotation;
//         int count=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         num=sc.nextInt();
//         System.out.println("enter the rotation");
//         rotation=sc.nextInt();
//         int digit=num%10;
//         int pow=(int) Math.pow(10, count-rotation);


//     }
// } 

// import java.util.Scanner;

// class rotatenum{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number");
//     int num=sc.nextInt();
//     System.out.println("enter the rotataion");
//     int rotation=sc.nextInt();
//     int pow=(int)Math.pow(10, rotation);
//     int lhs=num/pow;
//     int rhs=num%pow;
//     int count=0;
//     int temp=num;
//     while (temp!=0) {
//         count++;
//         temp=temp/10;
//     }
//         int pow2=(int)Math.pow(10,count-rotation);
//         int result=rhs*pow2+lhs;
//         System.out.println(result);

//     }


// }

// import java.util.HashMap;

// class frequancy{
//     public static void main(String[] args) {
//         int num=24527417;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         while (num>0) {
//             int digit=num%10;
//             if(map.get(digit)==null){
//                 map.put(digit, 1 );
//             }
//             else{
//                 int count=map.get(digit);
//                 count++;
//                 map.put(digit, count);
//             }
//             num=num/10;

            
//         }
//         System.out.println(map);

//     }

    
//}
// class reversenum{
//     public static void main(String[] args) {
//         int num=23545;
//         int cpy=num;
//         int count=0;
//         while (cpy>0) {
//             count++;
//             cpy=cpy/10;
            
//         }
//         int pow=(int)Math.pow(10,count-1);
//         int firstdigit=num%10;
//         int lastdigit=num/pow;
//         num=num/10;
//         int pow2=(int)Math.pow(10, count-2);
//         int mid=num%pow2;
//         int result=firstdigit*pow+mid*10+lastdigit;
//         System.out.println(result);

//     }
// }
// class gcd{
//     public static void main(String[] args) {
//        int a=20;
//        int b=30;
//        int min=a>b?b:a;
//        while ((min>0)) {
//         if(a%min==0 && b%min==0){
//             System.out.println("it is gcd"+min);
//             break;
//         }
//         min--;
        
//        }

//     }
// 
// class GCD{
//     public static void main(String[] args) {
//         int a=24;
//         int b=36;
//         int min=a>b?b:a;
//         while (min>0) {
//             if(a%min==0&&b%min==0){
//                 System.out.println(min);
//                 break;

//             }
//             min-
// }}
// class lcm{
//     public static void main(String[] args) {
//         int a=24;
//         int b=36;
//       //  int acpy=a;
//         //int bcpy=b;
//         int min=a>b?b:a;
//         while (min>0) {
//             if(a%min ==0 && b%min ==0){
//                 System.out.println(min);
//                 break;
//             }
//             min--;
            
//         }

//     }
// }
// class lcm{
//     public static void main(String[] args) {
//         int a=24;
//         int b=36;
//       //  int acpy=a;
//         //int bcpy=b;
//         int min=a>b?b:a;
//         while (min>0) {
//             if(a%min ==0 && b%min ==0){
//                 System.out.println(min);
//                 break;
//             }
//             min--;
            
//         }

//     }
// }
// class lcm{
//     public static void main(String[] args) {
//         int a=24;
//         int b=36;
//         int acpy=a;
//         int bcpy=b;
//         int min=a>b?b:a;
//         while (min>0) {
//             if(a%min ==0 && b%min ==0){
//                 //System.out.println(min);
//                 break;
//             }
//             min--;
            
//         }
//         int lcm=(acpy*bcpy)/min;
//         System.out.println(lcm);

//     }
// }

// import java.util.HashMap;
// import java.util.Scanner;

// class countsequance{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int num=sc.nextInt();
//        // int num=25427672;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         while ((num>0)) {
//             int digit=num%10;
//             if(map.get(digit)==null){
//                 map.put(digit, 1);
//             }
//             else{
//                 int count=map.get(digit);
//                 count++;
//                 map.put(digit, count);
//             }
//             num=num/10;
//         }
//         System.out.println(map);
//     }
// }
// class name{
//     static void printname(int num){
//         if(num==0){
//             return;
//         }
//         //System.out.println("abhi");
//         printname(num-1);

//     }
//     public static void main(String[] args) {
//          printname(5);
        
//     }
// }
// class digit{
//     static  void printdigit(int num){
//         if(num==0){
//             return ;
//         }
//         printdigit( num/10);
//         System.out.println(num%10);


//     }
//     public static void main(String[] args) {
//         printdigit(12345);
//     }
// }
// class printnum{
//     static void printnumber(int num){
//         if(num==0){
//             return;
//         }
//         printnumber( num/10);
//         System.out.println(num%10);

//     }
//     public static void main(String[] args) {
//         printnumber(12345);
        
//     }
// }
// class sum{
//     static void sumofdigit(int num,int sum){
//         if(num==0){
//            System.out.println(sum);
//            return;
//         }
//         int digit= num%10;
//         sumofdigit(num/10, sum=sum+digit);

//     }
//     public static void main(String[] args) {
//     sumofdigit(12345, 0);
//     }
// }
class sum{
    static int printsum(int num){
        if(num==0){
            return 0;

        }
        int sum=printsum(num/10);
        int digit=num%10;
        sum=sum+digit;
        return sum;

    }
    public static void main(String[] args) {
        int res=printsum(12345);
        System.out.println(res);
        
    }
}