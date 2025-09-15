public class patterndemo {
    public static int maxp(int ropelen,int a,int b,int c){
        if(ropelen==0){
            return 0;

        }
        if(ropelen<0){
            return -1;
        }

        int option1=maxp(ropelen-a, a, b, c);
        int option2=maxp(ropelen-b, a, b, c);
        int option3=maxp(ropelen-c, a, b, c);
        int result=Math.max(option1,Math.max(option2, option3));
        if(result==-1){
            return -1;
        }
        return result+1;
    }
    public static void main(String[] args) {
        int max=maxp(5, 2, 5, 1);
        System.out.println( max);
        
    }
    
}
//  try at home you have a grid 
