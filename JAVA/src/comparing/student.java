package comparing;

public class student implements Comparable<student> {
    int roll;
    double marks ;

    student(int roll,double marks)
    {
        this.roll=roll;
        this.marks=marks;
    }

    public int compareTo(student o) {
        // Sorting in ascending order by marks
        return Double.compare(this.marks, o.marks);
    }




    public void display(student s) {
        System.out.println("Roll: " + s.roll + ", Marks: " + s.marks);
    }

    @Override
    public String toString()
    {
        return marks+" ";
    }

}
