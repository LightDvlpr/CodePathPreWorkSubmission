package com.example.nur.hellonoor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));


                Log.i("Noor", "Button clicked");


        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.NewColor));
            }
        });


        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //grab the text the user input

                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if(TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello From Noor!");

                } else {

                    ((TextView) findViewById(R.id.textView)).setText(newText);

                }

                //put the text into text view once the change text button is clicked



            }
        });

            }
        });


        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reset text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                //Reset background color to color Accent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));

                // Reset text back to "Hello From Noor"
                ((TextView) findViewById(R.id.textView)).setText("Hello From Noor!");



            }
        });


        //grab the text the user input
        //put the text into text view once the change text button is clicked


    }
}
