package Arrays.Majorityelement;

import java.util.HashMap;

class Answer {

    public int majority(int[] arr) {
        int thre = arr.length / 2;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int val : arr) {
            int uf = freq.getOrDefault(val, 0) + 1;
            freq.put(val, uf);

            if (uf > thre) {
                return val;
            }

        }
        return -1;

    }

}

public class better {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1 };

        Answer ans = new Answer();
        System.out.println(ans.majority(arr));

    }
}
