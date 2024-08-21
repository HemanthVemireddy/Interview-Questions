package Challange_100_Days;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Hemanth", 90));
        studentList.add(new Student("Hi",98));
        Collections.sort(studentList, new java.util.Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getSmarks(), s2.getSmarks());
            }
        });

        for (Student s : studentList)
        {
            System.out.println(s);
        }
    }
}
