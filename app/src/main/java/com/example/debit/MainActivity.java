package com.example.debit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    EditText bp, rapport;
    TextView result1,result2;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bp  = (EditText) findViewById(R.id.bp);
        rapport  = (EditText) findViewById(R.id.rapport);
        result1 = (TextView) findViewById(R.id.result1);
        result2 = (TextView) findViewById(R.id.result2);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int bpval = Integer.parseInt(bp.getText().toString());
                // get text from EditText password view
                int rapportval = Integer.parseInt(rapport.getText().toString());

                result1.setText("Value= " + bpval*Math.log(1 + rapportval));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int bpval = Integer.parseInt(bp.getText().toString());
                // get text from EditText password view
                int rapportval = Integer.parseInt(rapport.getText().toString());

                result2.setText("Value= "  + bpval*Math.log(1+Math.pow(10 ,(rapportval/10))));
            }
        });
    }
}