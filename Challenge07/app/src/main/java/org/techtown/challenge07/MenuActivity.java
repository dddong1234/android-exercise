package org.techtown.challenge07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn_cust = findViewById(R.id.btn_cust);
        Button btn_sale = findViewById(R.id.btn_sale);
        Button btn_prod = findViewById(R.id.btn_prod);

        btn_cust.setOnClickListener(click);
        btn_sale.setOnClickListener(click);
        btn_prod.setOnClickListener(click);
    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_cust:
                    setData("고객 관리");
                case R.id.btn_sale:
                    setData("매출 관리");
                case R.id.btn_prod:
                    setData("상품 관리");
            }
        }
    };

    private void setData(String data) {
        Intent intent = new Intent();
        intent.putExtra("menu", data);
        setResult(Util.MENU_RESULT_CODE, intent);
        finish();
    }
}