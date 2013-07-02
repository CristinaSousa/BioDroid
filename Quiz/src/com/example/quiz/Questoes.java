package com.example.quiz;



import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class Questoes extends Activity {

	 private String[] arrayQuestoes = new String[] {"Questão 1", "Questão 2", "Questão 3"};
	 private TextView pergunta;
	 private Button Botao_seguinte;
	 private CheckedTextView pri_opcao;
	 private int Contador=0;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_questoes);
		// Fui eu que coloquei
		pergunta = (TextView) findViewById(R.id.mostra_resposta);
		Botao_seguinte = (Button) findViewById(R.id.botao_seguinte);
		pri_opcao = (CheckedTextView) findViewById(R.id.checkedTextView_op1);
		pri_opcao.setText("a) Texto 1.");
	    pergunta.setText(arrayQuestoes[0]);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.questoes, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
	public void abrir_qseguinte (View view) { 
		 if(Contador<=3)
		 {
		 Contador ++;
		 pergunta.setText(arrayQuestoes[Contador]);
		 pri_opcao.setChecked(true);
		
		 }
		}
       

public void escolher_1opcao(View view)
{
	pergunta.setText("deu");
}
}