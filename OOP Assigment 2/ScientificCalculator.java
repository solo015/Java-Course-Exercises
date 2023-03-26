import java.util.Arrays;

public class ScientificCalculator {
    
    public double calculateSin(double angleInRadians) {
        return Math.sin(angleInRadians);
    }
    
    public double calculateCos(double angleInRadians) {
        return Math.cos(angleInRadians);
    }
    
    public double calculateTan(double angleInRadians) {
        return Math.tan(angleInRadians);
    }
    
    public double[] calculateSumAvgMaxMin(double[] numbers) {
        double[] result = new double[4];
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        result[0] = sum;
        result[1] = sum / numbers.length;
        result[2] = max;
        result[3] = min;
        return result;
    }
    
    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();
        double angle = Math.PI / 4;
        double[] numbers = {3.5, 2.7, 5.9, 1.2, 4.8};
        
        System.out.println("Sin(" + angle + ") = " + calculator.calculateSin(angle));
        System.out.println("Cos(" + angle + ") = " + calculator.calculateCos(angle));
        System.out.println("Tan(" + angle + ") = " + calculator.calculateTan(angle));
        System.out.println("Sum = " + calculator.calculateSumAvgMaxMin(numbers)[0]);
        System.out.println("Average = " + calculator.calculateSumAvgMaxMin(numbers)[1]);
        System.out.println("Max = " + calculator.calculateSumAvgMaxMin(numbers)[2]);
        System.out.println("Min = " + calculator.calculateSumAvgMaxMin(numbers)[3]);
    }
}

