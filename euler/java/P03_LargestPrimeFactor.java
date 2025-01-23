package euler.java;

public class P03_LargestPrimeFactor 
{
    public static void main(String[] args) 
    {
        int testNum = 100; 
    }

    static int[] factorList(int num)
    {
        int [] factorListAscending = new int; 
    }
    
    static int largestPrimeFactor(int num)
    {

        int largestPrimeFactor = 1;

        for(int i = 2; i == num; i++)
        {
            if(num % i == 0)
            {
                largestPrimeFactor = i;
            }
        }

        return largestPrimeFactor;
    }
}
