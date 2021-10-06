package org.techtown.challenge08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btn_cust, btn_sale, btn_prod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_cust = findViewById(R.id.btn_cust);
        btn_sale = findViewById(R.id.btn_sale);
        btn_prod = findViewById(R.id.btn_prod);

        btn_cust.setOnClickListener(click);
        btn_sale.setOnClickListener(click);
        btn_prod.setOnClickListener(click);

    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_cust:
                    setIntent("고객 관리");
                    break;
                case R.id.btn_sale:
                    setIntent("매출 관리");
                    break;
                case R.id.btn_prod:
                    setIntent("상품 관리");
                    break;
            }
        }
    };
    private void setIntent(String title) {
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        intent.putExtra("title", title);
        setResult(Util.MENU_RESULT_CODE,intent);
        finish();
        startActivity(intent);
    }
}