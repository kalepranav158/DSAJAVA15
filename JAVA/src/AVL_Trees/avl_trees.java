package AVL_Trees;

public class avl_trees {
    public class Node {
        int val;
        int height;
        Node left;
        Node right;
        public Node(int val) { this.val =val;}
    }
    private Node root;

    public int  height(){
        int height = height(root);
    return height;
    }

    private int height(Node node ){
        if (node==null) return -1;
        return node.height;
    }
    boolean isEmpty( ) {return root==null;}
    public void insert(int val) {  root = insert(root,val);}
    private Node insert(Node node , int val){
        if (node==null){
            node = new Node(val);
            return node;}

        if (val<node.val) node.left= insert(node.left,val);
        if (val>node.val) node.right=insert(node.right, val);

        node.height =Math.max(height(node.left),height(node.right))+1;
        return  rotate(node);
    }

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





private Node rotate(Node node){
       if(height(node.left)-height(node.right)>1) {
           // Left Heavy
           if (height(node.left.left) - height(node.left.right) > 0) {
               //left left case
               return rightrotate(node);
           }
           if (height(node.left.left) - height(node.left.right) < 0) {
               //left right case
               node.left = leftrotate(node.left);
               return rightrotate(node);
           }
       }

       if(height(node.left)-height(node.right)<-1){
               // right heavy
           if (height(node.right.left)-height(node.right.right)<0){
                   //right right case
                   return leftrotate(node);
               }
           if (height(node.right.left)-height(node.right.right)>0){
                   //right left case
                   node.right = rightrotate(node.right);
                   return leftrotate(node);
               }
       }
   return  node;
    }
    public Node rightrotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }


    public Node leftrotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    public static void main(String[] args) {
        avl_trees tree =new avl_trees();
        for (int i=0; i<100;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());


    }
}









