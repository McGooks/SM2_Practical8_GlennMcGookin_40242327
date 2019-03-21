package Prac8;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        addStudentsToArrayList(arrayList);


    }

    private static void addStudentsToArrayList(ArrayList<Student> students){
        Student s1 = new Student("Glenn","McGookin",33,12341234);
        Student s2 = new Student("Justin","McGookin",34,12341255);
        Student s3 = new Student("Gary","McGookin",35,123412366);
        Student s4 = new Student("Alexander","McGookin",37,12341277);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
    }

}
