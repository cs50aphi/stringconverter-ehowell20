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
        return str;
    }
    // give string str, return str in shorthand
    public static String shorthand(String str)
    {
        return str;
    }
}