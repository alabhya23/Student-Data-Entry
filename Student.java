
public class Student {
    String prn, name, branch, batch;
    float cgpa;
    int position;

    public Student(String prn, String name, String branch, String batch, float cgpa, int position) {
        this.prn = prn;
        this.name = name;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
        this.position = position;
    }

    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", Branch: " + branch + ", Batch: " + batch + ", CGPA: " + cgpa + ", Position: " + position);
    }

    public void setCGPA(float cgpa) {
        this.cgpa = cgpa;
    }
}
