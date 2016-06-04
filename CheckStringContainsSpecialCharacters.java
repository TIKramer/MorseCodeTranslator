/***************************************************************
 * Author: Thomas Kramer                                       *
 * Purpose: To Check if a string contains a special character  *
 * Date: 15/04/2016 3:02 PM                                    *
***************************************************************/
public class CheckStringContainsSpecialCharacters
{
    public static boolean containsSpecialCharacters(String stringToBeChecked)
    {

        char[] specialCharacters =
        { '[', '-', '/', '@', '#', '!', '*', '$', '%', '^', '&', '.', '\'', '_', '+', '=', '{', '}', ':', '(', ')',
                '+', ']', '+' };
        boolean stringContainsSpecialCharacters = false;

        char[] charArray = stringToBeChecked.toCharArray();

        for (int i = 0; i < charArray.length; i++)
        {
            int j = 0;
            boolean foundMatch = false;
            while (j < specialCharacters.length && !foundMatch)
            {
                if (charArray[i] == specialCharacters[j])
                {
                    stringContainsSpecialCharacters = true;
                    foundMatch = true;
                }
                j++;
            }

        }
        return stringContainsSpecialCharacters;
    }
}