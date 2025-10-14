import java.util.HashMap;
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String msg) {
        super(msg);
    }
}

public class Practical3A{
    public static void main(String[] args) {
        HashMap<String, Integer> cart = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("\nItem name (or end): ");
            String name = sc.nextLine();
            if(name.equals("end"))
                break;
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            try {
                if(qty < 0) throw new InvalidQuantityException("negative qty");
                cart.put(name, cart.getOrDefault(name, 0) + qty);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for(String k : cart.keySet()) {
            System.out.println(k + " " + cart.get(k));
        }
    }
}