import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("cica", 5);
        Student student2 = new Student("kutya", 1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        Lecture list = new Lecture(studentList);

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(list);

        oos.close();

        FileInputStream fileInputStream = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        Lecture list2 = (Lecture) ois.readObject();
        ois.close();

        System.out.println(list2.toString());



    }




}
