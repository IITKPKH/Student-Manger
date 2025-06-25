import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentmanager {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String []> students = new ArrayList<>();
    
        while(1<21) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students \n 4.Update Students");
            System.out.println("3. Exit ");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter student Grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine();
                    students.add(new String[]{name.toUpperCase(), String.valueOf(id), String.valueOf(grade)});
                    break;
                case 2:
                    System.out.println("Students List:");
                    for (String[] student : students) {
                        System.out.println("Name: " + student[0] + ", ID: " + student[1] + ", Grade: " + student[2]);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                case 4:
                    System.out.println("enter the id of student to change");
                    //String updateId = scanner.nextLine();
                    update(scanner.next(),students);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    static void update(String id, ArrayList<String[]> students){
        for (String[] student : students){
            if(student[1].equals(id)){
                System.out.println("Select the field to change \n1.Change name ,2.change id ,3. change grade");
                int choice=scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 1:
                        System.out.println("enter updated name");
                        student[0] = scanner.nextLine().toUpperCase();
                        System.out.println("new name :"+student[0]);
                        break;
                    case 2:
                        System.out.println("enter new id (id should be unique lwde)");
                        student[1]=scanner.nextLine();
                        System.out.println("id changd......!");
                        break;
                    case 3:
                        System.out.println("enter new grades");
                        student[2]= scanner.nextLine();
                        System.out.println("grades updated");
                        break;
                    default:
                        System.out.println("not valid (only select numbers from 1,2,3)");
                        break;
                }
            }
        }
    }
}