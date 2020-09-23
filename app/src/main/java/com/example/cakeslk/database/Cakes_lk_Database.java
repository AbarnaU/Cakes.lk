package com.example.cakeslk.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.cakeslk.login.AdminDB;

public class Cakes_lk_Database extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 6;
    private static final String DATABASE_NAME = "cakes_lk.db";



    public Cakes_lk_Database(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(AdminDB.CREATE_USER_TABLE);
        db.execSQL(AdminDB.CREATE_ADMIN_TABLE);
        db.execSQL(AdminDB.INSERT_ADMIN);
        db.execSQL("CREATE TABLE Cake(C_Id INTEGER PRIMARY KEY AUTOINCREMENT,C_Name TEXT,C_Flavour TEXT,C_Price REAL,C_Description TEXT);");
        db.execSQL("CREATE TABLE Orders(P_Id INTEGER PRIMARY KEY AUTOINCREMENT,S_Name TEXT,P_Type TEXT,Quantity Integer,Amount Real);");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Cake");
        db.execSQL("DROP TABLE IF EXISTS Orders");
        db.execSQL("DROP TABLE IF EXISTS " + AdminDB.USER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + AdminDB.ADMIN_TABLE);
        onCreate(db);
    }
}
