package com.cookandroid.project10_1_advanced;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

//2019038030 김진영
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티 (수정)");

        final RadioButton rdoSecond = findViewById(R.id.rdoSecond);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;

                if (rdoSecond.isChecked() == true)
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                else
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);

                startActivity(intent);
            }
        });
    }
}