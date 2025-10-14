import java.util.Scanner;
import java.util.TreeMap;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}
public class Practical3B{
    public static void main(String[] args) {
        TreeMap<String, Integer> students = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Student (or end): ");
            String name = sc.nextLine();
            if(name.equals("end")) break;
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            try {
                if(marks < 0 || marks > 100) throw new InvalidMarksException("Invalid marks");
                students.put(name, marks);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("--- Sorted List ---");
        for(String k : students.keySet()) {
            System.out.println(k + " " + students.get(k));
        }
        String topName = ""; int topMarks = -1;
        for(String k : students.keySet()) {
            if(students.get(k) > topMarks) {
                topMarks = students.get(k); topName = k;
            }
        }if(topMarks != -1)
            System.out.println("Top Scorer: " + topName + " " + topMarks);
    }
}