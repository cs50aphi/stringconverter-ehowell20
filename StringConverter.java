public class StringConverter
{
    // given string str, returns a string where every letter is reversed
    public static String reverse(String str)
    {
        String reverse = "";
        // copy chars from string str into string reverse backwards
        for (int i = str.length()-1; i > -1; i--)
        {
            reverse += str.charAt(i);
        };
        return reverse;
    }
    // given string str, return true if str is a palindrome and false if not
    public static boolean checkPalindrome(String str)
    {
        String forward = "";
        // copy the letter or digit chars of str into a char array
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isLetter(str.charAt(i)))
            {
                forward += str.charAt(i);
            }
            else if (Character.isDigit(str.charAt(i)))
            {
                forward += str.charAt(i);
            }
        }
        String back = "";
        // copy forward string into string back (reversed)
        for (int i = forward.length()-1; i > -1; i--)
        {
            back += forward.charAt(i);
        }
        if (forward.equalsIgnoreCase(back))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // given string str, returns str in pig latin
    public static String pigLatinate(String str)
    {
        String vowel = "aeiou";
        String check = str.toLowerCase();
        int vowelIndex = 0;
        int strIndex = 0;
        boolean isVowel = false;
        // check if str has vowels
        // searchs for each char of str in vowel
        for (int i = 0; i < str.length(); i++)
        {
            vowelIndex = vowel.indexOf(str.charAt(i));
            // break loop if vowel found and mark vowel as true
            if (vowelIndex != -1)
            {
                strIndex = i;
                isVowel = true;
                break;
            }
        }
        // if str has no vowels
        if (!isVowel)
        {
            // english word + "ay"
            return str + "ay";
        }
        // if str begins with vowel
        else if (strIndex == 0)
        {
            // english word + "yay"
            return str + "yay";
        }
        // if str has vowel in it
        else if (isVowel)
        {
            // end = vowel char to last char in str
            String end = str.substring(strIndex, str.length());
            // start = first char up to vowel char in str
            String start = str.substring(0, strIndex);
            // return end + start + "ay"
            return end + start + "ay";
        }
        return str;
    }
    // give string str, return str in shorthand
    public static String shorthand(String str)
    {
        return str;
    }
}