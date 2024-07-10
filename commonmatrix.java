import java.util.Scanner;

    import java.util.ArrayList;
    import java.util.HashSet;
    public class commonmatrix {
    
        public static void main(String[] args) {
            int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[][] matrix2 = {{3, 2, 1}, {4, 1, 5}, {9, 8, 7}};
    
            ArrayList<Integer> commonElements = findCommonElements(matrix1, matrix2);
    
            if (commonElements.isEmpty()) {
                System.out.println("No common elements found.");
            } else {
                System.out.println("Common elements:");
                for (int element : commonElements) {
                    System.out.print(element + " ");
                }
            }
        }
    
        public static ArrayList<Integer> findCommonElements(int[][] matrix1, int[][] matrix2) {
            HashSet<Integer> set1 = new HashSet<>();
            ArrayList<Integer> commonElements = new ArrayList<>();
    
            
            for (int[] row : matrix1) {
                for (int element : row) {
                    set1.add(element);
                }
            }
    
            for (int[] row : matrix2) {
                for (int element : row) {
                    if (set1.contains(element) && !commonElements.contains(element)) {
                        commonElements.add(element);
                    }
                }
            }
    
            return commonElements;
        }
    }
     

