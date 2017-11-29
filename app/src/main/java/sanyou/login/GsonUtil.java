package sanyou.login;

import android.util.Log;

import com.google.gson.Gson;

import java.lang.reflect.Type;


public class GsonUtil {
	private Gson gson = null;

	private static GsonUtil item;

	public static GsonUtil instance() {
		if (item == null)
			item = new GsonUtil();
		return item;
	}

	private GsonUtil() {
		if(gson==null){
			gson = new Gson();
		}
	}

	public <T> T fromJson(String json, Type type) {
		try {
			return gson.fromJson(json, type);
		} catch (Exception e) {
			Log.e("hxl", e.getMessage());
		}
		return null;
	}
	
	public String toJson(Object obj) {
		try {
			return gson.toJson(obj);
		} catch (Exception e) {
			Log.e("hxl", e.getMessage());
		}
		return null;
	}
	
	
}
