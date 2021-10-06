package org.techtown.sampleparcelable;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_SIMPLE_DATA = "data";
    public static final int REQUEST_CODE_MENU = 101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                SimpleData data = new SimpleData(100, "Hello Android!");
                intent.putExtra(KEY_SIMPLE_DATA, data);
//                startActivityForResult(intent, REQUEST_CODE_MENU);



                startActivityResult.launch(intent);
            }
        });

    }
    ActivityResultLauncher startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Log.d("test", "MainActivity로 돌아왔다. ");
                        Toast.makeText(MainActivity.this, "main으로 돌아옴"+result
                                        .getResultCode()+"data : "+result.getData().getStringExtra("name"),
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
}