package sorting;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minInd = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[minInd] > arr[j]) {
                    minInd = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
