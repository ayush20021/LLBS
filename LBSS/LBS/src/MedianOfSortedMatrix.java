import java.util.Arrays;

public class MedianOfSortedMatrix {

    private static int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flattened = new int[rows * cols];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                flattened[index] = num;
                index++;
            }
        }
        Arrays.sort(flattened);
        int mid = flattened.length / 2;
        if (flattened.length % 2 == 0) {
            return (flattened[mid - 1] + flattened[mid]) / 2;
        } else {
            return flattened[mid];
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(findMedian(matrix));
    }
}
