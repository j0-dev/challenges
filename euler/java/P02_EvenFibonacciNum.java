public class P02_EvenFibonacciNum 
{
    public static void main(String[] args) 
    {
        int fib = 1;
        int next = 2;
        int sum = 0;
 
        while(fib < 4000000)
        {
            if(fib % 2 == 0)
            {
                sum += fib;
            }
            
            int temp = fib + next;
            fib = next;
            next = temp;

        }

        System.out.println(sum);
    }       
}    

