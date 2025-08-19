import java.util.Scanner;

public class BMI {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your Weight(in pounds): ");
  double weight = sc.nextDouble();
  System.out.print("Enter your Height(in inches): ");
  double height = sc.nextDouble();
  weight *= 0.45359237;
  height *= 0.0254;
  double bmi = weight / (height * height);
  System.out.println("Your BMI = " + bmi);
  System.out.print("Enter your age: ");
  int age = sc.nextInt();
  if (age >= 20) {
   if (bmi < 18.5) {
    System.out.println("You are underweight");
   } else if (bmi < 25.0) {
    System.out.println("You are normal");
   } else if (bmi < 30.0) {
    System.out.println("You are overweight");
   } else {
    System.out.println("You are obese");
   }
  } else {
   System.out.println("You are under age!");
  }
  sc.close();
 }
}
