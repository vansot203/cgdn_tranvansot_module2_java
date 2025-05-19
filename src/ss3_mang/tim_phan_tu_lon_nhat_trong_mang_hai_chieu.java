package ss3_mang;

import java.util.Scanner;

public class tim_phan_tu_lon_nhat_trong_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng ");
        int row = scanner.nextInt();
        System.out.println("nhập số cột");
        int col = scanner.nextInt();
        double[][] matrix = new double[row][col];
        System.out.println("nhập các phần tử của ma trận");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double max = matrix[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;

                }
            }
        }

        System.out.println("giá trij lớn nhất của mảng  2 chiều là " + max);
        System.out.println("toạ độ hàng " + maxRow + "cột" + maxCol);
        scanner.close();
    }


}
