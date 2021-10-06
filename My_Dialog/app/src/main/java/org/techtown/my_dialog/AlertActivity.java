package org.techtown.my_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }

    @Override
    public void onBackPressed() {
        //AlertDialog 생성

        AlertDialog.Builder dialog = new AlertDialog.Builder(AlertActivity.this);
        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        dialog.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertActivity.this, "no clicked", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNeutralButton("neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertActivity.this, "neutral", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setTitle("app name");
        dialog.setMessage("do you want to exit app?");
        dialog.show();
    }
}