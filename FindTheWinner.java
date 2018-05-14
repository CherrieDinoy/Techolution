/**
 * Created by cd185134 on 5/14/2018.
 */

public class FindTheWinner {
    public static void main(String[] args)
    {
        int[] andrea = {1,2,3};
        int[] maria ={2,1,3};
        String s= "Even";

        System.out.println(winner(andrea,maria,s));
    }


    static String winner(int[] andrea , int[] maria, String s){
        int aScore = 0;
        int mScore = 0;
        for (int i = 0; i < andrea.length; i++) {
            if (s == "Even" && i % 2 == 0) {
                aScore += andrea[i] - maria[i];
                mScore += maria[i] - andrea[i];
            }
            if (s == "Odd" && Math.abs(i % 2) == 1) {
                aScore += andrea[i] - maria[i];
                mScore += maria[i] - andrea[i];
            }
        }
        if (aScore > mScore)
            return "Andrea";
        if (aScore < mScore)
            return "Maria";
        return "Tie";
    }
}
