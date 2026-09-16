import java.util.Scanner;

public class twoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = 14;
        int[] arr = { 2, 6, 5, 8, 11 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Yes");
                }
            }
        }

    }
}
