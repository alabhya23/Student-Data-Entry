import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Branch");
            System.out.println("6. Search by Batch");
            System.out.println("7. Search by CGPA");
            System.out.println("8. Search by Position");
            System.out.println("9. Update Student CGPA");
            System.out.println("10. Delete Student");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        operations.addStudent();
                        break;
                    case 2:
                        operations.displayStudents();
                        break;
                    case 3:
                        operations.searchByPRN();
                        break;
                    case 4:
                        operations.searchByName();
                        break;
                    case 5:
                        operations.searchByBranch();
                        break;
                    case 6:
                        operations.searchByBatch();
                        break;
                    case 7:
                        operations.searchByCgpa();
                        break;
                    case 8:
                        operations.searchByPosition();
                        break;
                    case 9:
                        operations.updateStudent();
                        break;
                    case 10:
                        operations.deleteStudent();
                        break;
                    case 11:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InvalidStudentDataException | StudentNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        } while (choice != 11);

        sc.close();
    }
}
