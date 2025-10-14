import java.io.FileWriter;
import java.io.IOException;
public class Practical4A {
    public static void main(String[] args) {
        String data = "\nThis text will be appended to the file.";
        try (FileWriter fw = new FileWriter("sample.csv", true)) {
            fw.write(data);
            System.out.println("Data appended successfully!");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
