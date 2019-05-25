package com.example.dahiyasaab.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        button=(Button) findViewById(R.id.button);
        button1=(Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }
    public void openActivity5() {
        Intent intent= new Intent(this, Activity5.class);
        startActivity(intent);
    }
    public void openActivity6() {
        Intent intent1= new Intent(this, Activity6.class);
        startActivity(intent1);
    }
}
