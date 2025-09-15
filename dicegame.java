// public class dicegame {
//     public static void printpossib(int start, int end,String result){
//         if(start==end){
//             System.out.print(result+" ");
//             return;
//         }
//         if(start>end){
//             return;
//         }
//         for(int dice=1; dice<=6; dice++){
//             printpossib(start+dice, end, result+dice);
//         }


//     }
//     public static void main(String[] args) {
//         printpossib(0, 10,"");
        
//     }
    
// }

// public class dicegame {
//     public static void printpossib(int startrow, int startcol,int endrow ,int endcol,String result){
//         if(startrow==endrow && startcol==endcol){
//             System.out.println(result+" ");
//             return;
//         }
//         if(startrow>endrow || startcol>endcol ){
//             return;
//         }
//         printpossib(startrow+1, startcol, endrow, endcol, result+"D");
//         printpossib(startrow, startcol+1, endrow, endcol, result+"R");


//     }
//     public static void main(String[] args) {
//         printpossib(0, 0, 2, 2, "");
        
//     }
    
// }
//find the permutation of string (amit)
//subset sum problem
//tower of hanoi
