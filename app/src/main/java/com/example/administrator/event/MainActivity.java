package com.example.administrator.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA;
    EditText edtSoB;
    Button btnTong;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSoA = findViewById(R.id.edtSoA);
        edtSoB = findViewById(R.id.edtSoB);
        btnTong = findViewById(R.id.btnTong);
        tvResult = findViewById(R.id.tvResult);
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    tvResult.setText(Double.parseDouble(edtSoA.getText().toString()) + Double.parseDouble(edtSoB.getText().toString()) + "");
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "xin nhập số!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
