package org.techtown.sampleintent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSubActivity();
                Toast.makeText(MainActivity.this, "main onclick실행", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void moveSubActivity() {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivityResult.launch(intent);
    }
    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Log.d("test", "MainActivity로 돌아왔다. ");
                        Toast.makeText(MainActivity.this, "main으로 돌아옴"+result
                                .getResultCode()+"data : "+result.getData().getStringExtra("name"), Toast.LENGTH_SHORT).show();
                    }
                }
            });

}