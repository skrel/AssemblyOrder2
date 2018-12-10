package com.example.user.assemblyorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectAssembly extends AppCompatActivity {

    private Button button2, button8, button4, button5, button3;

    ImageButton imageButton2, imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_assembly);
        addListenerOnButton();

        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);

        imageButton2.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v){
                                                Intent intent = new Intent("com.example.user.assemblyorder.Messenger51");
                                                startActivity(intent);
                                            }

                                        }

        );

        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);

        imageButton3.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v){
                                                Intent intent = new Intent("com.example.user.assemblyorder.About");
                                                startActivity(intent);
                                            }

                                        }

        );



    }



    private void addListenerOnButton() {
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.SelectABox");
                        startActivity(intent);
                    }
                }
        );


        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.ConduitBending50");
                        startActivity(intent);
                    }
                }
        );

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.CustomAssembly");
                        startActivity(intent);
                    }
                }
        );

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.Panel10");
                        startActivity(intent);
                    }
                }
        );

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.user.assemblyorder.MultyBoxAssembly");
                        startActivity(intent);
                    }
                }
        );

    }
}
