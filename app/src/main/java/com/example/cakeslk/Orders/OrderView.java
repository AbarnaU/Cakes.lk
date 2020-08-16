package com.example.cakeslk.Orders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cakeslk.R;

public class OrderView extends AppCompatActivity implements View.OnClickListener{

private LinearLayout order1;
private LinearLayout order2;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_view);
        this.setTitle("Order");

        order1 = findViewById(R.id.order1);
        order1.setOnClickListener(this);

        order2 = findViewById(R.id.order2);
        order2.setOnClickListener(this);
        }

public void clickAddButton(View view){
        Intent intent = new Intent(this,OrderAdd.class);
        startActivity(intent);
        }

public void onClick(View view) {
        switch (view.getId()) {
        case R.id.order1:
        Intent intent1 = new Intent(OrderView.this, OrderEdit.class);
        startActivity(intent1);
        break;

        }
        }
        }
