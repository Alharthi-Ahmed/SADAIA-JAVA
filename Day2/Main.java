import java.util.ArrayList;


class Student {
    private String name;
    private int id;

    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class StudentManager {
    private ArrayList<Student> students;

   
    public StudentManager() {
        students = new ArrayList<>();
    }

    
    public void addStudent(Student student) {
        students.add(student);
    }

    
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; 
    }

   
    public ArrayList<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

   
    public boolean removeStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return true; 
            }
        }
        return false; 
    }
}


public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);

       
        StudentManager studentManager = new StudentManager();

        
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

       
        Student retrievedStudent = studentManager.getStudentById(2);
        if (retrievedStudent != null) {
            System.out.println("Retrieved Student: " + retrievedStudent.getName() + " (ID: " + retrievedStudent.getId() + ")");
        } else {
            System.out.println("Student not found.");
        }

        
        System.out.println("All Students:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println(student.getName() + " (ID: " + student.getId() + ")");
        }

        
        boolean isRemoved = studentManager.removeStudentById(2);
        if (isRemoved) {
            System.out.println("Student with ID 2 removed successfully.");
        } else {
            System.out.println("Student with ID 2 not found.");
        }

        
        System.out.println("All Students after removal:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println(student.getName() + " (ID: " + student.getId() + ")");
        }
    }
}
