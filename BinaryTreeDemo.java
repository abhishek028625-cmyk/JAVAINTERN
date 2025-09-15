// import java.util.Scanner;

// class BinaryTreeNode {
//     int data;
//     BinaryTreeNode left;
//     BinaryTreeNode right;
//     BinaryTreeNode(int data){
//         this.data=data;
//     }
    
// }
// class BinaryTreeOperation{
//     static Scanner scanner=new Scanner(System.in);
//         if(root==null){
//             return;
//         }
//     static BinaryTreeNode CreateTree(){
//         System.out.println("enter the data of parent");
//         int data =scanner.nextInt();
//         if(data==-1){
//             return null;
//         }
//         BinaryTreeNode node=new BinaryTreeNode(data);
//         System.out.println("enter the data of left node "+data);
//         node.left=CreateTree();
//         System.out.println("enter the data of right"+data);
//         node.right=CreateTree();
//         return node;

//     }

// }
// public class BinaryTreeDemo{
//     public static void main(String[] args) {
//         BinaryTreeNode root=new BinaryTreeOperation.CreateTree();
//         BinaryTreeOperation.print(root);
//         // BinaryTreeNode left=new BinaryTreeNode(20);
//         // root.left=left;
//         // BinaryTreeNode right=new BinaryTreeNode(20);
//         // root.right=right;

//     }
    
// }
import java.util.Scanner;

class BinaryTreeNode{
      int data;
      BinaryTreeNode left;
      BinaryTreeNode right;
      BinaryTreeNode(int data){
          this.data=data;
      }
}
class BinaryTreeOperations{
    static Scanner sc=new Scanner(System.in);
    static void print(BinaryTreeNode root ){
          if(root==null){
            return ;
          }
          System.out.println(root.data);
          print(root.left);
          print(root.right);
    }
    static BinaryTreeNode createTree(){
        System.out.println("Enter the data of parent node 0r press -1 to exit");
        int data=sc.nextInt();
        if(data==-1){
           return null;
        }
        BinaryTreeNode node=new BinaryTreeNode(data);
        System.out.println("Enter the data of left node for "+ data);
        node.left=createTree();
        System.out.println("Enter the data of right node for"+ data);
        node.right=createTree();
         return node;
    }
}
public class BinaryTreeDemo {
    public static void main(String[] args) {
       BinaryTreeNode root= BinaryTreeOperations.createTree();
       BinaryTreeOperations.print(root);
        // BinaryTreeNode root=new BinaryTreeNode(10);
        // BinaryTreeNode left=new BinaryTreeNode(20);
        // root.left=left;
        // BinaryTreeNode right=new BinaryTreeNode(20);
        // root.right=right;
    }
}