package sanyou.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Stack;


public class ActivityManager {

	private static ActivityManager mInstance = null;

	private Stack<Activity> mActivitys = null;

	private ActivityManager() {
		init();
	}

	public static ActivityManager getInstance() {
		if (null == mInstance) {
			mInstance = new ActivityManager();
		}

		return mInstance;
	}

	private void init() {
		mActivitys = new Stack<Activity>();
	}

	public void onActivityCreate(Activity act) {
		mActivitys.add(act);
	}

	public void onActivityDestroy(Activity act) {
		mActivitys.remove(act);
	}

	public Activity getTopActivity() {
		return mActivitys.peek();
	}



	public void goBackTo(Class c) {
		while (!mActivitys.isEmpty() && !(mActivitys.peek().getClass() == c)) {
			mActivitys.pop().finish();
		}
	}


	public Activity getActivity(Class c) {
		Log.d("wxPay", " getActivity " + c.getName());
		for (int i = mActivitys.size() - 1; i >= 0; i--) {
			if (mActivitys.get(i).getClass() == c) {
				Log.d("wxPay", " getActivity succeed");
				return mActivitys.get(i);
			}
		}

		return null;
	}



	public void existApp(){
		while (!mActivitys.isEmpty()) {
			mActivitys.pop().finish();
		}
	}
}
