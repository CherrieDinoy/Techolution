/**
 * Created by cd185134 on 5/14/2018.
 */

public class InTheFuture {

    static int minNum(int A, int K, int P){
         static int minNum(int A, int K, int P){
       return P/(K-A)+1;  
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
