
public class NullPointerException02 {

    public static void main(String[] args) {
        String employeeName = null;
        
        try {
            System.out.println(employeeName.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}
