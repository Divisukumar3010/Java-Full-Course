class Student{
    int rollno;
    String name;
    int marks;
}
public class Array_of_objects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno = 6102;
        s1.name = "Sukumar";
        s1.marks = 40;

        Student s2=new Student();
        s2.rollno = 6104;
        s2.name = "Snharsha";
        s2.marks = 38;

        Student s3=new Student();
        s3.rollno = 6104;
        s3.name = "Rajesh";
        s3.marks = 39;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i=0;i<student.length;i++)
        {
            System.out.println(student[i].name+" : "+student[i].marks);
        }
    }
}
