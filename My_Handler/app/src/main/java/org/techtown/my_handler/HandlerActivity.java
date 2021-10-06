package org.techtown.my_handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HandlerActivity extends AppCompatActivity {
    TextView txt_count;
    Button btn_start, btn_stop;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        txt_count = findViewById(R.id.txt_count);
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);

        btn_start.setOnClickListener(click);
        btn_stop.setOnClickListener(click);

    }//onCreate()
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_start:
                    handler.sendEmptyMessage(0);
                    break;

                case R.id.btn_stop:
                    handler.removeMessages(0);
                    break;
            }
        }
    };
    //카운트를 증가시키는 핸들러
    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
//            super.handleMessage(msg);
            handler.sendEmptyMessageDelayed(0, 1000);
            txt_count.setText(Integer.toString(++count));
        }
    };
}