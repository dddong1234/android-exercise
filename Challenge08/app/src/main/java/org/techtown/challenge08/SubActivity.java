package org.techtown.challenge08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {
    Button btn_to_menu, btn_to_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn_to_menu = findViewById(R.id.btn_to_menu);
        btn_to_login = findViewById(R.id.btn_to_login);

        Intent intent = getIntent();
        processIntent(intent);

        btn_to_menu.setOnClickListener(click);
        btn_to_login.setOnClickListener(click);

    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_to_menu:
                    goToActivity(MenuActivity.class);
                    break;
                case R.id.btn_to_login:
                    goToActivity(MainActivity.class);
                    break;
            }
        }
    };

    private void goToActivity(Class activity) {
        Intent intent = new Intent(getApplicationContext(), activity);
        startActivity(intent);
    }

    private void processIntent(Intent intent) {
        if (intent != null) {
            setTitle(intent.getStringExtra("title"));

        }
    }
}