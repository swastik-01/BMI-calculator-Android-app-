package com.example.bmicalcii;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText wt;
    private EditText ht;
    private Button btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wt = (EditText) (findViewById(R.id.weight));
        ht = (EditText) (findViewById(R.id.height));
        btn = (Button) (findViewById(R.id.button));
        result = (TextView) (findViewById(R.id.answer));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double wt1 = Integer.parseInt(wt.getText().toString());
                double ht1 = Integer.parseInt(ht.getText().toString());

                double calculation = 10000.0 * wt1 / (ht1 * ht1);
                result.setText("Your BMI is :" + String.valueOf(calculation));
            }
        });
    }
}