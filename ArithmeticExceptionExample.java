public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Pembagian dengan nol
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
