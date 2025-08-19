import java.util.Random;
import java.util.Scanner;

public class Lottery {
 public static void main(String[] args) {
  Random variable = new Random();
  int random = variable.nextInt(90) + 10;
  System.out.println("Enter your lottery number: ");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int randomUnit = random % 10, randomTen = (random / 10);
  int userUnit = num % 10, userTen = (num / 10);
  if (num == random) {
   System.out.println("Your award is $10,000.");
  } else if (randomUnit == userTen && randomTen == userUnit) {
   System.out.println("Your award is $3,000.");
  } else if (randomUnit == userTen || randomTen == userTen || randomUnit == userUnit || randomTen == userUnit) {
   System.out.println("Your award is $1,000.");
  } else {
   System.out.println("You lost!.");
  }
  System.out.println("Lottery Number : " + random);
  System.out.println("Your Number : " + num);
  sc.close();
 }
}
