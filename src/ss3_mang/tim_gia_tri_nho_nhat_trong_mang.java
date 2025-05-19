package ss3_mang;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng ");
        int row = scanner.nextInt();
        System.out.println("nhập số cột");
        int col = scanner.nextInt();

        double[][] mintrix = new double[row][col];
        System.out.println("nhập các phần tử trong ma trận ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mintrix[i][j] = scanner.nextDouble();
            }
        }
        double min = mintrix[0][0];
        int minRow = 0, minCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mintrix[i][j] < min) {
                    min= mintrix[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        System.out.println("giá trị nhỏ nhất của mảng hai chiều là " + min);
        System.out.println("toạ dộ hàng " + minRow + "cột" + minCol);
        scanner.close();
    }
}
