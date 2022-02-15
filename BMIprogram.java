import java.util.Scanner;

public class BMIprogram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInput = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInput = input.nextDouble();

        BMI bmi = new BMI(weightInput, heightInput);
        bmi.calculateBMI();

        input.close();
    }
}
