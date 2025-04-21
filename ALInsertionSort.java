import java.util.ArrayList;
import java.util.Arrays;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;
		
		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int i = 1; i < myNumbers.length;i++)
		{
			inserted = false;
			for(int j = 0; j < sorted.size() && inserted == false; j++)
			{
				if(myNumbers[i] < sorted.get(j))
				{
					sorted.add(j,myNumbers[i]);
					inserted = true;
				}
				
				
			}
			if(inserted == false)
			{
				sorted.add(myNumbers[i]);
			}
		}
        System.out.println("my sorted arraylist " + (sorted.toString()));

		//Move the data back to the array

		//Print the contents of the array

    }


}
