package com.companyname.newtoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nitish Kumar Singh on 23-02-2018.
 */

public class NewToast extends Toast{

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

    private static Toast makeToast(Context context,int duration) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        return toast;
    }
    private static void setToastMessage(TextView message,String msg){
        if(!msg.equals(""))
            message.setText(msg);
    }
    public static Toast makeToast(Context context, String msg, int duration){
        Toast toast = makeToast(context,duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.new_toast, null, false);
        TextView message = layout.findViewById(R.id.toast_text);
        layout.setBackgroundColor(context.getResources().getColor(R.color.successDark));
        message.setTextColor(context.getResources().getColor(R.color.defaultTextDark));
        setToastMessage(message,msg);
        toast.setView(layout);
        return toast;
    }
    public static Toast makeToast(Context context, String msg, int duration, int type){
        Toast toast = makeToast(context,duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.new_toast, null, false);
        TextView message = layout.findViewById(R.id.toast_text);
        setToastColor(context,layout,message,type);
        setToastMessage(message,msg);
        toast.setView(layout);
        return toast;
    }

    private static void setToastColor(Context context, View layout, TextView message,int type) {
        int layoutColor = getLayoutColor(type);
        int textColor   = getTextColor(type);
        layout.setBackgroundColor(context.getResources().getColor(layoutColor));
        message.setTextColor(context.getResources().getColor(textColor));
    }

    private static int getTextColor(int type){
        int textColor ;
        switch (type){
            case 0 :    textColor   = R.color.defaultTextDark;
                break;
            case 1 :    textColor   = R.color.defaultTextDark;
                break;
            case 2 :    textColor   = R.color.defaultTextDark;
                break;
            case 3 :    textColor   = R.color.defaultTextDark;
                break;
            case 4 :    textColor   = R.color.defaultTextDark;
                break;
            default :   textColor   = R.color.defaultTextDark;
                break;
        }
        return textColor;
    }
    private static int getLayoutColor(int type){
        int layoutColor ;
        switch (type){
            case 0 :    layoutColor = R.color.defaultDark;
                break;
            case 1 :    layoutColor = R.color.successDark;
                break;
            case 2 :    layoutColor = R.color.infoDark;
                break;
            case 3 :    layoutColor = R.color.warningDark;
                break;
            case 4 :    layoutColor = R.color.dangerDark;
                break;
            default :   layoutColor = R.color.defaultDark;
                break;
        }
        return  layoutColor;
    }
}
