package Lab7;

public class Task7 {
    public static void main(String[] args) {
        int[][] bMatrix = new int[5][5];
        int[] aArray = new int[5];
        for (int i = 0; i < 5; i++) {
            int rowSum = 0;
            for (int j = 0; j < 5; j++) {
                bMatrix[i][j] = (int) (Math.random() * 20) - 5;
                if (bMatrix[i][j] > 0) rowSum += bMatrix[i][j];
            }
            aArray[i] = rowSum;
            System.out.println("A[" + i + "] = " + aArray[i]);
        }
    }
}