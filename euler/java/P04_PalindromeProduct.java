public class P04_PalindromeProduct 
{
    public static void main(String[] args) 
    {

    }  
    
    static boolean isPalindrome (String number)
    {
        String numString = String.valueOf(number);
        String numStringReverse = new StringBuilder(numString).reverse().toString();

        numString.equals(numStringReverse);
        {
            return true;
        }
    }
}
