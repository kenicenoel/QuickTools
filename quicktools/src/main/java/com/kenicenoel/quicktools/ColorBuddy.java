package com.kenicenoel.quicktools;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kenice on 8/30/2016.
 */
public class ColorBuddy
{
    private ArrayList<String> colors = new ArrayList<>();
    private String TAG = "com.kenicenoel.quicktools.ColorBuddy";


    // The default constructor
    public ColorBuddy()
    {
        colors.add("#E54C85");
        colors.add("#2B5A84");
        colors.add("#1BB1E4");
        colors.add("#EB5930");
        colors.add("#4BAF4F");
        colors.add("#31A5E0");
        colors.add("#EA1E63");
        colors.add("#26CACB");
        colors.add("#03A9F5");
        colors.add("#504465");
        colors.add("#C71D5B");
        colors.add("#3667F2");
        colors.add("#EE6E73");

    }


    // Allows the addition of a color to com.kenicenoel.quicktools.ColorBuddy

    public void addColor(String colorHexCode)
    {
        colors.add(colorHexCode);
    }

    public String newColor()
    {

        // Set a color for the letter TextView
        int random = generateRandomNumber(0, size() -1);
        return colors.get(random);

    }

    public int generateRandomNumber(int min, int max)
    {

        Random r = new Random();
        int number = r.nextInt(max - min+1) + min;
        return number;
    }


    public int size()
    {
        return colors.size();
    }

    public ArrayList<String> getColors()
    {
        return colors;
    }
}
