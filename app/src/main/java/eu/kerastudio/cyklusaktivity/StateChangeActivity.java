package eu.kerastudio.cyklusaktivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.EditText;

public class StateChangeActivity extends AppCompatActivity {
    private static final String LAD = "ZmenaStavu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_change);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with zour own action",
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Log.i(LAD, "OnCreate");
    }

    @Override
        protected void onStart() {
           super.onStart(); Log.i(LAD, "onStart");
        }

    @Override
    protected void onResume() {
        super.onResume(); Log.i(LAD, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause(); Log.i(LAD, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop(); Log.i(LAD, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart(); Log.i(LAD, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy(); Log.i(LAD, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(LAD, "onSaveInstanceState");
        final EditText textBox =(EditText) findViewById(R.id.editText);
        CharSequence sText = textBox.getText();
        outState.putCharSequence("UlozenyText", sText);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(LAD, "onRestoreInstanceState");
        final EditText textBox = (EditText) findViewById(R.id.editText);
        CharSequence sText = savedInstanceState.getCharSequence("UlozenyText");
        textBox.setText(sText);
    }
}
