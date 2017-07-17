package com.kenicenoel.quicktools;

import android.content.Context;
import android.content.SharedPreferences;


public class SettingsBuddy
{
    private static SettingsBuddy settingsBuddy;
    private SharedPreferences settings;

    private String DEFAULT = "N/A";

    public String getDEFAULT()
    {
        return DEFAULT;
    }

    public void setDEFAULT(String DEFAULT)
    {
        this.DEFAULT = DEFAULT;
    }

    private final String TAG = SettingsBuddy.class.getSimpleName();

    public static SettingsBuddy getInstance(Context context
    )
    {
        if (settingsBuddy == null)
        {
            return new SettingsBuddy(context);
        }

        return settingsBuddy;
    }


    private SettingsBuddy(Context context)
    {

        settings = context.getSharedPreferences("AppSettings", Context.MODE_PRIVATE);

    }


    public void saveData(String key, String value)
    {
        SharedPreferences.Editor prefsEditor = settings.edit();
        prefsEditor .putString(key, value);
        prefsEditor.apply();
    }

    public String getData(String key)
    {
        if (settings!= null)
        {
            return settings.getString(key, DEFAULT);
        }

        return DEFAULT;
    }

    public void removeData(String key)
    {
        SharedPreferences.Editor prefsEditor = settings.edit();
        prefsEditor.remove(key);
        prefsEditor.apply();
    }





}
