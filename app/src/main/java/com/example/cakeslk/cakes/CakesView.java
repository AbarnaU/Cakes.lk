package com.example.cakeslk.cakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.cakeslk.MainActivity;
import com.example.cakeslk.R;

public class CakesView extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout cake1;
    private LinearLayout cake2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes_view);
        this.setTitle("Cake");

        cake1 = findViewById(R.id.cake1);
        cake1.setOnClickListener(this);

        cake2 = findViewById(R.id.cake2);
        cake2.setOnClickListener(this);

    }

    public void clickAddButton(View view){
        Intent intent = new Intent(this,CakeAdd.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cake1:
                Intent intent1 = new Intent(CakesView.this, CakeUpdate.class);
                startActivity(intent1);
                break;

        }
    }
}