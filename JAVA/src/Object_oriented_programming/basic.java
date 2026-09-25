package Object_oriented_programming;




class student {
    int roll;
    String name;
    int marks;

    student(int roll, String name, int marks)
    {   this.roll = roll;
        this.name=name;
        this.marks= marks;
    }

    @Override // this will get automaticlly called when the jdk will start to clear the garbage
    protected void finalize() throws Throwable {
        System.out.println("The object is destroyed");
    }
}


public class basic{
    public static void main(String[] args) {
            student[] s = new student[3];
            // contsructor

         student pranav = new student(1,"Pranav kale",97);
        System.out.println(pranav.name);
        System.out.println(pranav.roll);
        System.out.println(pranav.marks);

        student std = new student(1,"pranav",45);


        for (int i =0 ; i< 1000000;i++)
        std = new student(1,"pranav",45);





    }
    }