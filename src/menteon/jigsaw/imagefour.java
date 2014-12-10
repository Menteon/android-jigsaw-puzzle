package menteon.jigsaw;

import java.util.Random;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class imagefour extends Activity{
	Context mContext;
	Bitmap imgs[]=new Bitmap[4];//store broken up bitmaps
	Bitmap correctimgs[]=new Bitmap[4];//store bitmaps in correct order
	Bitmap main;
	ImageView img1,img2,img3,img4,select,newselect;
	TextView sc;
	int someSelected = 0;
	int arr[]={0,3,1,2};
	int score = 0;
	
	
@Override
public void onCreate(Bundle savedInstanceState){
	Log.d("class","oncreate");
	super.onCreate(savedInstanceState);
	mContext=getApplicationContext();
	setContentView(menteon.jigsaw.R.layout.main);//inflate layout from xml
	sc=(TextView) findViewById(menteon.jigsaw.R.id.TextView22);
	sc.setText("Score : "+score);
	
	selectpic();//randomly select a pic
	splitBitmap(main);//split and dynamically store the split images
	saveBitmap(imgs);//save bitmaps to imageviews in the xml
	
	//set onclick listener for each iamgeview
	img1.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				Log.d(this.getClass().getName(), "clicked");
				score=score+1;
				sc.setText("Score : "+score);
				if(someSelected==1)
				{
					someSelected=0;
					exchange(arg0);
				}
				else
				{
					someSelected=1;
					selected(arg0);
				}
			}
			}
			);
	img2.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
			sc.setText("Score : "+score);
			if(someSelected==1)
			{
				someSelected=0;
				exchange(arg0);
			}
			else
			{
				someSelected=1;
				selected(arg0);
			}
			
		}
		}
		);
	img3.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
			sc.setText("Score : "+score);
			if(someSelected==1)
			{
				someSelected=0;
				exchange(arg0);
			}
			else
			{
				someSelected=1;
				selected(arg0);
			}
			
		}
		}
		);
	img4.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
			sc.setText("Score : "+score);
			if(someSelected==1)//implies an imageview has been selected,hence we need to exchange now
			{
				someSelected=0;
				exchange(arg0);
			}
			else// no imageview was selected hence select now
			{
				someSelected=1;
				selected(arg0);
			}
			
		}
		}
		);
			
	
	
}
public void selectpic()
{
	Random rgen = new Random();
	int n = rgen.nextInt(6);
	switch(n)
	{
	case 0:main = BitmapFactory.decodeResource(mContext.getResources(),menteon.jigsaw.R.drawable.one);
	return;
	case 1:main = BitmapFactory.decodeResource(mContext.getResources(),menteon.jigsaw.R.drawable.two);
	return;
	case 2:main = BitmapFactory.decodeResource(mContext.getResources(),menteon.jigsaw.R.drawable.three);
	return;
	case 3:main = BitmapFactory.decodeResource(mContext.getResources(),menteon.jigsaw.R.drawable.four);
	return;
	case 4:main = BitmapFactory.decodeResource(mContext.getResources(),menteon.jigsaw.R.drawable.five);
	return;
	case 5:main = BitmapFactory.decodeResource(mContext.getResources(),menteon.jigsaw.R.drawable.six);
	return;
	}
	
}
public void exchangei(int si,int nsi)//to exchange bitmaps for two imageviews
{
	Bitmap temp;
	temp = imgs[si];
	imgs[si] = imgs[nsi];
	imgs[nsi]=temp;
}
public void selected(View v){
	Log.d(this.getClass().getName(), "in selected");
	someSelected=1;
	select=(ImageView) v;
	
}
public void exchange(View v)
{
	Log.d(this.getClass().getName(), "in exchange");
	someSelected=0;
	newselect=(ImageView) v;
	
	if(newselect==img1)
	{
		if(select==img2)
		{
			exchangei(0,1);
		}
		else if(select==img3)
		{
			exchangei(0,2);
		}
		else
		{
			exchangei(0,3);
		}
	}else
		if(newselect==img2)
		{
			if(select==img1)
			{
				exchangei(1,0);
			}
			else if(select==img3)
			{
				exchangei(1,2);
			}
			else
			{
				exchangei(1,3);
			}
		}else
			if(newselect==img3)
			{
				if(select==img2)
				{
					exchangei(2,1);
				}
				else if(select==img1)
				{
					exchangei(2,0);
				}
				else
				{
					exchangei(2,3);
				}
			}else
			{
				if(select==img2)
				{
					exchangei(3,1);
				}
				else if(select==img3)
				{
					exchangei(3,2);
				}
				else
				{
					exchangei(3,0);
				}
			}
	saveBitmap(imgs);
	boolean win;
	if(win=checkwin())
		{
		Log.d(this.getClass().getName(),"win ="+win);
		Intent i = new Intent(imagefour.this,winscreen.class);
		startActivity(i);
		finish();
		}
	
	
}
public boolean checkwin()//compares the bitmaps with the correct order of bitmaps everytime we exchange them
{
	if((correctimgs[0]==imgs[0])&&(correctimgs[1]==imgs[1])&&(correctimgs[2]==imgs[2])&&correctimgs[3]==imgs[3])
		return true;
	return false;
}
public void splitBitmap(Bitmap picture)
{
	Log.d("class","splitbitmap");
Bitmap scaledBitmap = Bitmap.createScaledBitmap(picture, 240, 240, true);
int height=scaledBitmap.getHeight();
int width=scaledBitmap.getWidth();
imgs[arr[0]] = Bitmap.createBitmap(scaledBitmap, 0, 0, width/2 , height/2);
correctimgs[0] = imgs[arr[0]];
imgs[arr[1]] = Bitmap.createBitmap(scaledBitmap, width/2, 0, width/2, height/2);
correctimgs[1] = imgs[arr[1]];
imgs[arr[2]] = Bitmap.createBitmap(scaledBitmap,0,height/2,width/2, height/2);
correctimgs[2] = imgs[arr[2]];
imgs[arr[3]] = Bitmap.createBitmap(scaledBitmap, width/2, height/2, width/2, height/2);
correctimgs[3] = imgs[arr[3]];
}
public void saveBitmap(Bitmap imgs[])
{
	Log.d("class","savingbitmap");
	img1 = (ImageView)findViewById(menteon.jigsaw.R.id.image1);
	img2 = (ImageView)findViewById(menteon.jigsaw.R.id.image2);
	img3 = (ImageView)findViewById(menteon.jigsaw.R.id.image3);
	img4 = (ImageView)findViewById(menteon.jigsaw.R.id.image4);
	
	img1.setImageBitmap(imgs[0]);
	img2.setImageBitmap(imgs[1]);
	img3.setImageBitmap(imgs[2]);
	img4.setImageBitmap(imgs[3]);
	
}

}

