package Lab7;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];
        System.out.println("Таблица 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}