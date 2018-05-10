package com.example.john.dragonballbattle;

import android.database.sqlite.SQLiteConstraintException;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void createUser(View v) {
        DatabaseManager db = new DatabaseManager(this);
        EditText userName = (EditText) findViewById(R.id.createAccountUsernameText);
        EditText password = (EditText) findViewById(R.id.createAccountPasswordText);
        EditText passwordValidate = (EditText) findViewById(R.id.createAccountPassword2Text);
        String userNameStr = userName.getText().toString();
        String passwordStr = password.getText().toString();
        String passwordValidateStr = passwordValidate.getText().toString();

        if (userNameStr.length() < 7) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Username must be at least seven characters long");
            alertDialog.setMessage("");
            alertDialog.show();
        } else {

            if (!(passwordStr.equals(passwordValidateStr))) {
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Invalid Password");
                alertDialog.setMessage("The Passwords Do Not Match. Please Re-Enter");
                alertDialog.show();
                password.setText("");
                passwordValidate.setText("");
            } else {
                User user = new User(userNameStr, passwordStr);
                try {
                    db.insertUser(user);
                    Toast.makeText(this, "Account Created", Toast.LENGTH_LONG).show();
                    finish();
                } catch (SQLiteConstraintException e) {
                    AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                    alertDialog.setTitle("Invalid User Name");
                    alertDialog.setMessage("This User Name Already Exists. Please Select A New One.");
                    alertDialog.show();
                }
            }

        }
    }

}
