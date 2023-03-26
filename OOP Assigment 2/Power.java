public class Power {
    // First power function
    public static double power(double n, int p) {
        double result = 1.0;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
    
    // Second power function
    public static int power(int n) {
        return power(n, 2); // default value of p is 2
    }
    
    // Overloaded  power function
    public static int power(int n, int p) {
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Power obj=new Power();
        System.out.println("First : "+obj.power(2.5, 3)); 
        System.out.println("Second : "+obj.power(2)); // should print 4
        System.out.println("Overloaded third : "+obj.power(3, 4)); // should print 81
    }
}
