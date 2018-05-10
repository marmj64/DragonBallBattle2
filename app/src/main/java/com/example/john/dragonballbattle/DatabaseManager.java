package com.example.john.dragonballbattle;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AlertDialog;

/**
 * Created by John on 4/24/2018.
 */

public class DatabaseManager extends SQLiteOpenHelper{

    private static final String DB_NAME = "dragonballbattle";
    private static final int DB_VERSION = 1;
    private static final String T_USER_INFO = "userInfo";
    private static final String T_RESULTS = "gameResults";
    private static final String UNAME = "username";
    private static final String PWORD = "password";
    private static final String RESULT = "result";
    private static final String FIGHTER = "fighter";

    public DatabaseManager(Context context){
     super( context, DB_NAME, null, DB_VERSION );
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreateUserTable = "create table " + T_USER_INFO + "( " + UNAME +" text primary key, "+ PWORD + " text )" ;
        db.execSQL(sqlCreateUserTable);
        //TODO 1. Need to ensure that the username in the results table is the username from the user info. Do we need to make this a foreign key?
        //TODO 2. The results table may need additional columns?
        String sqlCreateResultsTable = "create table " + T_RESULTS + "( " + UNAME +" text primary key UNIQUE, "+ FIGHTER + " text, "+ RESULT + " text )" ;
        db.execSQL(sqlCreateResultsTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldDb, int newDb) {
        db.execSQL( "drop table if exists " + T_USER_INFO );
        db.execSQL( "drop table if exists " + T_RESULTS );
        onCreate(db);
    }

    public void insertUser(User user){
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlInsert = "insert into " + T_USER_INFO + " values('" + user.getUsername() + "', '" + user.getPassword() + "')";
        db.execSQL(sqlInsert);
        db.close();
    }

    //TODO 3. What needs to be passed in to insert a result.
    public void insertResult(User user, Fighter fighter){
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlInsert = "insert into " + T_RESULTS + " values('" + user.getUsername() + "', '" + fighter.getName() + "', '" + user.getResult() + "' )";
        db.execSQL(sqlInsert);
        db.close();
    }

    public int searchUser(String username, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSearch = "select " + PWORD + " from " +T_USER_INFO + " where " + UNAME + " = '" + username+"'; ";
        Cursor cursor = db.rawQuery( sqlSearch, null );
        if(cursor.getCount()>0){
            cursor.moveToNext();
            if(password.equals(cursor.getString(0))){//correct info
                return 0;
            }
        }
        else {//username is wrong
            return 1;
        }
        return 2; //passoword is wrong
    }


}
