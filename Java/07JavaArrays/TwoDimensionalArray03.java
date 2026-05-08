class TwoDArray{
    public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 78},
            {92, 88, 95},
            {80, 85, 82}
        };

        System.out.println("Marks of student 1: " + marks[0][0] + ", " + marks[0][1] + ", " + marks[0][2]);

        System.out.println("Marks Length: " + marks.length);

        System.out.println("Marks of student 1 Length: " + marks[0].length);

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Marks of student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

    }
}