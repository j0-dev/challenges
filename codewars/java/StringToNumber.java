import java.util.Scanner;

public class StringToNumber 
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String userNumber = inputScanner.nextLine();

        try
        {
            int result = stringToNumber(userNumber);
            System.out.println("The string as a number is: " + result);

        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid");
        }
    }  
    
    public static int stringToNumber(String str)
    {
        return Integer.parseInt(str); 
    }
}
