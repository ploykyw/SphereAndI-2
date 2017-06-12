package com.example.ployk.sphereandi_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    private TextView showCommandText;
    private TextView statusTxt;

    private Button UPbtn;
    private Button DOWNbtn;
    private Button LEFTbtn;
    private Button RIGHTbtn;
    private Button RUNbtn;
    private Button RESETbtn;
    private List<String> Test;
    private int listSize;
    private int maxCommand;
    private ImageView img0, img1, img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15;
    private ImageView img16, img17,img18,img19,img20,img21,img22,img23,img24;
    public  ImageView IMGS[] = new  ImageView[]{img0, img1, img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16, img17,img18,img19,img20,img21,img22,img23,img24};


    public int realStartPos;
    public int startPos;
    public int currentPos;
    public int targetPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), " FIND YOUR STAR  >_< ",
                           Toast.LENGTH_LONG).show();

        UPbtn = (Button) findViewById(R.id.up);
        DOWNbtn = (Button) findViewById(R.id.down);
        LEFTbtn = (Button) findViewById(R.id.left);
        RIGHTbtn = (Button) findViewById(R.id.right);


        RUNbtn = (Button) findViewById(R.id.run);
        RESETbtn = (Button) findViewById(R.id.reset);

        showCommandText = (TextView) findViewById(R.id.commandText);
        statusTxt = (TextView) findViewById(R.id.ststusText);


        final ArrayList<String> Test = new ArrayList<String>();
        maxCommand = 6;

        realStartPos = 6;

        startPos = realStartPos;
        currentPos = startPos;

        targetPos = 18;
        SetPicDefault();

        IMGS[startPos].setImageResource(R.drawable.orange);
        //setImages();


        UPbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Test.add("up");
                listSize = Test.size();
                showCommandText.setText("" + Test.toString());


            }
        });


        DOWNbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Test.add("down");
                int listSize = Test.size();
                showCommandText.setText("" + Test.toString());


            }
        });

        LEFTbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    Test.add("left");
                    int listSize = Test.size();
                    showCommandText.setText("" + Test.toString());

            }
        });

        RIGHTbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int listSize = Test.size();

                    Test.add("right");
                    showCommandText.setText("" + Test.toString());
            }
        });

        RUNbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int listSize = Test.size();

                if(listSize != 0) {


                        for(int i = 0 ; i < listSize ; i ++) {

                            if(Test.get(i) == "up"){

                                if(currentPos >= 5) {

                                    currentPos = startPos - 5;

                                    SetPicDefault();
                                    IMGS[currentPos].setImageResource(R.drawable.orange);

                                    startPos = currentPos;
                                }
                            }

                            if(Test.get(i) == "down"){
                                if(currentPos < 20) {
                                        currentPos = startPos + 5;

                                        SetPicDefault();
                                        IMGS[currentPos].setImageResource(R.drawable.orange);

                                        startPos = currentPos;
                                }
                            }

                            if(Test.get(i) == "left"){

                                if(currentPos > 0 && currentPos != 5 && currentPos != 10 && currentPos != 15 && currentPos != 20 ) {
                                    currentPos = startPos - 1;

                                    SetPicDefault();
                                    IMGS[currentPos].setImageResource(R.drawable.orange);

                                    startPos = currentPos;
                                }
                            }

                            if(Test.get(i) == "right"){

                                if(currentPos < 24 && currentPos != 4 && currentPos != 9 && currentPos != 14 && currentPos != 19 ) {
                                    currentPos = startPos + 1;

                                    SetPicDefault();
                                    IMGS[currentPos].setImageResource(R.drawable.orange);

                                    startPos = currentPos;

                                }
                                }
                        }

                    if(targetPos == currentPos){
                        statusTxt.setText("You Win <3");
                    }else{
                        statusTxt.setText("Game Over, Press Reset to try again :) ");
                    }

                    Test.clear();

                }
            }

        });

        RESETbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Test.clear();
                int listSize = Test.size();
                SetPicDefault();
                statusTxt.setText("Reset button was clicked!");
                showCommandText.setText("empty"+ Test.toString());

                currentPos = startPos;
                startPos = realStartPos;
                IMGS[startPos].setImageResource(R.drawable.orange);

            }
        });

    }



    public void SetPicDefault() {
         img0 = (ImageView) findViewById(R.id.imageView1);
         img1 = (ImageView) findViewById(R.id.imageView2);
         img2 = (ImageView) findViewById(R.id.imageView3);
         img3 = (ImageView) findViewById(R.id.imageView4);
         img4 = (ImageView) findViewById(R.id.imageView5);

         img5 = (ImageView) findViewById(R.id.imageView6);
         img6 = (ImageView) findViewById(R.id.imageView7);
         img7 = (ImageView) findViewById(R.id.imageView8);
         img8 = (ImageView) findViewById(R.id.imageView9);
         img9 = (ImageView) findViewById(R.id.imageView10);

         img10 = (ImageView) findViewById(R.id.imageView11);
         img11 = (ImageView) findViewById(R.id.imageView12);
         img12 = (ImageView) findViewById(R.id.imageView13);
         img13 = (ImageView) findViewById(R.id.imageView14);
         img14 = (ImageView) findViewById(R.id.imageView15);

         img15 = (ImageView) findViewById(R.id.imageView16);
         img16 = (ImageView) findViewById(R.id.imageView17);
         img17 = (ImageView) findViewById(R.id.imageView18);
         img18 = (ImageView) findViewById(R.id.imageView19);
         img19 = (ImageView) findViewById(R.id.imageView20);

         img20 = (ImageView) findViewById(R.id.imageView21);
         img21 = (ImageView) findViewById(R.id.imageView22);
         img22 = (ImageView) findViewById(R.id.imageView23);
         img23 = (ImageView) findViewById(R.id.imageView24);
         img24 = (ImageView) findViewById(R.id.imageView25);

        IMGS[0] = img0; IMGS[1] = img1; IMGS[2] = img2; IMGS[3] = img3; IMGS[4] = img4;
        IMGS[5] = img5; IMGS[6] = img6; IMGS[7] = img7; IMGS[8] = img8; IMGS[9] = img9;
        IMGS[10] = img10; IMGS[11] = img11; IMGS[12] = img12; IMGS[13] = img13; IMGS[14] = img14;
        IMGS[15] = img15; IMGS[16] = img16; IMGS[17] = img17; IMGS[18] = img18; IMGS[19] = img19;
        IMGS[20] = img20; IMGS[21] = img21; IMGS[22] = img22; IMGS[23] = img23; IMGS[24] = img24;

        setImages();

    }

    private void setImages() {

        for (ImageView img : IMGS) {
            img.setImageResource(R.drawable.g0);
        }

        IMGS[targetPos].setImageResource(R.drawable.star);

    }



}
