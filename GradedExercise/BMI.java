package GradedExercise;

public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    // BMI with age
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // BMI  without age
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = 21;
        this.weight = weight;
        this.height = height;
    }

    // Calculate BMI
    public double getBMI() {
        return weight * 703 / (height * height);
    }

    // Check BMI status
    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    // Test the BMI class
    public static void main(String[] args) {

        BMI bmi = new BMI("Nimca", 20, 120, 65);

        System.out.println("Name: " + bmi.getName());
        System.out.println("Age: " + bmi.getAge());
        System.out.println("Weight: " + bmi.getWeight());
        System.out.println("Height: " + bmi.getHeight());

        System.out.println("BMI: " + bmi.getBMI());
        System.out.println("Status: " + bmi.getStatus());
    }
}