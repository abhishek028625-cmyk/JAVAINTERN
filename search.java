// public class search {
//     public static int[] searchoccur(int arr[],int index,int value){
//         if(index==arr.length){
//             return 0;
//         }

//         if(arr[index]==value){
//         return index;

//         }
//         return searchoccur(arr, index+1, value);

//     }
//     public static void main(String[] args) {
//         int arr[]={10,20,30,10,555,10,88,10,88,10};
//         int result[]=searchoccur(arr, 0, 10);
//         System.err.println(result);
//         //result[0]=0 result [1]=3 result[2]=5 result[3]=5
//     }
    
// }
public class search {
    public static int calpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1=calpower(x, n-1);
        int xPown=x*xPownm1;
        return xPown;



    }

    
    public static void main(String[] args) {
        int x=2;
        int n=3;
        int ans=calpower(x, n);
        System.out.println(ans);
    }
}
