package com.geekcap.akka.prime;

import akka.actor.UntypedActor;
import com.geekcap.akka.prime.message.Result;


public class PrimeListener extends UntypedActor
{
    @Override
    public void onReceive( Object message ) throws Exception
    {
        if( message instanceof Result )
        {
            Result result = ( Result )message;

            System.out.println( "Results: " );
      /*      for( Long value : result.getResults() )
            {
                System.out.print( value + ", " );
            }*/
            System.out.println();
            TimeCounter.endTime = System.nanoTime();
            TimeCounter.writeTime();
            // Exit
            getContext().system().shutdown();
        }
        else
        {
            unhandled( message );
        }
    }
}
