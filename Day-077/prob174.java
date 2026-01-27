import java.util.*;

class prob174 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }

    static void serialize(Node root,List<String> list){
        if(root==null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.data));
        serialize(root.left,list);
        serialize(root.right,list);
    }

    static int idx=0;
    static Node deserialize(List<String> list){
        if(list.get(idx).equals("null")){
            idx++;
            return null;
        }
        Node root=new Node(Integer.parseInt(list.get(idx++)));
        root.left=deserialize(list);
        root.right=deserialize(list);
        return root;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        List<String> list=new ArrayList<>();
        serialize(root,list);
        Node r2=deserialize(list);
        System.out.println(r2.data);
    }
}
