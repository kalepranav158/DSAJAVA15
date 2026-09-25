package stacks;

public class main {
    public static void main(String[] args) throws Exception{
//        stack s= new stack(6);
//
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//        s.push(6);
//        //s.push(10);
//        s.pop();
//        System.out.println(s.peek());
//        //System.out.println();
//

        dynamicstack ds = new dynamicstack(6);

        ds.push(1);
        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);
        ds.push(6);
        ds.push(10);
        ds.pop();
        System.out.println(ds.peek());

    }
}
