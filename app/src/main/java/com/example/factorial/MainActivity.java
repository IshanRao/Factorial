package com.example.factorial;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString().trim();


                if(s.length()>2)
                {
                    editText1.setText("Value out of Range");
                }
                else {

                    int num = Integer.parseInt(s);

                    if (num > 16) {
                        editText1.setText("ERROR");

                    } else {
                        int i, fact = 1;
                        for (i = 1; i <= num; i++) {
                            fact = fact * i;
                        }
                        editText1.setText(Integer.toString(fact));
                    }
                }

                //Intent intent=new Intent(MainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });
    }
}
