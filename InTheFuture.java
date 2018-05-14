/**
 * Created by cd185134 on 5/14/2018.
 */

public class InTheFuture {

    static int minNum(int A, int K, int P){
             int min = -1;
                if(K != 0 || A != 0){
                    min = P/(K-A)+1;
                }
                return min;
    }
    public static void main(String[] args) {
        int asha = 4;
        int kelly = 5;
        int p = 1;
        System.out.println(minNum(asha,kelly,p));
        asha = 3;
        kelly = 5;
        p = 1;
        System.out.println(minNum(asha,kelly,p));
    }
}
