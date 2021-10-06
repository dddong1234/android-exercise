package org.techtown.my_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomDialogActivity extends AppCompatActivity {
    Dialog dialog;
    Button btn_yes, btn_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
    }
    //뒤로가기 버튼 클릭 감지


    @Override
    public void onBackPressed() {
        //다이알로그 생성
        dialog = new Dialog(CustomDialogActivity.this);
        dialog.setContentView(R.layout.my_dialog);
        btn_yes = dialog.findViewById(R.id.btn_yes);
        btn_no = dialog.findViewById(R.id.btn_no);

        btn_yes.setOnClickListener(click);
        btn_no.setOnClickListener(click);

        dialog.setTitle("app name");
        dialog.show();

    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_yes:
                    finish();//앱(액티비티) 종료
                    break;
                case R.id.btn_no:
                    dialog.dismiss();
                    break;
            }
        }
    };
}