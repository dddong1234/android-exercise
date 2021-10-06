package org.techtown.challenge07;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMenu();
            }
        });

    }

    public void moveToMenu() {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        launcher.launch(intent);
    }

    ActivityResultLauncher launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Util.MENU_RESULT_CODE) {
                        String menu = result.getData().getStringExtra("menu");
                        Toast.makeText(MainActivity.this, menu, Toast.LENGTH_SHORT).show();
                    }
                }
            }
    );
}