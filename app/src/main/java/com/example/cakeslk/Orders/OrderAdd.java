package com.example.cakeslk.Orders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cakeslk.R;

public class OrderAdd extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_add);
    }

    public void clickAddButton(View view) {
        Intent intent = new Intent(this, OrderView.class);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence msg = "Order is added successfully";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }
}