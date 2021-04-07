package university;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Map<Integer, String> students = new HashMap<>();
//        //Map.Entry
//        students.put(21001, "Vasyl");
//        students.put(21002, "Maria");
//        students.put(21003, "Mykola");
//        for (Map.Entry<Integer, String> student : students.entrySet()
//        ) {
//            System.out.println(student.getKey() + "  " + student.getValue());
//
//        }
//
//        System.out.println(students.get(21002));

        Map<Student, Float> students = new HashMap<>();
        Student s1 = new Student("Vasyl", "K", 1);
        Student s2 = new Student("Maria", "M", 1);
        Student s3 = new Student("Maria", "N", 1);
        Student s4 = new Student("Maria", "K", 1);
        Student s5 = new Student("Maria", "K", 1);

        students.put(s1, (float) 60.0);
        students.put(s2, (float) 80.0);
        students.put(s3, (float) 90.0);
        students.put(s4, (float) 100.0);
        students.put(s5, (float) 70.0);

                for (Map.Entry<Student, Float> student : students.entrySet()
        ) {
            System.out.println(student.getKey() + "  " + student.getValue());

        }
    }
}
