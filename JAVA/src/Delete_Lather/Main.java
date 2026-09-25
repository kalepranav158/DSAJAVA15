package Delete_Lather;

class information implements  pranav,mayank,kajal{
    @Override
    public void display() {
        System.out.println("Name:"+kajal.name);
        System.out.println("Name:"+kajal.RBT);
        System.out.println("Name:"+kajal.cgpa);
        System.out.println();
        System.out.println("Name:"+pranav.name);
        System.out.println("Name:"+pranav.RBT);
        System.out.println("Name:"+pranav.cgpa);
        System.out.println();
        System.out.println("Name:"+mayank.name);
        System.out.println("Name:"+mayank.RBT);
        System.out.println("Name:"+mayank.cgpa);

    }
}

public class Main{
    public static void main(String[] args) {
        pranav p = new information();
        p.display();

    }}
