import java.util.*;

public class StudentOperations {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> s = new ArrayList<>();

    public void addStudent() throws InvalidStudentDataException {
        System.out.print("Enter PRN: ");
        String prn = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Branch: ");
        String branch = sc.next();
        System.out.print("Enter Batch: ");
        String batch = sc.next();
        System.out.print("Enter CGPA: ");
        float cgpa = sc.nextFloat();
        System.out.print("Enter Position: ");
        int position = sc.nextInt();

        for (Student st : s) {
            if (st.prn.equals(prn)) {
                throw new InvalidStudentDataException("Student with this PRN already exists.");
            }
        }

        if (name.isEmpty() || branch.isEmpty() || batch.isEmpty()) {
            throw new InvalidStudentDataException("Fields cannot be empty.");
        }

        Student st = new Student(prn, name, branch, batch, cgpa, position);
        s.add(st);
    }

    public void displayStudents() {
        if (s.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student st : s) {
                st.display();
            }
        }
    }

    public void searchByPRN() throws StudentNotFoundException {
        System.out.print("Enter PRN to search: ");
        String prn = sc.next();
        boolean found = false;
        for (Student st : s) {
            if (st.prn.equals(prn)) {
                st.display();
                found = true;
                break;
            }
        }
        if (!found) throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    public void searchByName() throws StudentNotFoundException {
        System.out.print("Enter Name to search: ");
        String name = sc.next();
        boolean found = false;
        for (Student st : s) {
            if (st.name.equalsIgnoreCase(name)) {
                st.display();
                found = true;
            }
        }
        if (!found) throw new StudentNotFoundException("Student with name " + name + " not found.");
    }

    public void searchByBranch() throws StudentNotFoundException {
        System.out.print("Enter Branch to search: ");
        String branch = sc.next();
        boolean found = false;
        for (Student st : s) {
            if (st.branch.equalsIgnoreCase(branch)) {
                st.display();
                found = true;
            }
        }
        if (!found) throw new StudentNotFoundException("No student found in branch " + branch);
    }

    public void searchByBatch() throws StudentNotFoundException {
        System.out.print("Enter Batch to search: ");
        String batch = sc.next();
        boolean found = false;
        for (Student st : s) {
            if (st.batch.equalsIgnoreCase(batch)) {
                st.display();
                found = true;
            }
        }
        if (!found) throw new StudentNotFoundException("No student found in batch " + batch);
    }

    public void searchByCgpa() throws StudentNotFoundException {
        System.out.print("Enter CGPA to search: ");
        float targetCGPA = sc.nextFloat();
        boolean found = false;
        for (Student st : s) {
            if (st.cgpa == targetCGPA) {
                st.display();
                found = true;
            }
        }
        if (!found) throw new StudentNotFoundException("No student with CGPA " + targetCGPA);
    }

    public void searchByPosition() throws StudentNotFoundException {
        System.out.print("Enter position (starting from 0): ");
        int pos = sc.nextInt();
        if (pos < 0 || pos >= s.size()) {
            throw new StudentNotFoundException("No student at position " + pos);
        }
        s.get(pos).display();
    }

    public void updateStudent() throws StudentNotFoundException {
        System.out.print("Enter PRN of student to update: ");
        String prn = sc.next();
        boolean found = false;
        for (Student student : s) {
            if (student.prn.equals(prn)) {
                System.out.print("Enter new CGPA: ");
                float cgpa = sc.nextFloat();
                student.setCGPA(cgpa);
                found = true;
                break;
            }
        }
        if (!found) throw new StudentNotFoundException("No student with PRN " + prn);
    }

    public void deleteStudent() {
        System.out.print("Enter PRN of student to delete: ");
        String prn = sc.next();
        boolean removed = s.removeIf(student -> student.prn.equals(prn));
        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
