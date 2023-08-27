package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // UI를 위한 컴포넌트 준비(사용자 입력/출력을 담당)
    EditText edit1, edit2;
    Button btn_add, btn_sub, btn_mul, btn_div;
    TextView text_result;

    // 계산을 위한 변수 준비
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 사용자가 입력한 숫자를 프로그램내부로 가져오기
        // UI요소와 바인딩 작업
        edit1 = findViewById(R.id.edit_1);
        edit2 = findViewById(R.id.edit_2);

        text_result = findViewById(R.id.text_result);

        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);

        //이벤트를 처리하는 틀의 구조
        btn_add.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event){
                //여기서 덧셈처리
                //1.숫자 가져오기
                num1 = edit1.getText().toString();//.toString(): 형맞추려고 xml의 10은 숫자가 아니니까.
                num2 = edit2.getText().toString();

                //2.덧셈처리
                result = Integer.parseInt(num1)+Integer.parseInt(num2);

                //3.결과 출격
                text_result.setText("--> "+result.toString());

                return false;
            }
        });
        btn_sub.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event){
                //여기서 덧셈처리
                //1.숫자 가져오기
                num1 = edit1.getText().toString();//.toString(): 형맞추려고 xml의 10은 숫자가 아니니까.
                num2 = edit2.getText().toString();

                //2.뺄셈처리
                result = Integer.parseInt(num1)-Integer.parseInt(num2);

                //3.결과 출격
                text_result.setText("--> "+result.toString());

                return false;
            }
        });
        btn_mul.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event){
                //여기서 덧셈처리
                //1.숫자 가져오기
                num1 = edit1.getText().toString();//.toString(): 형맞추려고 xml의 10은 숫자가 아니니까.
                num2 = edit2.getText().toString();

                //2.곱셈처리
                result = Integer.parseInt(num1)*Integer.parseInt(num2);

                //3.결과 출격
                text_result.setText("--> "+result.toString());

                return false;
            }
        });
        btn_div.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event){
                //여기서 덧셈처리
                //1.숫자 가져오기
                num1 = edit1.getText().toString();//.toString(): 형맞추려고 xml의 10은 숫자가 아니니까.
                num2 = edit2.getText().toString();

                //2.나누셈처리
                result = Integer.parseInt(num1)/Integer.parseInt(num2);

                //3.결과 출격
                text_result.setText("--> "+result.toString());

                return false;
            }
        });


    }
}