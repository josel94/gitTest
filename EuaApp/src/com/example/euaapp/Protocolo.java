package com.example.euaapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Protocolo extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_protocolo);
	}
	
	public void comunicar(View view)
	{
		Intent intent = new Intent(this, Comunicar.class);
    	startActivity(intent);
	}
	
	public void aspectos(View view)
	{

		Intent intent = new Intent(this, ApectosGenerales.class);
    	startActivity(intent);
	}
	
	public void agenda(View view)
	{
		Intent intent = new Intent(this, Agenda.class);
    	startActivity(intent);
	}

	public void horario(View view)
	{
		Intent intent = new Intent(this, Horario.class);
    	startActivity(intent);
	}
	
	public void vestimenta(View view)
	{
		Intent intent = new Intent(this, Vestimenta.class);
    	startActivity(intent);
	}
	
	public void recomendacion(View view)
	{
		Intent intent = new Intent(this, Recomendar.class);
    	startActivity(intent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.protocolo, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
