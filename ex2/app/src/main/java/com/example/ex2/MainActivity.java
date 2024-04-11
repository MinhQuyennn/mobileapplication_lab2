package com.example.ex2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup colorRadioGroup;
    private View mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.layoutMain);
        colorRadioGroup = findViewById(R.id.colorRadioGroup);

        colorRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                colorRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if (checkedId == R.id.redRadioButton) {
                            mainLayout.setBackgroundColor(Color.RED);
                        } else if (checkedId == R.id.greenRadioButton) {
                            mainLayout.setBackgroundColor(Color.GREEN);
                        } else if (checkedId == R.id.blueRadioButton) {
                            mainLayout.setBackgroundColor(Color.BLUE);
                        }
                    }
                });

            }
        });
    }
}
