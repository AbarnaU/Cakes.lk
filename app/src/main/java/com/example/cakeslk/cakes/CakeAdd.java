package com.example.cakeslk.cakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cakeslk.R;

public class CakeAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake_add);
    }

    public void clickAddButton(View view){
        Intent intent = new Intent(this,CakesView.class);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence msg = "Cake is added successfully";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

}