package com.example.maira.radiobuttondemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
        final RadioGroup radioColor = (RadioGroup) findViewById(R.id.radioColor);
        Button btnEnter = (Button) findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int selectedId = radioColor.getCheckedRadioButtonId();

                if(selectedId == R.id.radio1)
                {
                    background.setBackgroundColor(Color.RED);
                }

                if(selectedId == R.id.radio2)
                {
                    background.setBackgroundColor(Color.BLUE);
                }

                if(selectedId == R.id.radio3)
                {
                    background.setBackgroundColor(Color.GREEN);
                }

                if(selectedId == R.id.radio4)
                {
                    background.setBackgroundColor(Color.YELLOW);
                }

            }
        });
    }
}
