import java.util.ArrayList;

import java.util.Collections;
// logic behind the compareTo is 
// 2 - 4 = it returns -2 , this means obviously the first one is SMALLER than the last one
//4 - 2 = it returns 2 , this means obviously the first one is GREATER than the last one
// 2-2 = 0 , it returns 0 , this means both first one and last one are similer

public class ComparatorInterfaceUseCase {
    // array list that will contain all properities of class Student

    public static void main(String[] args) {
        System.out.println("hey i am working");
        ArrayList<Student> studentList = new ArrayList<>();
        Student s1 = new Student("saksham", 13); // constructor will be called
        studentList.add(s1);
        // if we print it without the toString method , it will print the value of the
        // referece
        System.out.println(s1);
        Student s2 = new Student("Ravi", 12); // constructor will be called
        studentList.add(s2);

        Student s3 = new Student("Natasha", 13); // constructor will be called
        studentList.add(s3);

        Student s4 = new Student("Patum", 7); // constructor will be called
        studentList.add(s4);
        System.out.println(studentList);

        // now sort the Student class according to rollno's
        Collections.sort(studentList);

        // for reversing the order
        Collections.sort(studentList, Collections.reverseOrder());

        // print after sorting
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

    }

}

// every class in java extends object class
class Student implements Comparable<Student> {

    private String name;
    private int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;

    }

    public String getName() {
        return this.name;
    }

    public int getrollno() {
        return this.rollno;
    }

    @Override
    // this will return a string which will be used to print the object if needed
    public String toString() {
        return (" the object is : {" + name + " " + rollno + "}");
    }

    // we are defining sorting technique inside the class , we do write comparable
    // which is used from Comparable interface
    // @Override
    // public int compareTo( Student other){
    // return this.rollno - other.rollno;
    // // if it returns minus (-) this means rollno of this is small, so sorting

    // }
    // for descending sorting meaning 23,21, 5 ,1
    @Override
    public int compareTo(Student other) {

        // if both have same rollno.s , sort them according to alphabets
        if (other.rollno - this.rollno == 0) {
            return this.name.compareTo(other.name);
        }
        return other.rollno - this.rollno;

    }

}
