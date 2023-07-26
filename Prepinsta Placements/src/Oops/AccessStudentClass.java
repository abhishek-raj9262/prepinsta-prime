package Oops;

public class AccessStudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek" , 11202671);
//         s1.name = "abhishek";
//         s1.setRoll(1);
//        System.out.println(s1.name);
//        System.out.println(s1.getRoll());
        s1.print();
        System.out.println(s1.getCount());
        System.out.println(Student.getCount());
    }
}
