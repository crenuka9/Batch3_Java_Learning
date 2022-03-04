package day15;

import java.util.ArrayList;

public class StudentCollection
{
    public static void main(String[] args)
    {
        //List of students
        ArrayList<Student> arrayList=new ArrayList<>();
        Student student1=new Student(100,"Sam","A","FirstClass");
        Student student2=new Student(101,"Tom","B","outstanding");
        Student student3=new Student(102,"Jam","C","Distinction");
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        for(Student stu:arrayList)
        {
            System.out.println("StudentId: "+stu.stuId);
            System.out.println("StudentId: "+stu.stuName);
            System.out.println("StudentId: "+stu.group);
            System.out.println("StudentId: "+stu.grade);

        }
    }

}
