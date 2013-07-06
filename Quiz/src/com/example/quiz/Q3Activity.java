package com.example.quiz;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;

public class Q3Activity extends Activity {
	 private static int contador;
	 private CheckedTextView op1;
	 private CheckedTextView op2;
	 private CheckedTextView op3;
	 private CheckedTextView op4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_q3);
		
		contador = Q2Activity.getContador(); 
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
        bar.setRating(contador);
		
		op1=(CheckedTextView) findViewById(R.id.checkedTextView_op1);
		op2=(CheckedTextView) findViewById(R.id.checkedTextView_op2);
		op3=(CheckedTextView) findViewById(R.id.checkedTextView_op3);
		op4=(CheckedTextView) findViewById(R.id.checkedTextView_op4);
		
		op1.setText("a. Water on the roots");
		op2.setText("b. Sunlight on the leaves");
		op3.setText("c. Air on the leaves");
		op4.setText("d. CO2 on the roots");
		
        ProgressBar pb = (ProgressBar)findViewById(R.id.progressBar1);
        pb.setProgress(3);
	}
	
	public void Choose_op1(View view)
	{
	    bloquear();
		Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent (this,ResultActivity.class);
		startActivity(intent);
	}
	
	public void Choose_op2(View view)
	
	{
	    bloquear();
		contador = Q2Activity.getContador(); 
        contador ++;
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
        bar.setRating(contador);
		Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show(); 
		Intent intent = new Intent (this,ResultActivity.class);
		startActivity(intent);
	}
	
	public void Choose_op3(View view)
	{
	    bloquear();
		Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent (this,ResultActivity.class);
		startActivity(intent);
	}
	
	public void Choose_op4(View view)
	{
	    bloquear();
		Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent (this,ResultActivity.class);
		startActivity(intent);
	}
	  public void bloquear()
	  {
		  	op1=(CheckedTextView) findViewById(R.id.checkedTextView_op1);
			op2=(CheckedTextView) findViewById(R.id.checkedTextView_op2);
			op3=(CheckedTextView) findViewById(R.id.checkedTextView_op3);
			op4=(CheckedTextView) findViewById(R.id.checkedTextView_op4);
			
			op1.setClickable(false);
			op2.setClickable(false);
			op3.setClickable(false);
			op4.setClickable(false);
	  }
	
		// Evitar o botão retroceder
		 @Override
		public void onBackPressed()
		{

			 Intent intent = new Intent (this,MainActivity.class);
		     startActivity(intent); 
		}
		 
	 
	 
	 public void open_wiki (View v) 
	 {
		 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://de.wikipedia.org/wiki/Photosynthese"));
		 startActivity(browserIntent);
	}
	 
	 public void open_youtube (View v) 
	 {
		 String video_path = "http://www.youtube.com/watch?v=C1_uez5WX1o";
		 
	     Uri uri = Uri.parse(video_path);
         uri = Uri.parse("vnd.youtube:"  + uri.getQueryParameter("v"));

		 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);
	      
	 }
	 
	 
	 public static int getContador()
		{
			return contador;
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.q3, menu);
		return true;
	}

}
