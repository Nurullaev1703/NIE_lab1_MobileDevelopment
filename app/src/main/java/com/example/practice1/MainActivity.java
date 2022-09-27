package com.example.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputA;
    EditText inputB;
    EditText inputX;
    TextView answer;
    Button solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputA = findViewById(R.id.inputA);
        inputB = findViewById(R.id.inputB);
        inputX = findViewById(R.id.inputX);
        answer = findViewById(R.id.answer);
        solve =  findViewById(R.id.button);
    }

    public void onClick(View V) {
        try {
            float a = Float.parseFloat(inputA.getText().toString());
            float b = Float.parseFloat(inputB.getText().toString());
            float x = Float.parseFloat(inputX.getText().toString());
            float y;
            if (x >= 4) {
                y = (10 * (x + a * a))/(b+a);
            } else {
                y = 5 * (x + a * a + b);
            }
            if (!(Double.isNaN(y)) && (!Double.isInfinite(y))) {
                answer.setText("Ответ: y = " + y); // Вывод ответа
            } else {
                answer.setText("Нет решения!"); // Нет решения
            }
        }
        catch(Exception e){
            answer.setText("Неправильно введены данные");
        }
    }


}