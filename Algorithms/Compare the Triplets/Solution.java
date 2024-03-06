import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
    {
        int alice_points=0, bob_points=0;
        for(int i=0; i<a.size(); i++)
        {
            if(a.get(i) > b.get(i))
            {
                alice_points += 1;
            }
            else if(a.get(i) < b.get(i))
            {
                bob_points += 1;
            }
            else{continue;}
        }    
        
        List<Integer> result = new ArrayList<>();
        result.add(0,alice_points);
        result.add(1,bob_points);  
        
        return result;
    }

}
