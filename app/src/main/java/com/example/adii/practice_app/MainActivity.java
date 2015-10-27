package com.example.adii.practice_app;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(login_button_listener);
        final EditText username_text = (EditText) findViewById(R.id.username);
        final EditText password_text = (EditText) findViewById(R.id.password);
        ConnectivityManager conn = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean wifi = conn.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();

    }
    private Button.OnClickListener login_button_listener = new Button.OnClickListener() {
        public void onClick(View v) {
            final EditText uname_et = (EditText) findViewById(R.id.username);
            EditText password_et = (EditText) findViewById(R.id.password);
            String username = uname_et.getText().toString();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("username", uname_et.getText().toString());
            String password = password_et.getText().toString();
            if (username.equals("Adil") && password.equals("p")) {
                startActivity(intent);
            }
        }

    };


}
