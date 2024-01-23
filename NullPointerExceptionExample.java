public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // Mencoba mengakses length dari objek null
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
