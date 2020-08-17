package com.example.cakeslk.Supplier;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cakeslk.R;

public class SupplierView extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout supplier1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier_view);
        this.setTitle("Supplier");

        supplier1 = findViewById(R.id.supplier1);
        supplier1.setOnClickListener(this);
    }

    public void clickAddButton(View view){
        Intent intent = new Intent(this, SupplierAdd.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.supplier1:
                Intent intent1 = new Intent(SupplierView.this, SupplierEdit.class);
                startActivity(intent1);
                break;

        }
    }
}

