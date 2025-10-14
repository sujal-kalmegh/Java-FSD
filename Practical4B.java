import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practical4B {
    public static void main(String[] args) {
        String data = "Hello, this is a test.";
        try (FileOutputStream fos = new FileOutputStream("output.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeBytes(data);
            System.out.println("Number of bytes written: " + data.getBytes().length);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}