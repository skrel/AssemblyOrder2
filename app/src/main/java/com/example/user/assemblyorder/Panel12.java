package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Panel12 extends AppCompatActivity {

    private Button button43;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel12);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        button43 = (Button)findViewById(R.id.button43);
        button43.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.Panel20");
                        startActivity(intent);
                    }
                }
        );
    }
}
