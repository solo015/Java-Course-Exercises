import java.util.Scanner;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the shape type (triangle or rectangle): ");
        String shapeType = input.nextLine();

        if (shapeType.equals("triangle")) {
            System.out.print("Enter the base of the triangle: ");
            double base = input.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = input.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("The area of the triangle is " + area);
        } else if (shapeType.equals("rectangle")) {
            System.out.print("Enter the length of the rectangle: ");
            double length = input.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = input.nextDouble();
            double area = length * width;
            System.out.println("The area of the rectangle is " + area);
        } else {
            System.out.println("Invalid shape type");
        }

        input.close();
    }
}

class Clock {
    private int hour;
    private int minutes;
    private int seconds;
    private boolean isAM;

    public Clock() {
        // sets clock to midnight (12:00 AM)
        hour = 12;
        minutes = 0;
        seconds = 0;
        isAM = true;
    }

    public Clock(int hour, boolean isAM) {
        // sets minutes and seconds to zero
        this.hour = hour;
        this.minutes = 0;
        this.seconds = 0;
        this.isAM = isAM;
    }

    public Clock(int hour, int minutes, int seconds, boolean isAM) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isAM = isAM;
    }

    public void setTime(int hour, int minutes, int seconds, boolean isAM) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isAM = isAM;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean getIsAM() {
        return isAM;
    }
}
