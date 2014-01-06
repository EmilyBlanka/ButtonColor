package com.example.beatap9;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnTouchListener{
	
	Button	btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	
	ImageView	img1, img2, img3, img4, img5, img6, img7, img8, img9;
	
	Animation	anim1, anim2, anim3, anim4, anim5, anim6, anim7, anim8, anim9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button) findViewById(R.id.button1);		btn1.setOnTouchListener(this);
		btn2 = (Button) findViewById(R.id.button2);		btn2.setOnTouchListener(this);
		btn3 = (Button) findViewById(R.id.button3);		btn3.setOnTouchListener(this);
		btn4 = (Button) findViewById(R.id.button4);		btn4.setOnTouchListener(this);
		btn5 = (Button) findViewById(R.id.button5);		btn5.setOnTouchListener(this);
		btn6 = (Button) findViewById(R.id.button6);		btn6.setOnTouchListener(this);
		btn7 = (Button) findViewById(R.id.button7);		btn7.setOnTouchListener(this);
		btn8 = (Button) findViewById(R.id.button8);		btn8.setOnTouchListener(this);
		btn9 = (Button) findViewById(R.id.button9);		btn9.setOnTouchListener(this);
		
		anim1 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim2 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim3 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim4 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim5 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim6 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim7 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim8 = AnimationUtils.loadAnimation(this, R.anim.animation);
		anim9 = AnimationUtils.loadAnimation(this, R.anim.animation);
		
//		img1 = (ImageView)findViewById(R.id.AnimationImage1);
//		img2 = (ImageView)findViewById(R.id.AnimationImage2);
//		img3 = (ImageView)findViewById(R.id.AnimationImage3);
//		img4 = (ImageView)findViewById(R.id.AnimationImage4);
//		img5 = (ImageView)findViewById(R.id.AnimationImage5);
//		img6 = (ImageView)findViewById(R.id.AnimationImage6);
//		img7 = (ImageView)findViewById(R.id.AnimationImage7);
//		img8 = (ImageView)findViewById(R.id.AnimationImage8);
//		img9 = (ImageView)findViewById(R.id.AnimationImage9);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
//		if(event.getAction() == MotionEvent.ACTION_DOWN) {
//            switch (v.getId()) {
//            case R.id.button1:	img1.startAnimation(anim1);		break;
//            case R.id.button2:	img2.startAnimation(anim2);		break;
//            case R.id.button3:	img3.startAnimation(anim3);		break;
//            case R.id.button4:	img4.startAnimation(anim4);		break;
//            case R.id.button5:	img5.startAnimation(anim5);		break;
//            case R.id.button6:	img6.startAnimation(anim6);		break;
//            case R.id.button7:	img7.startAnimation(anim7);		break;
//            case R.id.button8:	img8.startAnimation(anim8);		break;
//            case R.id.button9:	img9.startAnimation(anim9);		break;
//            }
//            return true;
//		}
		return false;
	}
}
