package com.geekcap.akka.simpleprime;

import com.geekcap.akka.prime.message.Result;

/**
 * Created by shen on 29.03.15.
 */
public class PrimeNumber {

    public static void main(String args[])
    {
        Result res = new Result();
        //getPrimeNumInRange(1,23);
        int startNumber = 1;
        int endNumber = 1000_000_0;
        long startTime = System.nanoTime();
        //printing primer numbers till the limit ( 1 to 100)
        System.out.println("Printing prime number from 1 to " + endNumber);
        for(long number = startNumber; number<=endNumber; number++){
            //print prime numbers only
            if(isPrime(number)){
                res.getResults().add(number);
                //System.out.println(number);
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Took " + (endTime - startTime)/10e9 + " s");


    }

    private static boolean isPrime( long n )
    {
        if( n == 1 || n == 2 || n == 3 )
        {
            return true;
        }

        // Is n an even number?
        if( n % 2 == 0 )
        {
            return false;
        }

        //if not, then just check the odds
        for( long i=3; i*i<=n; i+=2 )
        {
            if( n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
