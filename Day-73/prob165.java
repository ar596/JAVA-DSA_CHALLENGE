import java.util.*;

class prob165 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }

    static void inorder(Node root,List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    public static void main(String[] args) {
        Node r1=new Node(5);
        r1.left=new Node(3);
        r1.right=new Node(7);

        Node r2=new Node(6);
        r2.left=new Node(4);
        r2.right=new Node(8);

        List<Integer> list=new ArrayList<>();
        inorder(r1,list);
        inorder(r2,list);
        Collections.sort(list);
        System.out.println(list);
    }
}
