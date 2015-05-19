package com.vogella.testapp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onclick(View v)
    {
        Button button=(Button)findViewById(R.id.button);
        TextView newtext = (TextView) findViewById(R.id.texto);

             newtext.setText("hello world");
    }





}
