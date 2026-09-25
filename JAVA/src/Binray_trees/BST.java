package Binray_trees;

import java.util.*;

public class BST {
    public class Node {
        int val;
        int height;
        Node left;
        Node right;
        public Node(int val) { this.val =val;}
    }
    private Node root;
    public int height(Node node ){
        if (node==null) return -1;
        return node.height;
    }
    boolean isEmpty( ) {return root==null;}
    public void insert(int val) {  root = insert(root,val);}
    private Node insert(Node node ,int val){
        if (node==null){
            node = new Node(val);
            return node;}

        if (val<node.val) node.left= insert(node.left,val);
        if (val>node.val) node.right=insert(node.right, val);

      node.height =Math.max(height(node.left),height(node.right))+1;
  return  node;}

    public boolean balanced(){return balanced(root);}
    private boolean balanced(Node node){
        if (node==null){
            return true;}

        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        if(root==null){
            System.out.println("Tree is empty");
            return;}
        display(root, "Root Node: " + root.val);
    }
    public void display(Node node, String details){
        if(node == null) return;
        System.out.println(details);
        display(node.left, "Left Child of " + node.val + " -> " + (node.left != null ? node.left.val : "null"));
        display(node.right,"Right Child of " + node.val + " -> " + (node.right != null ? node.right.val : "null"));
    }
    public void populate(int[] nums ){for (int i =0 ; i<nums.length ; i++){this.insert(nums[i]);}}


   public void Pred_sucess(int x){
     Node s =sucessor(root,x);
     Node p = predeccessor(root,x);
       System.out.println("Sucessor is"+s.val);
       System.out.println("Predecessor is"+s.val);
   }

   private static  Node predeccessor(Node curr,int key){
        Node pred = null;

        while (curr!=null){
            if (key>curr.val) {
                pred =curr;
                curr=curr.right;}
        }
     return pred;
    }

    private  static Node sucessor(Node curr,int key){
        Node succ =null;
        while (curr!=null){
            if (key<curr.val){
                succ=curr;
                curr=curr.left;
            }
        }
    return  succ;

    }



    public boolean issame(Node p ,Node q){
       if (p==null||q==null)
           return p==q;

        boolean isleft= issame(p.left,q.left);
       boolean isright= issame(p.right,q.right);

       return isleft && isright&& p.val==q.val;
    }



   public List<List<Integer>>levelorder(){
     List<List<Integer>> result =new ArrayList<>();
     if (root==null) return result;

     Queue<Node> queue = new LinkedList<>();
     queue.offer(root);

     while (!queue.isEmpty()){
         int size =queue.size();
         List<Integer> current_lev= new ArrayList<>(size);
         for (int i = 0; i <size; i++)
         {   Node node = queue.poll();
             current_lev.add(node.val);
             if (node.left!= null)
                 queue.add(node.left);
             if (node.right!= null)
                 queue.add(node.right);
         }
          result.add(current_lev);
     }
        return  result ;
    }


}





