// public class lcm {
//     public static void main(String[] args) {
//         int a =4;
//         int b =6;
//         for(int i=4; i<100; i++){
//             if(i%a==0 && i%b==0){
//                 System.out.println(i);
//                 break;

//             }
//         }

//     }
    
// }
// public class lcm {
//     public static void main(String[] args) {
// int a=12;
// int b=18;
// for(int i= 12; i>0; i--){
//     if(a%i==0 && b%i==0){
//         System.out.println(i);
//         break;
//     }

// }
// }  
// }
public class lcm {
    public static void main(String[] args) {
        
        // int a=24;
        // int sum=0;
        // for( int i=1; i<28; i++){
        //     if(a% i==0){
        //         sum=sum+i;

        //     }

        // }
        // if(sum==a){
        //     System.out.println("perfect");
        // }
        // else{
        //     System.out.println("not");
        // }
        // int num=77722111;
        // int hash[]=new int[10];
        // int dig;
        // for(int i=0; i<num; i++ ){
        //     dig=num%10;
        //     if(max>dig){
        //         dig=max;
        //     }
        // }
    //     for(int i=0; i<)

    // 
    // while(num>0){
    //     int dig=num%10;
    //     hash[dig]++;
    //     num=num/10;

    // }
    // for(int i=0; i<hash.length; i++){
    //     if(hash[i]>0){
    //         System.out.println(i+" "+ hash[i]);
    //     }
    // }
    int num =5;
    while (num>0) {
        int num1 = (num*num);
        int lastnum=num1%10;

    
    if(lastnum == num){
        System.out.println("num is match");
        break;
    }
    num--;
    }
}

        }