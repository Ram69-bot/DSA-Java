import java.util.*;

public class hashingMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Ram
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (hash.containsKey(key)) {
                freq = hash.get(key);

            }
            freq++;

            hash.put(key, freq);

        }

        int q = sc.nextInt();
        while (q-- != 0) {
            int s = sc.nextInt();
            if (hash.containsKey(s)) {
                System.out.println(hash.get(s));
            } else {
                System.out.println(0);
            }

        }
    }
}
