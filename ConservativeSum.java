/**
 * Created by cd185134 on 5/12/2018.
 */

public class ConservativeSum {
    static int countConsecutive(int N)
    {
        int count = 0;
        for (int L = 1; L * (L + 1) < 2 * N; L++)
        {
            float a = (float) ((1.0 * N-(L * (L + 1)) / 2) / (L + 1));
            if (a-(int)a == 0.0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 15;
        System.out.println(countConsecutive(N));
        N = 10;
        System.out.println(countConsecutive(N));
    }
}
