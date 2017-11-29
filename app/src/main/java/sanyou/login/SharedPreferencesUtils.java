package sanyou.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferencesUtils {
    private static SharedPreferences sp;
    
    private static final String SP_NAME = "NetTrmp";

    public static void saveBoolean(Context context,String key,boolean value){
        if(sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        Editor edit = sp.edit();
        edit.putBoolean(key, value);
        edit.commit();
    }
    
    public static boolean getBoolean(Context context,String key,boolean value){
        if(sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getBoolean(key, value);
    }
    public static void saveString(Context context,String key,String value){
        if(sp == null)
        sp = context.getSharedPreferences(SP_NAME,0);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(Context context, String key, String defValue) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getString(key, defValue);
    }
    public static void saveInt(Context context, String key, int value) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        sp.edit().putInt(key, value).commit();
    }
    public static int getInt(Context context, String key, int defValue) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getInt(key, defValue);
    }
    public static void clear(Context context) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        sp.edit().clear().commit();  
    }
    public static void remove(Context context,String name) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        sp.edit().remove(name).commit();
    }
    
}
