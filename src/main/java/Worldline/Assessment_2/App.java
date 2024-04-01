package Worldline.Assessment_2;

public class App 
{
	public static String play(int number) 
	{
		 if (number % 2 == 0)
		 {
	            return "EVEN";
		 }
		 else if (isPrime(number)) 
		 {
	            return "ODD and PRIME";
	      } 
		 else 
		 {
	            return "ODD";
	     }
	}

	    private static boolean isPrime(int number) 
	    {
	        if (number <= 1) 
	        {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) 
	        {
	            if (number % i == 0) 
	            {
	                return false;
	            }
	        }
	        return true;
	    }
}

