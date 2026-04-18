import java.io.*;
import java.util.*;

/**
 * Primes is a program that will compute prime numbers using the sieve of Eratosthenes.
 **/

public class Primes
{

    public static void main(String args[])
    {
        int max;
        System.out.println("Please enter the maximum value to test for primality");
        max = getInt("   It should be an integer value greater than or equal to 2.");
        
        // ADD CODE TO COMPLETE THE MAIN
        LList<Integer> candidates = new LList<>(); 
        LList<Integer> prime = new LList<>(); 
        LList<Integer> composites = new LList<>(); 
       
        for(int i = 2; i <= max; i++) {
        	candidates.add(i);
        }
        int special = candidates.remove(1);
        System.out.println(special);
        prime.add(special);
        
        getComposites(candidates,composites, 2);
      
        
        System.out.println("Candidates List: \n" + candidates);
        System.out.println("\nPrimes List: \n" + prime);
        System.out.println("\nComposites List: \n" + composites);
        
        candidates.reverse();
        System.out.println("\nReveresed Candidates List: \n" + candidates);
        candidates.cycle();
        System.out.println("\nCycle Candidates List: \n" + candidates);
        prime.reverse();
        System.out.println("\nReversed Primes List: \n" + prime);
        prime.cycle();
        System.out.println("\nCycle Primes List: \n" + prime);
        composites.reverse();
        System.out.println("\nReversed Composites List: \n" + composites);
        composites.cycle();
        System.out.println("\nCycle Composites List: \n" + composites);
    }
    	
    
    /**
     * getComposites - Remove the composite values from possibles list and
     * put them in the composites list.
     *
     * @param  candidates   A list of integers holding the possible values.
     * @param  prime2   A list of integers holding the composite values.
     * @param  prime   An Integer that is prime.*/
      public static void getComposites(ListInterface<Integer> candidates, ListInterface<Integer> composites, Integer prime)	
 {  
<<<<<<< HEAD
    	  int i =1;
    	  while(i <= candidates.getLength()) {
    	  if(candidates.getEntry(i) % prime == 0) {
=======
    //Removing elements shifts the list, causing i to skip elements after each removal 
     //(e.g., for [3, 4, 5, 6], removing 4 at i=2 shifts [3, 5, 6], so i=3 checks 6, missing 5).	
     //Use a while loop
     for(int i = 1; i <= candidates.getLength(); i++) {
    		if(candidates.getEntry(i) % prime == 0) {
>>>>>>> 5f7db55b71be5788bc691e9fbb2194076a545597
    			composites.add(candidates.getEntry(i));
    			candidates.remove(i);
    		}
    	  else {
    			i++;
    		}
  
    			
    	}  
 } 

    
    /**
     * Get an integer value.
     *
     * @return     An integer. 
     */
    private static int getInt(String rangePrompt)
    {
        Scanner input;
        int result = 10;        //Default value is 10
        try
        {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }        
        catch(Exception e)
        {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;
                                    
    }    
    
}
