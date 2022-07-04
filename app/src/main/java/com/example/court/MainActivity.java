//HAMZA UMER FAROOQ - 200789
//MC ASSIGNMENT 1

package com.example.court;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView ctrTxt;

    private TextView ctrTxt2;

    private Button p3Btn;
    private Button frtBtn;
    private Button p2Btn;

    private Button p3Btn2;
    private Button frtBtn2;
    private Button p2Btn2;

    private ImageButton reset;
    private int counter;

    private int counter2;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.plusthree:
                    threepoints();
                    break;

                case R.id.freethrow:
                    plusthreeCounter();
                    break;

                case R.id.plustwo:
                    twopoints();
                    break;


                case R.id.plusthree2:
                    threepoints2();
                    break;

                case R.id.freethrow2:
                    plusthreeCounter2();
                    break;

                case R.id.plustwo2:
                    twopoints2();
                    break;
                case R.id.rst:
                    resetcounter();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctrTxt = (TextView) findViewById(R.id.counterTxt);

        ctrTxt2 = (TextView) findViewById(R.id.counterTxt);

        p3Btn = (Button) findViewById(R.id.plusthree);
        p3Btn.setOnClickListener(clickListener);

        frtBtn = (Button) findViewById(R.id.freethrow);
        frtBtn.setOnClickListener(clickListener);

        p2Btn = (Button) findViewById(R.id.plustwo);
        p2Btn.setOnClickListener(clickListener);

        reset = (ImageButton) findViewById(R.id.rst);
        reset.setOnClickListener(clickListener);



        ctrTxt2 = (TextView) findViewById(R.id.counterTxt2);

        p3Btn2 = (Button) findViewById(R.id.plusthree2);
        p3Btn2.setOnClickListener(clickListener);

        frtBtn2 = (Button) findViewById(R.id.freethrow2);
        frtBtn2.setOnClickListener(clickListener);

        p2Btn2 = (Button) findViewById(R.id.plustwo2);
        p2Btn2.setOnClickListener(clickListener);


        twopoints();
        twopoints2();
        resetcounter();
    }
    private void twopoints(){
        counter = counter +2;
        ctrTxt.setText(counter+ "");
    }

    private void plusthreeCounter(){


        Random random = new Random();
        int max = 4;
        int min = 0;
        int rmd = random.nextInt(max - min) + min;
        counter+=rmd;
        ctrTxt.setText(counter+ "");
    }

    private void threepoints(){
        counter=counter+3;
        ctrTxt.setText(counter+ "");
    }




    private void twopoints2(){
        counter2 = counter2+2;
        ctrTxt2.setText(counter2+ "");
    }

    private void plusthreeCounter2(){

        Random random = new Random();
        int max = 4;
        int min = 0;
        int rmd1 = random.nextInt(max - min) + min;
        counter2 +=rmd1;

        ctrTxt2.setText(counter2+ "");
    }

    private void threepoints2(){
        counter2 = counter2+3;
        ctrTxt2.setText(counter2+ "");
    }

    private void resetcounter(){
        counter=0;
        counter2=0;
        ctrTxt.setText(counter+ "");
        ctrTxt2.setText(counter2+ "");

    }


}