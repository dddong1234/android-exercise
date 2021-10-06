package org.techtown.challenge08;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText txt_id, txt_pwd;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = new Intent();
//        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        txt_id = findViewById(R.id.txt_id);
        txt_pwd = findViewById(R.id.txt_pwd);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((txt_id.getText().length() == 0) || (txt_pwd.getText().length() == 0)) {
                    Toast.makeText(MainActivity.this,
                            "아이디나 비밀번호가 입력되지 않았습니다",
                            Toast.LENGTH_SHORT).show();
                } else {
                    goMenu();
                }
            }
        });


    }

    private void goMenu() {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        launcher.launch(intent);
    }

    ActivityResultLauncher launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                }
            }
    );
}