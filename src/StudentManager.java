import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students=new ArrayList<>();

    void addStudent(Student s){
        students.add(s);
    }

    void displayStudents(){

        for(Student s:students){
            s.display();
        }

    }
}