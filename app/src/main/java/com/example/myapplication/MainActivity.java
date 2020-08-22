package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton toggle = findViewById(R.id.togglebutton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
        public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    Toast.makeText(MainActivity.this, "Male clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_ninjas:
                if (checked)
                    Toast.makeText(MainActivity.this, "Female clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkbox_meat:
                if (checked)
                    Toast.makeText(MainActivity.this, "Coffee selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "No coffee selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkbox_cheese:
                if (checked)
                    Toast.makeText(MainActivity.this, "Reading Newspaper selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Reading Newspaper not selected", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}