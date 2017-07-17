package com.kenicenoel.quicktoolstest;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kenicenoel.quicktools.Toolkit;

public class MainActivity extends AppCompatActivity
{
    private LinearLayout root;
    private TextView testString;
    private Toolkit toolkit;
    private Handler colorHandler;
    private Runnable changeBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        root = (LinearLayout) findViewById(R.id.rootLayout);
        testString = (TextView) findViewById(R.id.testString);
        toolkit = new Toolkit(getApplicationContext());

        runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        String color = toolkit.colorBuddy().newColor();
                        root.setBackgroundColor(Color.parseColor(color));
                    }
                }, 5000);
            }
        });



        // Change the string to proper case
        String currentText = testString.getText().toString();
        testString.setText(toolkit.stringBuddy().convertToProperCase(currentText));
    }


}
