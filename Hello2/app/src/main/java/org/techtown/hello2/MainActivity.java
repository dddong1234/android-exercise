package org.techtown.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View view) {
        Toast.makeText(this, "버튼 1이 눌렸습니다", Toast.LENGTH_SHORT).show();
    }

    public void onButton2Clicked(View view) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onButton3Clicked(View view) {
        Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-8245-9496"));
        startActivity(myintent);
    }
}