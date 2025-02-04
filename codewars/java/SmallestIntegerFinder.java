public class SmallestIntegerFinder 
{
    public static void main(String[] args) 
    {
        int[] array1 = {34, 15, 88, 2};
        int[] array2 = {32, -245, -1, 100};

        System.out.println(findSmallestInt(array1));
        System.out.println(findSmallestInt(array2));
    }    

    public static int findSmallestInt(int[] args) 
    {
        int min = args[0];
        for(int num : args)
        {
            if(num < min)
            {
                min = num;
            }
        }
        return min;
    }
}
