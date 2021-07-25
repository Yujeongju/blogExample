package com.yujeongju.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        SettingListener();
    }

    private void init() {
        editText = findViewById(R.id.input_et);
        button = findViewById(R.id.final_btn); //xml에서 생성한 id 매치
    }

    private void SettingListener() {
        //버튼에 클릭 이벤트 적용
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString(); //editText에 입력한 문자열을 얻어 온다.

                //인텐트 선언 및 정의
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //입력한 input값을 intent로 전달한다.
                intent.putExtra("text", input);
                //액티비티 이동
                startActivity(intent);
            }
        });
    }
}