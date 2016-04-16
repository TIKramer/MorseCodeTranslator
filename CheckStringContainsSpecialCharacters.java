/***************************************************************
 * Author: Thomas Kramer                                       *
 * Purpose: To Check if a string contains a special character  *
 * Date: 15/04/2016 3:02 PM                                    *
***************************************************************/
public class CheckStringContainsSpecialCharacters
{
    public static boolean containsSpecialCharacters(String stringToBeChecked){
   
    char[] specialCharacters = {'[','-', '/', '@', '#', '!', '*', '$', '%', '^', '&', '.', '\'', '_', '+', '=', '{', '}', ':',
                                                                                             '(', ')', '+',']','+'};
    boolean stringContainsSpecialCharacters = false;
   
    
        char[] charArray = stringToBeChecked.toCharArray();
    
        for(char characterInString: charArray){
            for(int i = 0; i <= 23; i++){
    if (characterInString == specialCharacters[i]) {
         
          stringContainsSpecialCharacters = true;
          i = 24;
    } else {
         
         stringContainsSpecialCharacters = false;
    }
    }
    
    }
    return stringContainsSpecialCharacters;
}
}