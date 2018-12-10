package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectABracket4sq extends AppCompatActivity {

    ImageButton imageButton1;

    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_abracket4sq);
        addListenerOnClik();

        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectAssembly");
                        startActivity(intent);
                    }
                }
        );
    }

    private void addListenerOnClik() {
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectAConnector11");
                        startActivity(intent);
                    }
                }
        );
    }
}
