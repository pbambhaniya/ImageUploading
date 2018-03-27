package com.multipz.imageupload;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Application extends android.app.Application {

    public static Typeface fonttitilliumRegular, fonttitilliumBold;
    public static Typeface FontCoral;


    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static void setFontDefault(ViewGroup group) {
        setFont(group, Application.fonttitilliumRegular);
    }

    public static void setFont(ViewGroup group, Typeface font) {
        int count = 0;
        count = group.getChildCount();
        View v;
        for (int i = 0; i < count; i++) {
            v = group.getChildAt(i);
            if (v instanceof TextView)
                ((TextView) v).setTypeface(font);
            else if (v instanceof ViewGroup)
                setFont((ViewGroup) v, font);
        }
    }
}
