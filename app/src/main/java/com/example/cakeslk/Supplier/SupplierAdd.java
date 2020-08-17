package com.example.cakeslk.Supplier;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cakeslk.R;

public class SupplierAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier_add);
    }

    public void clickAddButton(View view) {
        Intent intent = new Intent(this, SupplierView.class);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence msg = "Supplier  is added successfully";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }
}