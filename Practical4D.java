import java.io.File;

public class Practical4D {
    public static void main(String[] args) {
        File file = new File("student.csv");
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File not found!");
        }
    }
}
