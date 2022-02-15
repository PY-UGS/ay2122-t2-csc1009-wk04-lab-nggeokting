import java.lang.Math;

public class BMI {
    private double weight;
    private double height;
    
    static final double WEIGHTCONVERTER = 0.45359237;
    static final double HEIGHTCONVERTER =  0.0254;

    public BMI (double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateBMI(){
        double bmiConverted = (weight * WEIGHTCONVERTER) / Math.pow(height * HEIGHTCONVERTER,2);
        System.out.println("BMI is " + bmiConverted);

        if (bmiConverted < 18.5){
            System.out.println("Underweight");
            return;
        }
        if (bmiConverted < 25.0){
            System.out.println("Normal");
            return;
        }
        if (bmiConverted < 30.0){
            System.out.println("Overweight");
            return;
        }
        if (bmiConverted >= 30.0){
            System.out.println("Obese");
            return;
        }
    }
}
