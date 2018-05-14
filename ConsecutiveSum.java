/**
 * Created by cd185134 on 5/14/2018.
 */

public class ConsecutiveSum {
    static int consecutive(long num)
    {
        int count = 0;
        for (int i = 1; i * (i + 1) < 2 * num; i++)
        {
            float a = (float) ((1.0 * num-(i * (i + 1)) / 2) / (i + 1));
            if (a-(int)a == 0.0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long num = 15;
        System.out.println(consecutive(num));
        num = 10;
        System.out.println(consecutive(num));
    }
}

