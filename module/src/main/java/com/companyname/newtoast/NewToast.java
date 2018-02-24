package com.companyname.newtoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nitish Kumar Singh on 23-02-2018.
 */

public class NewToast extends Toast{
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public static int DEFAULT   =   0;
    public static int SUCCESS   =   1;
    public static int INFO      =   2;
    public static int WARNING   =   3;
    public static int DANGER    =   4;

    public static int SHORT     =   0;
    public static int LONG      =   1;

    public NewToast(Context context) {
        super(context);
    }

    public static Toast makeToast(Context context,int duration) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        return toast;
    }
    public static Toast makeToast(Context context, String msg, int duration){
        Toast toast = makeToast(context,duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.new_toast, null, false);
        TextView message = layout.findViewById(R.id.toast_text);
        message.setText(msg);
        toast.setView(layout);
        return toast;
    }
    public static Toast makeToast(Context context, String msg, int duration, int type){
        Toast toast = NewToast.makeToast(context, msg, duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.new_toast, null, false);
        TextView message = layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = layout.findViewById(R.id.type);
        switch (type){
            case 0:linearLayout.setBackgroundColor(context.getResources().getColor(R.color.defaultDark));
                break;
            case 1:linearLayout.setBackgroundColor(context.getResources().getColor(R.color.successDark));
                break;
        }
        return toast;
    }
}
