 package com.example.ksmahesh.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstNum = (TextView) findViewById(R.id.firstNum);
        Random rand = new Random();
        final int store = rand.nextInt(200);

          firstNum.setText(String.valueOf(store));
        final TextView secNum = (TextView)findViewById(R.id.secNum);
        final Button Btn1 = (Button)findViewById(R.id.Btn1);
        final Button secBtn = (Button)findViewById(R.id.secBtn);
        final Button thirdBtn = (Button)findViewById(R.id.thirdBtn);
        final Button fourthBtn = (Button)findViewById(R.id.fourthBtn);
        final Button resetBtn = (Button)findViewById(R.id.resetBtn);
        final ConstraintLayout backg=(ConstraintLayout)findViewById(R.id.backg);

        final int score = 0;
        secNum.setText("0");
        final CharSequence charoverrun = "exceeded number";
        final int time = Toast.LENGTH_SHORT;

        Btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        int score = Integer.parseInt(secNum.getText().toString());
                                        score++;
                                        if (score == store) {
                                            Btn1.setEnabled(false);
                                            secBtn.setEnabled(false);
                                            thirdBtn.setEnabled(false);
                                            fourthBtn.setEnabled(false);
                                            backg.setBackgroundColor(Color.CYAN);
                                        } else if (score > store) {
                                            Btn1.setEnabled(false);
                                            secBtn.setEnabled(false);
                                            thirdBtn.setEnabled(false);
                                            fourthBtn.setEnabled(false);
                                            Context cont = getApplicationContext();
                                            Toast.makeText(cont, charoverrun, time);
                                        }

                                        secNum.setText(String.valueOf(score));
                                    }
        });


         secBtn.setOnClickListener(new View.OnClickListener(){
         @Override
                    public void onClick(View view) {
             int score = Integer.parseInt(secNum.getText().toString());
             score+= 2;
             if (score == store) {
                 Btn1.setEnabled(false);
                 secBtn.setEnabled(false);
                 thirdBtn.setEnabled(false);
                 fourthBtn.setEnabled(false);
                 backg.setBackgroundColor(Color.CYAN);
             } else if (score > store) {
                 Btn1.setEnabled(false);
                 secBtn.setEnabled(false);
                 thirdBtn.setEnabled(false);
                 fourthBtn.setEnabled(false);
                 Context cont = getApplicationContext();
                 Toast.makeText(cont, charoverrun, time);
             }

             secNum.setText(String.valueOf(score));
         }
         });



        thirdBtn.setOnClickListener(new View.OnClickListener(){
         @Override

            public void onClick(View view){
             int score = Integer.parseInt(secNum.getText().toString());
             score+= 5;
             if (score == store) {
                 Btn1.setEnabled(false);
                 secBtn.setEnabled(false);
                 thirdBtn.setEnabled(false);
                 fourthBtn.setEnabled(false);
                 backg.setBackgroundColor(Color.CYAN);
             } else if (score > store) {
                 Btn1.setEnabled(false);
                 secBtn.setEnabled(false);
                 thirdBtn.setEnabled(false);
                 fourthBtn.setEnabled(false);
                 Context cont = getApplicationContext();
                 Toast.makeText(cont, charoverrun, time);
             }

             secNum.setText(String.valueOf(score));
         }
        });



         fourthBtn.setOnClickListener(new View.OnClickListener(){
         @Override

            public void onClick(View view){
             int score = Integer.parseInt(secNum.getText().toString());
             score+= 10;
             if (score == store) {
                 Btn1.setEnabled(false);
                 secBtn.setEnabled(false);
                 thirdBtn.setEnabled(false);
                 fourthBtn.setEnabled(false);
                 backg.setBackgroundColor(Color.CYAN);
             } else if (score > store) {
                 Btn1.setEnabled(false);
                 secBtn.setEnabled(false);
                 thirdBtn.setEnabled(false);
                 fourthBtn.setEnabled(false);
                 Context cont = getApplicationContext();
                 Toast.makeText(cont, charoverrun, time);
             }

             secNum.setText(String.valueOf(score));
         }
         });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int score = Integer.parseInt(secNum.getText().toString());
                score = 0;
                secNum.setText("0");

            }
        });
    }
}
