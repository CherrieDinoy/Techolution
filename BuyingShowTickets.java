/**
 * Created by cd185134 on 5/14/2018.
 */
import java.util.*;
public class BuyingShowTickets {
    static long waitingTimes( int[] tickets, int p) {
        long times = 0;
        int[] temp = Arrays.copyOf(tickets, tickets.length);
        for(int i = 0; i < tickets.length; i++ ) {
            temp[i] = tickets[i] - tickets[p];
        }
        for(int i = 0; i < tickets.length; i++ ) {
            if(temp[i] < 0) times += tickets[i];
            else {
                if(i <= p) times += tickets[p];
                else times += tickets[p] - 1;
            }
        }
        return times;
    }

    public static void main(String[] args)
    {
        int[] input = {1,2,5};
        int in =1;
        long res = waitingTimes(input, in);

        System.out.println(res);

    }
}
