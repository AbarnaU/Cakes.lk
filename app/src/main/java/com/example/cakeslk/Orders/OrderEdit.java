package com.example.cakeslk.Orders;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cakeslk.R;

public class OrderEdit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_edit);
    }

    public void clickUpdateButton(View view){
        Intent intent = new Intent(this,OrderView.class);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence msg = "Order is updated successfully";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

    public void clickDeleteButton(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to delete?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(OrderEdit.this,OrderView.class);
                        startActivity(intent);

                        Context context = getApplicationContext();
                        CharSequence msg = "Order is deleted successfully";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, msg, duration);
                        toast.show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }


}
