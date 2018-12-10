package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Panel10 extends AppCompatActivity {

    private Button button19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel10);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.Panel12");
                        startActivity(intent);
                    }
                }
        );
    }
}
