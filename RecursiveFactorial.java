
/**
 * Two implementations of the factorial function.
 * This is just a place holder class for the two functions
 *
 * @author Charles Hoot
 * @version 4.0
 */
public class RecursiveFactorial
{

    /**
     * The basic recursive factorial.
     *
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long basic(long n)
    {
        long result = 1;
        if (n > 1)
            result = n*basic(n-1);

        return result;
    }



    /**
     * The tail recursive version of factorial.
     *
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long tailRecursive(long n)
    {
        long result = 0;

        result = helper(n, 1);

        return result;
    }

    /**
     * The tail recursive helper function for factorial.
     *
     * @param  n   The number to compute factorial of.
     * @param  partial   The partial result that is being built up.
     * @return     n factorial.
     */

    private long helper(long n, long partial)
    {
        long result = partial;

        if (n > 1){
          //System.out.println("n: "+n);
          //System.out.println("n-1: "+(n-1));
          result = partial*(n*(n-1));
          System.out.println("Partial: "+result);
          helper(n-2, result);
          System.out.println("Result: "+result);

        }
        return result;
    }



}
