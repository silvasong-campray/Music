package com.silva.guessmusic.ui;

import com.silva.guessmusic.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
    
	//唱片动画相关
	private Animation mPanAnim;
	private LinearInterpolator mPanLin;
	
	private Animation mBarInAnim;
	private LinearInterpolator mBarInLin;
	
	private Animation mBarOutAnim;
	private LinearInterpolator mBarOutLin;
	
	//唱片startButton
	private ImageButton mPanStartBtn;
    
	private ImageView mPanView;
	private ImageView mPanBarView;
	
	private boolean isRunning = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		mPanStartBtn = (ImageButton) findViewById(R.id.panStartBtn);
		mPanStartBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				handlePlayButton();
			}
		});
		
		mPanView = (ImageView)findViewById(R.id.pan);
		mPanBarView = (ImageView)findViewById(R.id.bar);
		
		handlePlayAnimation();
		
		
	}
    
	//播放
	private void handlePlayButton(){
		if(!isRunning){
			isRunning = true;
			mPanBarView.startAnimation(mBarInAnim);
			mPanStartBtn.setVisibility(View.INVISIBLE);
		}
	}
	
	//动画
	private void handlePlayAnimation(){
		//初始化动画
				mPanAnim = AnimationUtils.loadAnimation(this, R.anim.rotate);
				mPanLin = new LinearInterpolator();
				mPanAnim.setInterpolator(mPanLin);
				
				mPanAnim.setAnimationListener(new AnimationListener() {
					
					@Override
					public void onAnimationStart(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationRepeat(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationEnd(Animation animation) {
						// TODO Auto-generated method stub
						mPanBarView.startAnimation(mBarOutAnim);
						isRunning = false;
						mPanStartBtn.setVisibility(View.VISIBLE);
					}
				});
				
				mBarInAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_d_45);
				mBarInLin = new LinearInterpolator();
				mBarInAnim.setFillAfter(true);
				mBarInAnim.setInterpolator(mBarInLin);
				mBarInAnim.setAnimationListener(new AnimationListener() {
					
					@Override
					public void onAnimationStart(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationRepeat(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationEnd(Animation animation) {
						// TODO Auto-generated method stub
						mPanView.startAnimation(mPanAnim);
					}
				});
				
				mBarOutAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_45);
				mBarOutLin = new LinearInterpolator();
				mBarOutAnim.setFillAfter(true);
				mBarOutAnim.setInterpolator(mBarOutLin);
				mBarOutAnim.setAnimationListener(new AnimationListener() {
					
					@Override
					public void onAnimationStart(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationRepeat(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationEnd(Animation animation) {
						// TODO Auto-generated method stub
						
					}
				});
	}
	
	
}
