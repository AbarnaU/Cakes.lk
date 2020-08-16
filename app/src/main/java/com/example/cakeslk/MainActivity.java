package com.example.cakeslk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

import com.example.cakeslk.Orders.OrderView;
import com.example.cakeslk.cakes.CakeUpdate;
import com.example.cakeslk.cakes.CakesView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout employee;
    private LinearLayout cake;
    private LinearLayout supplier;
    private LinearLayout product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Cakes.lk");

        employee = findViewById(R.id.employee_layout);
        employee.setOnClickListener(this);

        cake = findViewById(R.id.cake_layout);
        cake.setOnClickListener(this);

        supplier = findViewById(R.id.supplier_layout);
        supplier.setOnClickListener(this);

        product = findViewById(R.id.product_layout);
        product.setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public void onClick(View view){
        switch (view.getId()){

            case R.id.cake_layout:
                Intent intent2 = new Intent(MainActivity.this, CakesView.class);
                startActivity(intent2);
                break;

            case R.id.product_layout:
                Intent intent3 = new Intent(MainActivity.this, OrderView.class);
                startActivity(intent3);
                break;

        }
    }
}