//Author: Stewart Hetherington.
//Cracking the Coding Interview Q1.2
//Check Permutation. Given two strings, write a method to decide if one is a permutation of the other.

public class Question1_2 {
    public static void main(String args[]) {
        String s1 = "subZtring$ubstringsubStringsub";
        String s2 = "subString";
        System.out.println(isPermutation(s1, s2));
    }
    public static boolean isPermutation(String s1, String s2) 
    {
        char[] s2_charArray = s2.toCharArray();
        int count = 0;
        
        for(int i = 0; i < s1.length(); i++)
        {
            if(s2.contains(s1.substring(i, i+1) ) ) 
            {
                count++;
                //if s2 is a permutation of s1 return true.
                if( count == s2.length() ) return true;
            }
            else //Jump (count + i) spaces through the array to avoid detected false substring characters.
            {
                i += count; 
                count = 0;
            }
        }
        return false;
    }
}
