import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practical4C {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("sample.csv");
             FileWriter fw = new FileWriter("copy_sample.csv")) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c); } System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
