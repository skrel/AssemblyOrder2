package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManualCreatedAssembly extends AppCompatActivity {

    Button button49;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_created_assembly);
        addListenerOnClick();
    }

    private void addListenerOnClick() {
        button49 = (Button)findViewById(R.id.button49);
        button49.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.Order100");
                        startActivity(intent);
                    }
                }
        );
    }
}
