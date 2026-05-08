public class JaggedArray04 {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            {10, 20, 30},
            {40, 50},
            {60, 70, 80, 90}
        };

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": " + jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
