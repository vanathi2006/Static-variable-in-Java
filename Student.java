class Student {
    static int mark;
}
public class Main {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.mark = 90;
        s2.mark = 95;
        Student.mark = 93;

        System.out.println("S1's mark is: " + s1.mark);
        System.out.println("S2's mark is: " + s2.mark);
    }
}