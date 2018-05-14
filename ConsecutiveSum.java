/**
 * Created by Cherrie Mae Dinoy on 5/14/2018.
 */

public class ConsecutiveSum {
    /*
    Given a long integer, num, find the number of ways to represent it as a sum of two or
    more consecutive positive integers.
     */
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

