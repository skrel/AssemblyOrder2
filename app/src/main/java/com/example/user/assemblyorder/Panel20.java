package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Panel20 extends AppCompatActivity {

    private Button button47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel20);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        button47 = (Button)findViewById(R.id.button47);
        button47.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.Panel23");
                        startActivity(intent);
                    }
                }
        );
    }
}
