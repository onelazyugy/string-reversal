package com.viet.utilities;

/**
 * Created by Viet on 12/4/16.
 */
public final class StringUtilities {

    /**
     * Given a string, returns its reversal representation
     * @param s
     * @return
     */
    public static String reverse(String s){
        String reversal = "";
        char[] aArray = s.toCharArray();
        int nameLength = aArray.length;
        do{
            char curr = aArray[nameLength-1];
            nameLength--;
            reversal += Character.toString(curr);
        }while(nameLength != 0);
        return reversal;
    }

    /**
     * Give a string, another string to be replaced, and a replaced with string.
     * Example: given 3 parameters (hello world, wo, **), it will generate the reseult with hello **rld
     * @param toBeReplaced
     * @return
     */
    public static String replaceString(String entireString, String toBeReplaced, String replacedWith){
        //TODO
        return "";
    }
}
