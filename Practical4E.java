import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Practical4E {
    public static void main(String[] args) {
        String fileName = "student.csv";
        try {
            Path path = Paths.get(fileName);
            List<Student> studentCollection = Files.lines(path)
                    .skip(1)
                    .filter(line -> !line.trim().isEmpty())
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length >= 8)
                    .map(parts -> new Student(
                            parts[1].trim(), Integer.parseInt(parts[5].trim()) + Integer.parseInt(parts[6].trim()) + Integer.parseInt(parts[7].trim()))
                    )
                    .toList();
            for (Student student : studentCollection) {
                System.out.println(student.getName() + "," + student.getTotalMarks());
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

class Student {
    private final String name;
    private final int totalMarks;
    public Student(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }
    public String getName() {
        return name;
    }
    public int getTotalMarks() {
        return totalMarks;
    }
}