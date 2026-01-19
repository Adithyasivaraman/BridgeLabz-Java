import java.util.Scanner;
public class MatrixOperations {
    //matrix creation
    public static double[][] createRandomMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 1 + (int)(Math.random() * 9);
            }
        }
        return matrix;
    }
    //display
    public static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
    //basic operations
    public static double[][] add(double[][] a, double[][] b) {
        int n = a.length;
        double[][] r = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                r[i][j] = a[i][j] + b[i][j];
        return r;
    }
    public static double[][] subtract(double[][] a, double[][] b) {
        int n = a.length;
        double[][] r = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                r[i][j] = a[i][j] - b[i][j];
        return r;
    }
    public static double[][] multiply(double[][] a, double[][] b) {
        int n = a.length;
        double[][] r = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    r[i][j] += a[i][k] * b[k][j];
        return r;
    }
    public static double[][] transpose(double[][] m) {
        int n = m.length;
        double[][] t = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = m[i][j];
        return t;
    }
    //determinant
    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }
    //inverse
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        return new double[][] {
                {  m[1][1]/det, -m[0][1]/det },
                { -m[1][0]/det,  m[0][0]/det }
        };
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;
        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;
        return inv;
    }
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 2 && n != 3) {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            return;
        }
        double[][] A = createRandomMatrix(n);
        double[][] B = createRandomMatrix(n);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);
        System.out.println("\nAddition:");
        displayMatrix(add(A, B));
        System.out.println("\nSubtraction:");
        displayMatrix(subtract(A, B));
        System.out.println("\nMultiplication:");
        displayMatrix(multiply(A, B));
        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(A));
        double det = (n == 2) ? determinant2x2(A) : determinant3x3(A);
        System.out.println("\nDeterminant of A: " + det);
        System.out.println("\nInverse of A:");
        double[][] inv = (n == 2) ? inverse2x2(A) : inverse3x3(A);
        displayMatrix(inv);
    }
}
