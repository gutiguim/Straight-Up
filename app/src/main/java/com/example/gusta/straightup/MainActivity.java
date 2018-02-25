package com.example.gusta.straightup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUserData();
        EditText mEdit = findViewById(R.id.nameText);
        mEdit.setEnabled(false);
    }

    private void getUserData() {
        //TODO Get Profile Picture, Name and ID from settings file
    }

    public void goToFidelityListActivity(View view) {
        Intent intent = new Intent(this, FidelityListActivity.class);
        startActivity(intent);
    }
}
