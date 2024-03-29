package com.mycompany.practicafragments;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class fragments extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fragments, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showMessi(View view){
        Futbolista futbolista = (Futbolista)
                getSupportFragmentManager().findFragmentById(R.id.fragment);

        futbolista.updateFutbolistaView(1);
    }

    public void showXavi(View view){
        Futbolista futbolista = (Futbolista)
                getSupportFragmentManager().findFragmentById(R.id.fragment);

        futbolista.updateFutbolistaView(3);
    }

    public void showIniesta(View view){
        Futbolista futbolista = (Futbolista)
                getSupportFragmentManager().findFragmentById(R.id.fragment);

        futbolista.updateFutbolistaView(2);
    }

}
