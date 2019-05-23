import java.io.Serializable;
import java.util.List;

public class Lecture implements Serializable {
    private List<Student> studentList;

    public Lecture(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "studentList=" + studentList +
                '}';
    }
}
