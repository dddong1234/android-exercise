package org.techtown.mycalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    StringBuffer sb;
    TextView textView, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        sb = new StringBuffer("");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(click);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(click);
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(click);
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(click);
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(click);
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(click);
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(click);
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(click);
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(click);
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(click);
        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(click);
        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(click);
        Button button13 = findViewById(R.id.button13);
        button13.setOnClickListener(click);
        Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(click);
        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(click);
        Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(click);
        Button button17 = findViewById(R.id.button17);
        button17.setOnClickListener(click);
        Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(click);
        Button button19 = findViewById(R.id.button19);
        button19.setOnClickListener(click);
        Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });




    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v instanceof Button) {
                sb.append(((Button) v).getText());
            }
            textView.setText(sb);
        }
    };
}