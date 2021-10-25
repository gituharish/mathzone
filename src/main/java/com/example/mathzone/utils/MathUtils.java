package com.example.mathzone.utils;

import org.springframework.stereotype.Component;

/**
 * Util class that performs math operations
 * @author Geethu Harish
 *
 */

@Component
public class MathUtils {
	/**
	 * This method accepts two parameters a and b of the long type of whose 
 		greatest common divisor is to be found.
	 * @param a
	 * @param b
	 * @return
	 */
	public long gcd(long a, long b)
	{
	if(a%b != 0)
		return gcd(b,a%b);
	else
		return b;
	}

	// Function returns the lcm of first n numbers
	public long lcm(long n)
	{
		// The ans must be the LCM of the numbers 1 to n.
		// Initialize ans = 1. 
		long ans = 1;
		
		// Iterate over all the numbers from i = 1 to i = n. 
		// At the i’th iteration ans = LCM(1, 2, …….., i). This can be done easily as LCM(1, 2, …., i) = LCM(ans, i). 

		for (long i = 1; i <= n; i++)
			ans = (ans * i)/(gcd(ans, i));
		return ans;
	}	
}
