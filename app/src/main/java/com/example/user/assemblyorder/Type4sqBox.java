package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Type4sqBox extends AppCompatActivity {

    private Button button12;

    ImageButton imageButton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type4sq_box);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectAccesories4sq");
                        startActivity(intent);
                    }
                }
        );

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
}
