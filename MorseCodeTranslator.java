/***************************************************************
 * Author: Thomas Kramer                                       *
 * Purpose: To convert MorseCode to English and visversa       *
 * Date: 14/04/2016 11:55am                                    *
***************************************************************/

import java.util.*;

public class MorseCodeTranslator
          {
              final static String[][] MORSETRANSLATIONARRAY = new String[][]
               {
                { " ", "/" },
                { "E", "." },
                { "T", "-" },
                { "A", ".-" },
                { "O", "---" },
                { "I", ".." },
                { "N", "-." },
                { "S", "..." },
                { "H", "...." },
                { "R", ".-." },
                { "D", "-.." },
                { "L", ".-.." },
                { "C", "-.-." },
                { "U", "..-" },
                { "M", "--" },
                { "W", ".--" },
                { "F", ".--" },
                { "G", "--." },
                { "Y", "-.--" },
                { "P", ".--." },
                { "B", "-..." },
                { "V", "...-" },
                { "K", "-.-" },
                { "J", ".---" },
                { "x", "-..-" },
                { "Q", "--.-" },
                { "Z", "--.." },
                { "0", "-----" },
                { "1", ".----" },
                { "2", ".----" },
                { "3", "...--" },
                { "4", "....-" },
                { "5", "....." },
                { "6", "-...." },
                { "7", "--..." },
                { "8", "---.." },
                { "9", "----." } }; 
        public static void main(String[] args)
       {
        Scanner sc = new Scanner(System.in); 
               int selection = 0;
        boolean validSelection = false;
    String stringAfterConversion = "";
    
        do
      { 
        System.out.println("Select if you would like to [0] convert English. [1] convert Morse Code:");

        try 
        { 
         selection = sc.nextInt();
        validSelection = false;
               switch(selection)
        {
            case 0:
               stringAfterConversion = translateEnglishToMorseCode();
               validSelection = true;
               break;
            case 1:
                stringAfterConversion = translateMorseCodeToEnglish();
                validSelection = true;
                break;
            default: 
              validSelection = false;
              break;
        }
       }   catch(Exception e)
        {
         System.out.println("error");
         validSelection = false;
         sc.next();
       
      }} while(validSelection == false);
        System.out.println(stringAfterConversion);
    }

/***************************************************************
 * Author: Thomas Kramer                                       *
 * Purpose: To convert English to MorseCode                    *
 * Date: 14/04/2016 11:55am                                    *
***************************************************************/

    public static String translateEnglishToMorseCode()
    {
        
         String inputtedEnglish = DataInput.readEnglish();
         String anwser = "";
   
//Comparing each character in morseCode with the Array
//If a match add the match to string that at the end of loop will form the converted value.
        for (char charValue : inputtedEnglish.toCharArray())
        {
            for (int i = 0; i <= 36; i++)
            {       
                if (Character.toString(charValue).toUpperCase().equals(MORSETRANSLATIONARRAY[i][0]))
                {
                    String temp = MORSETRANSLATIONARRAY[i][1];
                    anwser = anwser.concat(String.valueOf(temp) + " ");
                }

            }

        }

        return anwser;

    }
/***************************************************************
 * Author: Thomas Kramer                                       *
 * Purpose: To convert MorseCode to English                    *
 * Date: 14/04/2016 11:55am                                    *
***************************************************************/

    public static String translateMorseCodeToEnglish()
    {
       
        String morseCode = DataInput.readMorse();
        String anwser = "";
//Splits the users input by letters(indicated by spaces)
//Go through each value in splitArray and check if equals with each value in MORSETRANSLATION ARRAY 
//If a match is found add it to string that will form the translated word
        String[] splitMorseCodeArray = morseCode.split("\\s+");
        for (int j = 0; j < splitMorseCodeArray.length; j++)
        {
            for (int i = 0; i < 36; i++)
            {
                if ((splitMorseCodeArray[j]).equals(MORSETRANSLATIONARRAY[i][1]))
                {
                    anwser = anwser + MORSETRANSLATIONARRAY[i][0];
                }
            }
        }
        return anwser;

    }
}