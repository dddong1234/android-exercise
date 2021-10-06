package org.techtown.lifecycleactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MY", "-- onDestroy() --");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        // 앱 실행
        //onCreate() -> 처음 앱을 실행시켰을 때 단 한번 호출되는 메서드
        //onStart()
        //onResume()

        //홈버튼 클릭
        //onPause()
        //onStop()

        //다시 앱으로 복귀
        //onRestart()
        //onStart()
        //onResume()

        //뒤로가기 버튼으로 앱 종료
        //onPause()
        //onStop()
        //onDestroy() - > 앱이 완전히 종료되었을 때 단 한번 호출



        Log.i("MY", "-- onCreate() --");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MY", "-- onPause() --");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MY", "-- onRestart() --");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MY", "-- onResume() --");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MY", "-- onStart() --");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MY", "-- onStop() --");
    }
}
