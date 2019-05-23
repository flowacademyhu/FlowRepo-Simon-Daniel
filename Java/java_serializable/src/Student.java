import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int atlag;

    public Student(String name, int atlag) {
        this.name = name;
        this.atlag = atlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtlag() {
        return atlag;
    }

    public void setAtlag(int atlag) {
        this.atlag = atlag;
    }
}
