package com.apecs.obd;

import android.util.Log;

import com.apecs.obd.app.MyApplicaticon;


//日志工具类
public class LogUtil {
	public static void i(String tag, Object msg) {
		if (MyApplicaticon.ISRELEASE) {
			// 运行在用户的真机上
			return;
		}
     //开发 中
		Log.i(tag, String.valueOf(msg));
	}
	
	public static void e(String tag, Object msg) {
		if (MyApplicaticon.ISRELEASE) {
			// 运行在用户的真机上
			return;
		}
     //开发中
		Log.e(tag, String.valueOf(msg));
	}
	
}
