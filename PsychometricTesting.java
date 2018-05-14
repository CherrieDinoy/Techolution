/**
 * Created by cd185134 on 5/14/2018.
 */
import java.util.*;
public class PsychometricTesting {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {6,3,5,3,6,2,8};
		int[] lowerLimits = {2,5,7};
		int[] upperLimits = {4,6};
		
		jobOffers(scores, lowerLimits, upperLimits);
	}
	
	public static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		Arrays.sort(scores); //max number to the last;
		int offers[] = new int[lowerLimits.length];
		
		System.out.println();
		
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<lowerLimits.length;j++) {
				int maxUpperLimit = 0;
				if(j>= upperLimits.length)
					maxUpperLimit = scores[scores.length-1];
				else 
					maxUpperLimit = upperLimits[j];
				
				System.out.println("Score "+scores[i]+" LowerLimit : "+lowerLimits[j]+" UpperLimit : "+maxUpperLimit);
				if(scores[i] >= lowerLimits[j] && scores[i] <=maxUpperLimit)
					offers[j] =offers[j]+1;
			}
		}
		
		for(int i=0;i<offers.length;i++) {
			System.out.print(offers[i]+" ");
		}
		
		return offers;
	}

}
