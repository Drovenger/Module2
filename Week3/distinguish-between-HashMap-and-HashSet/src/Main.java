import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");

        List<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(0, student1);
        studentArrayList.add(1, student2);
        studentArrayList.add(2, student3);

        for (Student student : studentArrayList) {
            System.out.println(student.toString());
        }
        System.out.println(studentArrayList.size());

        Student student4 = new Student("Nam", 20, "HN");
        Student student5 = new Student("Hung", 21, "HN");
        Student student6 = new Student("Ha", 22, "HN");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student4);
        studentMap.put(2, student5);
        studentMap.put(3, student6);
        studentMap.put(4, student4);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student4);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}