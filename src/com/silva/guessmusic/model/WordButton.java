package com.silva.guessmusic.model;

import android.R.bool;
import android.widget.Button;

/**
 * @author silvasong E-mail:silvasong@campray.com
 * @version 2015年3月11日 下午3:53:45
 * 
 */
public class WordButton {
	
	public int mIndex;
	
	public boolean mIsVisiable;
	
	public String mWordString;
	
	public Button mViewButton;
	
	public WordButton(){
           mIsVisiable = true;
           mWordString = "";
	}
	

}
