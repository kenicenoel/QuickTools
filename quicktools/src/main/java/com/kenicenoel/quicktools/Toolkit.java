package com.kenicenoel.quicktools;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.Random;

/**
 * Created as part of the QuickToolsTest project.
 * Author: Kenice Noel. Date created: Jul, 17, 2017
 */

public class Toolkit
{
    private ColorBuddy colorBuddy;
    private StringBuddy stringBuddy;
    private SettingsBuddy settingsBuddy;
    private ZipBuddy zipBuddy;
    private Context context;

    public Toolkit(Context context)
    {
        this.context = context;
        colorBuddy = new ColorBuddy();
        stringBuddy = new StringBuddy();
        settingsBuddy = SettingsBuddy.getInstance(context);
        zipBuddy = new ZipBuddy();
    }

    public ColorBuddy colorBuddy()
    {
        return colorBuddy;
    }

    public StringBuddy stringBuddy()
    {
        return stringBuddy;
    }

    public SettingsBuddy settingsBuddy()
    {
        return settingsBuddy;
    }

    public ZipBuddy zipBuddy()
    {
        return zipBuddy;
    }

    public int generateRandomNumber(int min, int max)
    {
        Random r = new Random();
        return  r.nextInt(max - min) + min ;

    }

    public boolean isAppInstalled(String packageName)
    {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try
        {
            applicationInfo = packageManager.getApplicationInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException e)
        {
            e.printStackTrace();
        }
        if (applicationInfo == null)
        {
            // not installed
            return false;
        }

        return true;
    }
}
