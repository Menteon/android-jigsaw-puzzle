package menteon.jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class start extends Activity{
@Override
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	Button fourbutton,ninebutton;
	setContentView(menteon.jigsaw.R.layout.startwindow);
	fourbutton=(Button)findViewById(menteon.jigsaw.R.id.fourbutton);
	ninebutton=(Button)findViewById(menteon.jigsaw.R.id.ninebutton);
	//setting on click listener on button for 4x4 jigsaw to determine what action has to be taken
	fourbutton.setOnClickListener(new OnClickListener(){

		public void onClick(View v) {
			Intent four = new Intent(start.this,imagefour.class);
			startActivity(four);
					}		
	});
	ninebutton.setOnClickListener(new OnClickListener(){

		public void onClick(View v) {
			Intent nine = new Intent(start.this,imagenine.class);
			startActivity(nine);
					}		
	});
}
}
