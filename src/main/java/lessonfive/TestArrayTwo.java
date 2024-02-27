package lessonfive;

public class TestArrayTwo {

    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[][] arrayTwo = {{5, 6, 7}, {8, 9, 10}, {11, 12, 13}};

        printArray(arrayTwo);
        int[][] arrayThree = {{5, 6, 7, 8}, {1, 2}, {4, 5, 6, 7, 9, 9}};
        System.out.println();
        printArray(arrayThree);
        int[][] arrayFour = new int[3][];
        printArray(arrayFour);
    }

    private static void printArray(int[][] arrayTwo) {
        for (int i = 0; i < arrayTwo.length; i++) {
            // if (arrayTwo[i] != null){
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j] + " ");
            }
        //}
            System.out.println();
        }
    }

}
