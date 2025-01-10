package week1.day2;

public class IsPrimeNumber {
	
	    static boolean isPrime(int n)
	    {

	        // Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;

	        return true;
	    }

		    public static void main(String args[])
		    {
		    	
		        if (isPrime(13))
		            System.out.println(" true");
		        else
		            System.out.println(" false");
}
}