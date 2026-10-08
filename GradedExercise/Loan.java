package GradedExercise;

import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // No-argument constructor
    public Loan() {
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }

    // Constructor with parameters
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    // Getters and setters
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Calculate monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfPayments = numberOfYears * 12;

        return loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(
                        1 + monthlyInterestRate,
                        numberOfPayments));
    }

    // Calculate total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    // Test the Loan class
    public static void main(String[] args) {

        Loan loan = new Loan(5, 7, 5000);

        System.out.println("Annual Interest Rate: "
                + loan.getAnnualInterestRate());

        System.out.println("Number of Years: "
                + loan.getNumberOfYears());

        System.out.println("Loan Amount: "
                + loan.getLoanAmount());

        System.out.println("Monthly Payment: "
                + loan.getMonthlyPayment());

        System.out.println("Total Payment: "
                + loan.getTotalPayment());

        System.out.println("Loan Date: "
                + loan.getLoanDate());
    }
}
