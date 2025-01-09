import java.util.Scanner;

public class countingSheep 
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);
        int num = inputScanner.nextInt();

        String result = countingSheepFunction(num);
        System.out.println(result);
    }

    public static String countingSheepFunction(int num)
    {
        StringBuilder result = new StringBuilder();
        String sheepPhrase = " sheep...";

        if(num > 0)
        {
            for(int i = 1; i <= num; i++)
            {
                result.append(i).append(sheepPhrase);
            }
            return result.toString();
        }
        else
        {
            return "Error";
        }
    }    
}
