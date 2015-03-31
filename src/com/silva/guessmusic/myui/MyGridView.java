package com.silva.guessmusic.myui;

import java.util.ArrayList;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.silva.guessmusic.R;
import com.silva.guessmusic.model.WordButton;
import com.silva.guessmusic.utils.Utils;

/**
 * @author silvasong E-mail:silvasong@campray.com
 * @version 2015年3月11日 下午3:57:08
 * 
 */
public class MyGridView extends GridView{
    
	private ArrayList<WordButton> mArrayList = new ArrayList<WordButton>();
	private MyGridAdapter myAdapter;
	private Context mContext;
	
	public MyGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		myAdapter = new MyGridAdapter();
		mContext = context;
		this.setAdapter(myAdapter);
	}
	
	class MyGridAdapter extends BaseAdapter{
		
		public int getCount(){
			return mArrayList.size();
		}
		
		public Object getItem(int pos){
		    return mArrayList.get(pos);	
		}
		
		public long getItemId(int pos){
			return pos;
		}
		
		public View getView(int pos , View v ,ViewGroup p){
			
			WordButton holder;
			if(v == null){
				v = Utils.getView(mContext, R.layout.self_ui_gridview_item);
				holder = mArrayList.get(pos);
				holder.mIndex = pos;
				holder.mViewButton = (Button)v.findViewById(R.id.item_btn);
				holder.mViewButton.setText(holder.mWordString);
				v.setTag(holder);
			}else{
				holder =(WordButton)v.getTag();
				holder.mViewButton.setText(holder.mWordString);
			}
			return v;
		}
		
		
	}

}
