/***************************************************************
 * Author: Thomas Kramer                                       *
 * Purpose: To get input from the user                         *
 * Date: 15/04/2016 3:23apm                                    *
***************************************************************/


import java.util.*;

public class DataInput
{

    public static String readMorse()
    {
        {
            Scanner sc = new Scanner(System.in);
            boolean specialCharacters = true;
            String inputtedString = "";
           do{    
            System.out.println("Please enter the text you would like to convert to Morse Code:");
            inputtedString = sc.nextLine();
            specialCharacters = CheckStringContainsSpecialCharacters.containsSpecialCharacters(inputtedString);
            if (specialCharacters == true){
                System.out.println("Sorry you can't convert special characters.");
            }
           }while(specialCharacters == true);
            return inputtedString;
        }   
    }

    public static String readEnglish()
    {
        Scanner sc = new Scanner(System.in);
        boolean specialCharacters = true;
        String inputtedString = "";
       do{    
        System.out.println("Please enter the text you would like to convert to Morse Code:");
        inputtedString = sc.nextLine();
        specialCharacters = CheckStringContainsSpecialCharacters.containsSpecialCharacters(inputtedString);
        if (specialCharacters == true){
            System.out.println("Sorry you can't convert special characters.");
        }
       }while(specialCharacters == true);
        return inputtedString;
    }    

}