package org.techtown.my_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentSubActivity extends AppCompatActivity {
    Button prev_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sub);
        prev_btn = findViewById(R.id.prev_btn);
        prev_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(IntentSubActivity.this, IntentMainActivity.class);
//                startActivity(i);
                finish();
            }
        });
    }
}