package ss13_tim_kiem;
import java.util.Arrays;
import java.util.Scanner;

public class chuoi {

    public class SortCharactersInString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào một chuỗi bất kỳ: ");
            String input = scanner.nextLine();
            char[] characters = input.toCharArray();
            Arrays.sort(characters);
            String sortedString = new String(characters);
            System.out.println("Chuỗi sau khi sắp xếp tăng dần là: " + sortedString);
        }
    }
}
