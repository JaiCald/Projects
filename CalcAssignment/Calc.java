public class Calc {
    private double num1;
    private double num2;

    public Calc() {
        num1 = 0;
        num2 = 0;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public double sum() {
        return num1 + num2;
    }
    public double difference() {
        return num1 - num2;
    }
    public double product() {
        return num1 * num2;
    }

    public double quotient() {
        return num1 / num2;
    }
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}