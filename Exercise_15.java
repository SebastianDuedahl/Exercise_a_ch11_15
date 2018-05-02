package Chapter_11_a_15;
import java.util.*;

/*
Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the
most frequently occurring integer (the “mode”) occurs in the list. Solve this problem using a map as auxiliary storage.
If the list is empty, return 0.
 */

public class Exercise_15
{
    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);

        System.out.println(maxOccurrences(list));




    }
    public static int maxOccurrences (List<Integer> list)
    {
        Map<Integer, Integer> temp = new HashMap<>();

        Iterator<Integer>  itr = list.iterator();

        while (itr.hasNext())
        {
            int number = itr.next();

            if (temp.containsKey(number))
            {
                temp.put(number, temp.get(number) + 1);
            }
            else
                {
                    temp.put(number, 1);
                }
        }
        int max = 0;

        for (int count : temp.values())
        {
            if (count > max)
            {
                max = count;
            }
        }
        return max;
    }

}
