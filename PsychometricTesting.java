/**
 * Created by cd185134 on 5/14/2018.
 */
import java.util.*;
public class PsychometricTesting {
    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        int[] output = new int[lowerLimits.length];
        Arrays.sort(scores);

        for(int i = 0;i < lowerLimits.length; i++) {
            int count = 0;

            int lowerRangeElementIndex = search(scores, 0, scores.length, lowerLimits[i]);
            int upperRangeElementIndex = search(scores, 0, scores.length, upperLimits[i]);
            if (scores[lowerRangeElementIndex] == lowerLimits[i] || (lowerRangeElementIndex == 0 && scores[lowerRangeElementIndex] > lowerLimits[i]))
                lowerRangeElementIndex--;
            count = upperRangeElementIndex - lowerRangeElementIndex ;

            output[i] = count;
        }
        return output;
    }

    static int search(int[] scores, int lower, int upper, int key)
    {
        if (lower >= upper)
            return lower;
        int mid = (lower + upper)/2;
        if (scores[mid] == key)
            return mid;
        if (scores[mid] > key)
            return search(scores, lower, mid-1, key);
        else {
            if (upper - mid == 1) {
                if(scores[upper] <= key)
                    return upper;
                else
                    return mid;
            }
            return search(scores, mid, upper, key);
        }
    }
    public static void main(String args[]){
        int[] scores = {1, 3, 5, 6, 8};
        int[] lowerLimits={2};
        int[] upperLimits={6};

        int[] jobsHolder = jobOffers(scores,lowerLimits,upperLimits);
        for(int x : jobsHolder){
            System.out.println(x);
        }
    }
}
