package com.silva.guessmusic.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * @author silvasong E-mail:silvasong@campray.com
 * @version 2015年3月11日 下午4:23:02
 * 
 */
public class Utils {
	
	public static View getView(Context context,int layoutId){
		  LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		  View layout = inflater.inflate(layoutId, null);
		  return layout;
	}

}
