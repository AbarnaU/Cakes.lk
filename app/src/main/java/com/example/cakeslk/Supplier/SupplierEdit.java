package com.example.cakeslk.Supplier;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cakeslk.R;

public class SupplierEdit extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_details);
    }

    public void clickUpdateButton(View view){
        Intent intent = new Intent(this,SupplierView.class);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence msg = "Supplier is updated successfully";
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
                        Intent intent = new Intent(SupplierEdit.this,SupplierView.class);
                        startActivity(intent);

                        Context context = getApplicationContext();
                        CharSequence msg = "Supplier is deleted successfully";
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
