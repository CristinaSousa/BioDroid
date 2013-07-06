package com.example.quiz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;

public class Q1Activity extends Activity {
	
	 public static int contador=0; 
	 private CheckedTextView op1;
	 private CheckedTextView op2;
	 private CheckedTextView op3;
	 private CheckedTextView op4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_q1);
		
		op1=(CheckedTextView) findViewById(R.id.checkedTextView_op1);
		op2=(CheckedTextView) findViewById(R.id.checkedTextView_op2);
		op3=(CheckedTextView) findViewById(R.id.checkedTextView_op3);
		op4=(CheckedTextView) findViewById(R.id.checkedTextView_op4);
		
		op1.setText("a. It needs water, sun and air");
		op2.setText("b. It needs water, meat and air");
		op3.setText("c. It needs water, meat and cellulose");
		op4.setText("d. It needs sun, meat and cellulose");
		
        ProgressBar pb = (ProgressBar)findViewById(R.id.progressBar1);
        pb.setProgress(1);
        
    
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.q1, menu);
		return true;
	}
	
	
	public void Choose_op1(View view)
	{
	    bloquear();
		contador++;
		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
        bar.setRating(1);
		Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent (this,Q2Activity.class);
		startActivity(intent);
	}
	
	public void Choose_op2(View view)
	
	{
	
	    bloquear();
	    Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent (this,Q2Activity.class);
		startActivity(intent);
	}
	
	public void Choose_op3(View view)
	{
	    bloquear();
		Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent (this,Q2Activity.class);
		startActivity(intent);
	}
	
	public void Choose_op4(View view)
	{
	    bloquear();
		Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent (this,Q2Activity.class);
		startActivity(intent);
	}
	
	public static int getContador()
	{
		return contador;
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

}
