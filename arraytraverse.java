// public class arraytraverse {
//     public static void traverse(int a[] ,int index){
//         if(index==a.length){
//             return;
//         }
//         System.out.println(a[index]);
//         index++;
//         traverse(a, index);

//     }
//     public static void main(String[] args) {
//         int a[]={10,20,30,40};
//         traverse(a, 0);

        
//     }
    
// }
// public class arraytraverse {
//     public static int max(int arr[],int index){
//         if(index==arr.length){
//             return 0;


//         }

//             int m=max(arr,index+1);
//             if(arr[index]>m){
//                 m=arr[index];
//                 arr[index]++;

//             }
//             return m;
//     }
//     public static void main(String[] args) {
//         int arr[]={90,100,8,50,88,66};
//         int r=max(arr, 0);
//         System.out.println("max is"+r);
        
//     }
// }
// public class arraytraverse {
//     public static int min(int arr[],int index){
//         if(index==arr.length-1){
//             return arr[index];


//         }

//             int m=min(arr,index+1);
//             if(arr[index]<m){
//                 m=arr[index];

//             }
//             return m;
//     }
//     public static void main(String[] args) {
//         int arr[]={90,100,8,50,88,66};
//         int r=min(arr, 0);
//         System.out.println("min is"+r);
        
//     }
// }
// public class arraytraverse {
//     public static int dosum(int arr[],int index){
//         if(index==arr.length){
//             return 0;

//         }
//         int sum=dosum(arr, index+1);
//         return sum+arr[index];


//     }
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         int sum=dosum(arr, 0);
//         System.out.println(sum);
//     }
// }
public class arraytraverse {
    public static boolean issorted(int arr[],int index){
        if(arr.length-1 == index){
            return true;

        }
        if(arr[index]>arr[index+1]){
            return false;
        }
       return issorted(arr, index+1);


    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(issorted(arr, 0)
       ? "Sorted" : "not Sorted");
    }
        
}
