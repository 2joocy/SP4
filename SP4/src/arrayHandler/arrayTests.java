package arrayHandler;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author William
 */
public class arrayTests {

    public void freq(final int[] numbers)
    {
        final SortedMap<Integer, Integer> numCounts = new TreeMap<>();

        for (final Integer i : numbers)
        {
            Integer count = numCounts.get(i);   
            if (count == null) count = 0;       
            numCounts.put(i, ++count);          
        }

        
        for (final Integer n : numCounts.keySet())
        {
            System.out.printf("%d | %d\n", n, numCounts.get(n));
        }
    }
    
}
