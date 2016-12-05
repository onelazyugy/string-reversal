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
}
