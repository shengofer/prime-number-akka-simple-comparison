package com.geekcap.akka.simpleprime;
import java.util.*;

public class PrimeNum
{
    public static void main(String args[])
    {
        //getPrimeNumInRange(1,23);
        int limit = 1000000;
        long startTime = System.nanoTime();
        //printing primer numbers till the limit ( 1 to 100)
        System.out.println("Printing prime number from 1 to " + limit);
        for(int number = 2; number<=limit; number++){
            //print prime numbers only
            if(isPrime(number)){
                System.out.println(number);
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Took " + (endTime - startTime)/10e9 + " s");


    }

    public static void getPrimeNumInRange(int start, int end){
        int n, status = 1, num = 3;
        for ( int count = start ; count <=end ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
    }

    public static void firstPrimeNum(){
        int n, status = 1, num = 3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want");
        n = in.nextInt();

        if (n >= 1)
        {
            System.out.println("First "+n+" prime numbers are :-");
            System.out.println(2);
        }

        for ( int count = 2 ; count <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; //number is divisible so its not prime
            }
        }
        return true; //number is prime now
    }


}
