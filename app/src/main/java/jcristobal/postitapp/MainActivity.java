package jcristobal.postitapp;

import android.content.Intent;
import android.graphics.Outline;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
/*
        if (id == R.id.action_author) {
            Toast toast = Toast.makeText(getApplicationContext(), "Visita JCristobal en GitHub", Toast.LENGTH_SHORT);
            toast.show();
        }
*/
        if (id == R.id.action_exit) {
            finish();

        }

        return super.onOptionsItemSelected(item);
    }
}
