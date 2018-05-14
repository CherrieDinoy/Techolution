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


    public static String winner(int[] andrea, int[] maria,String s) {
		int startIndex = s.equalsIgnoreCase("even")? 0 : 1;
		
		int mariaPoint = 0;
		int andreaPoint = 0;
		
		int maxLength = andrea.length > maria.length ? andrea.length : maria.length;
		
		int[] andreaFinal = new int[maxLength];
		int[] mariaFinal = new int[maxLength];
		
		System.arraycopy(andrea, 0, andreaFinal, 0, andrea.length);
		System.arraycopy(maria, 0, mariaFinal, 0, maria.length);

		for(int i=startIndex;i<maxLength;i = i+2) {
			andreaPoint += (andreaFinal[i]-mariaFinal[i]);
			mariaPoint += (mariaFinal[i] - andreaFinal[i]);
		}
		
		System.out.println("Andrea points : "+andreaPoint);
		System.out.println("Maria points : "+mariaPoint);
		
		if(andreaPoint > mariaPoint)
			return "Andrea";
		else if ( mariaPoint > andreaPoint)
			return "Maria";
		else
			return "Tie";
	}
}
