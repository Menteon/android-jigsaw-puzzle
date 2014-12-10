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

public class imagenine extends Activity{
	Context mContext;
	Bitmap imgs[]=new Bitmap[9];
	Bitmap correctimgs[]=new Bitmap[9];
	Bitmap main;
	ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,select,newselect;
	int someSelected = 0;
	int arr[]={4,3,2,6,1,7,0,5,8};
	int score=0;
	
	
@Override
public void onCreate(Bundle savedInstanceState){
	Log.d("class","oncreate");
	super.onCreate(savedInstanceState);
	mContext=getApplicationContext();
	setContentView(menteon.jigsaw.R.layout.maintwo);
	TextView sc=(TextView) findViewById(menteon.jigsaw.R.id.TextView23);
	sc.setText("Score : "+score);
	selectpic();
	splitBitmap(main);
	saveBitmap(imgs);
	
	
	img1.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				Log.d(this.getClass().getName(), "clicked");
				score=score+1;
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
	img5.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
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
	img6.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
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
	img7.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
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
	img8.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
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
	img9.setOnClickListener(new OnClickListener(){

		public void onClick(View arg0) {
			score=score+1;
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

public void exchangei(int si,int nsi)
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
		else if(select==img4)
		{
			exchangei(0,3);
		}else if(select==img5)
		{
			exchangei(0,4);
		}else if(select==img6)
		{
			exchangei(0,5);
		}else if(select==img7)
		{
			exchangei(0,6);
		}else if(select==img8)
		{
			exchangei(0,7);
		}else 
		{
			exchangei(0,8);
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
			else if(select==img4)
			{
				exchangei(1,3);
			}else if(select==img5)
			{
				exchangei(1,4);
			}else if(select==img6)
			{
				exchangei(1,5);
			}else if(select==img7)
			{
				exchangei(1,6);
			}else if(select==img8)
			{
				exchangei(1,7);
			}else 
			{
				exchangei(1,8);
			}
		}else if(newselect==img3)
			{
				if(select==img2)
				{
					exchangei(2,1);
				}
				else if(select==img1)
				{
					exchangei(2,0);
				}
				else if(select==img4)
				{
					exchangei(2,3);
				}else if(select==img5)
				{
					exchangei(2,4);
				}else if(select==img6)
				{
					exchangei(2,5);
				}else if(select==img7)
				{
					exchangei(2,6);
				}else if(select==img8)
				{
					exchangei(2,7);
				}else 
				{
					exchangei(2,8);
				}
			}else if(newselect==img4)
			{
				if(select==img2)
				{
					exchangei(3,1);
				}
				else if(select==img3)
				{
					exchangei(3,2);
				}
				else if(select==img1)
				{
					exchangei(3,0);
				}else if(select==img5)
				{
					exchangei(3,4);
				}else if(select==img6)
				{
					exchangei(3,5);
				}else if(select==img7)
				{
					exchangei(3,6);
				}else if(select==img8)
				{
					exchangei(3,7);
				}else
				{
					exchangei(3,8);
				}
			}else if(newselect==img5)
			{
				if(select==img2)
				{
					exchangei(4,1);
				}
				else if(select==img3)
				{
					exchangei(4,2);
				}
				else if(select==img4)
				{
					exchangei(4,3);
				}else if(select==img1)
				{
					exchangei(4,0);
				}else if(select==img6)
				{
					exchangei(4,5);
				}else if(select==img7)
				{
					exchangei(4,6);
				}else if(select==img8)
				{
					exchangei(4,7);
				}else 
				{
					exchangei(4,8);
				}
			}else if(newselect==img6)
			{
				if(select==img2)
				{
					exchangei(5,1);
				}
				else if(select==img3)
				{
					exchangei(5,2);
				}
				else if(select==img4)
				{
					exchangei(5,3);
				}else if(select==img5)
				{
					exchangei(5,4);
				}else if(select==img1)
				{
					exchangei(5,0);
				}else if(select==img7)
				{
					exchangei(5,6);
				}else if(select==img8)
				{
					exchangei(5,7);
				}else 
				{
					exchangei(5,8);
				}
			}else if(newselect==img7)
			{
				if(select==img2)
				{
					exchangei(6,1);
				}
				else if(select==img3)
				{
					exchangei(6,2);
				}
				else if(select==img4)
				{
					exchangei(6,3);
				}else if(select==img5)
				{
					exchangei(6,4);
				}else if(select==img6)
				{
					exchangei(6,5);
				}else if(select==img1)
				{
					exchangei(6,0);
				}else if(select==img8)
				{
					exchangei(6,7);
				}else 
				{
					exchangei(6,8);
				}
			}else if(newselect==img8)
			{
				if(select==img2)
				{
					exchangei(7,1);
				}
				else if(select==img3)
				{
					exchangei(7,2);
				}
				else if(select==img4)
				{
					exchangei(7,3);
				}else if(select==img5)
				{
					exchangei(7,4);
				}else if(select==img6)
				{
					exchangei(7,5);
				}else if(select==img7)
				{
					exchangei(7,6);
				}else if(select==img1)
				{
					exchangei(7,0);
				}else 
				{
					exchangei(7,8);
				}
			}else 
			{
				if(select==img2)
				{
					exchangei(8,1);
				}
				else if(select==img3)
				{
					exchangei(8,2);
				}
				else if(select==img4)
				{
					exchangei(8,3);
				}else if(select==img5)
				{
					exchangei(8,4);
				}else if(select==img6)
				{
					exchangei(8,5);
				}else if(select==img7)
				{
					exchangei(8,6);
				}else if(select==img8)
				{
					exchangei(8,7);
				}else 
				{
					exchangei(8,0);
				}
			}
	saveBitmap(imgs);
	boolean win;
	if(win=checkwin())
		{
		Log.d(this.getClass().getName(),"win ="+win);
		Intent i = new Intent(imagenine.this,winscreen.class);
		startActivity(i);
		finish();
		}
	
	
}
public boolean checkwin()
{
	if((correctimgs[0]==imgs[0])&&(correctimgs[1]==imgs[1])&&(correctimgs[2]==imgs[2])&&(correctimgs[3]==imgs[3])&&(correctimgs[4]==imgs[4]&&(correctimgs[5]==imgs[5])&&(correctimgs[6]==imgs[6])&&(correctimgs[7]==imgs[7])&&(correctimgs[8]==imgs[8])))
		return true;
	return false;
}
public void splitBitmap(Bitmap picture)
{
	Log.d("class","splitbitmap");
Bitmap scaledBitmap = Bitmap.createScaledBitmap(picture, 240, 240, true);
int height=scaledBitmap.getHeight();
int width=scaledBitmap.getWidth();
imgs[arr[0]] = Bitmap.createBitmap(scaledBitmap, 0, 0, width/3 , height/3);
correctimgs[0] = imgs[arr[0]];
imgs[arr[1]] = Bitmap.createBitmap(scaledBitmap, width/3, 0, width/3, height/3);
correctimgs[1] = imgs[arr[1]];
imgs[arr[2]] = Bitmap.createBitmap(scaledBitmap,(2*width)/3,0,width/3, height/3);
correctimgs[2] = imgs[arr[2]];
imgs[arr[3]] = Bitmap.createBitmap(scaledBitmap, 0, height/3, width/3, height/3);
correctimgs[3] = imgs[arr[3]];
imgs[arr[4]] = Bitmap.createBitmap(scaledBitmap, width/3, height/3, width/3 , height/3);
correctimgs[4] = imgs[arr[4]];
imgs[arr[5]] = Bitmap.createBitmap(scaledBitmap, (2*width)/3, height/3, width/3 , height/3);
correctimgs[5] = imgs[arr[5]];
imgs[arr[6]] = Bitmap.createBitmap(scaledBitmap, 0, (2*height)/3, width/3 , height/3);
correctimgs[6] = imgs[arr[6]];
imgs[arr[7]] = Bitmap.createBitmap(scaledBitmap, width/3, (2*height)/3, width/3 , height/3);
correctimgs[7] = imgs[arr[7]];
imgs[arr[8]] = Bitmap.createBitmap(scaledBitmap, (2*width)/3, (2*height)/3, width/3 , height/3);
correctimgs[8] = imgs[arr[8]];
}
public void saveBitmap(Bitmap imgs[])
{
	Log.d("class","savingbitmap");
	img1 = (ImageView)findViewById(menteon.jigsaw.R.id.image5);
	img2 = (ImageView)findViewById(menteon.jigsaw.R.id.image6);
	img3 = (ImageView)findViewById(menteon.jigsaw.R.id.image7);
	img4 = (ImageView)findViewById(menteon.jigsaw.R.id.image8);
	img5 = (ImageView)findViewById(menteon.jigsaw.R.id.image9);
	img6 = (ImageView)findViewById(menteon.jigsaw.R.id.image10);
	img7 = (ImageView)findViewById(menteon.jigsaw.R.id.image11);
	img8 = (ImageView)findViewById(menteon.jigsaw.R.id.image12);
	img9 = (ImageView)findViewById(menteon.jigsaw.R.id.image13);
	
	
	img1.setImageBitmap(imgs[0]);
	img2.setImageBitmap(imgs[1]);
	img3.setImageBitmap(imgs[2]);
	img4.setImageBitmap(imgs[3]);
	img5.setImageBitmap(imgs[4]);
	img6.setImageBitmap(imgs[5]);
	img7.setImageBitmap(imgs[6]);
	img8.setImageBitmap(imgs[7]);
	img9.setImageBitmap(imgs[8]);
	
	
}

}

