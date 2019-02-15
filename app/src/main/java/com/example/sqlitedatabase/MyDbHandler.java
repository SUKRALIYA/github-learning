package com.example.sqlitedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDbHandler extends SQLiteOpenHelper {
    private static String key_id="user_id";
    private static String key_name="user_name";
    private static String key_mobile="mobile";
    private static String key_table="user_table";

    public MyDbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String creat_user="CREATE TABLE "+key_table+"("+key_id+" INTEGER PRIMARY KEY,"+key_name+" TEXT,"
                +key_mobile+" TEXT"+")";
        db.execSQL(creat_user);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
