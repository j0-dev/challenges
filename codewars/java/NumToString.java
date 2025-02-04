import java.util.Scanner;

public class NumToString 
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userNumber = inputScanner.nextInt();

        String result = numberToString(userNumber);
        System.out.println("The number as a string is: " + result);
    }  
    
    public static String numberToString(int num)
    {
        return String.valueOf(num); 
    }
}
