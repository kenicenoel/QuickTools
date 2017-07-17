package com.kenicenoel.quicktools;

import android.text.Html;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String tools is a helper class that provides useful functions to operate on a passed String
 */

public class StringBuddy
{
    private static final String TAG = "StringBuddy" ;
    private String oldString;
    private String newString;


    public StringBuddy()
    {

    }

    public String removeNonAlphaNumericCharacters(String s)
    {
        oldString = s;
        newString = oldString.replaceAll("[^a-zA-Z0-9 ]", "");
        Log.d(TAG, "Old: "+oldString+" |  New: "+newString);
        return newString;

    }


    public String convertToProperCase(String str)
    {
        Log.d(TAG, "String to fix = "+str);
        String finalString = "";
        // Empty strings should be returned as-is.
        if (str.length() == 0)
        {
            return "";
        }

        // Strings with only one character uppercased.
        else if (str.length() == 1)
        {
            return str.toUpperCase();
        }

        else
        {
            String[] strings = str.split("\\s"); // Split the string by spaces

            String merge = "";
            String restOfString = "";
            for (String string : strings)
            {
                String firstLetter = "";
                if (string.length() >= 1)
                {
                    firstLetter = string.substring(0, 1);
                    if (!firstLetter.equals("&"))
                    {
                        Log.d(TAG, "The first letter to capitalize is " + firstLetter);
                        firstLetter = firstLetter.toUpperCase();


                        restOfString = string.substring(1).toLowerCase();
                        merge = firstLetter.concat(restOfString + " "); // merge the result and add a space
                        finalString = finalString.concat(merge);
                    }
                }
            }

        }

        return finalString;
    }

    public String stripHtml(String html)
    {
        return Html.escapeHtml(html);
    }


    public String getCurrentTimeStamp()
    {
        try
        {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentDateTime = dateFormat.format(new Date()); // Find todays date

            return currentDateTime;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }






}
