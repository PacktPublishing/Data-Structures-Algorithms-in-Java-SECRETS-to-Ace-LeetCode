package ComparisonOfObjects;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
       int diff = (int) (this.marks - o.marks);
       return diff;
       // If diff == 0; both joe and tom has scored equal marks
        // if diff < 0 means object o is bigger than this object
        // else o object is smaller
    }
}
