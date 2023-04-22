package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private String startGame = "X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5;
    int scoreX=0,scoreY=0;
    int i=0;
    private TextView scorex,scorey;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.buttonImage1);
        btn2 = findViewById(R.id.buttonImage2);
        btn3 = findViewById(R.id.buttonImage3);
        btn4 = findViewById(R.id.buttonImage4);
        btn5 = findViewById(R.id.buttonImage5);
        btn6 = findViewById(R.id.buttonImage6);
        btn7 = findViewById(R.id.buttonImage7);
        btn8 = findViewById(R.id.buttonImage8);
        btn9 = findViewById(R.id.buttonImage9);


        scorex=findViewById(R.id.ScoreX);
        scorey=findViewById(R.id.ScoreY);

        reset=findViewById(R.id.resbtn);


//        on clicking reset button
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setImageDrawable(null);
                btn2.setImageDrawable(null);
                btn3.setImageDrawable(null);
                btn4.setImageDrawable(null);
                btn5.setImageDrawable(null);
                btn6.setImageDrawable(null);
                btn7.setImageDrawable(null);
                btn8.setImageDrawable(null);
                btn9.setImageDrawable(null);
                resetValues();
                scoreX = 0;
                scoreY = 0;
                scorex.setText("Score X : "+ String.valueOf(scoreX));
                scorey.setText("Score Y : "+ String.valueOf(scoreY));
            }
        });

        //button 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn1.setImageResource(R.drawable.cross);
                    b1 = 1;
                    i++;
                }
                else{
                    btn1.setImageResource(R.drawable.circle);
                    b1 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        //button2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn2.setImageResource(R.drawable.cross);
                    b2 = 1;
                    i++;
                }
                else{
                    btn3.setImageResource(R.drawable.circle);
                    b2 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        //button3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn3.setImageResource(R.drawable.cross);
                    b3 = 1;
                    i++;
                }
                else{
                    btn3.setImageResource(R.drawable.circle);
                    b3 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        //button4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn4.setImageResource(R.drawable.cross);
                    b4 = 1;
                    i++;
                }
                else{
                    btn4.setImageResource(R.drawable.circle);
                    b4 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        //button5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn5.setImageResource(R.drawable.cross);
                    b5 = 1;
                    i++;
                }
                else{
                    btn5.setImageResource(R.drawable.circle);
                    b5 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        //button6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn6.setImageResource(R.drawable.cross);
                    b6 = 1;
                    i++;
                }
                else{
                    btn6.setImageResource(R.drawable.circle);
                    b6 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        //button7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn7.setImageResource(R.drawable.cross);
                    b7 = 1;
                    i++;
                }
                else{
                    btn7.setImageResource(R.drawable.circle);
                    b7 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        //button8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn8.setImageResource(R.drawable.cross);
                    b8 = 1;
                    i++;
                }
                else{
                    btn8.setImageResource(R.drawable.circle);
                    b8 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        //button9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn9.setImageResource(R.drawable.cross);
                    b9 = 1;
                    i++;
                }
                else{
                    btn9.setImageResource(R.drawable.circle);
                    b9 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

    }


    //choosing function by default X will start the game and O will continue
    private void choosePlayer() {
        if(startGame.equals("X")){
            startGame = "O";
        }
        else{
            startGame = "X";
        }
    }



    //Logic for winning Game Function
    private void winningGame() {
        //condition 1
        if((b1 == 1) && (b2 == 1) && (b3 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                //when a player wins and click on OK the whole grid is being set to null
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }

        //condition 2
        else if((b4 == 1) && (b5 == 1) && (b6 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }



        //condition 3
        else if((b7 == 1) && (b8 == 1) && (b9 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }



        //condition 4
        else if((b1 == 1) && (b4 == 1) && (b7 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }


        //condition 5
        else if((b2 == 1) && (b5 == 1) && (b8 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }


        //condition 6
        else if((b3 == 1) && (b6 == 1) && (b9 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }



        //condition 7
        else if((b1 == 1) && (b5 == 1) && (b9 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }



        //condition 8
        else if((b1 == 3) && (b2 == 5) && (b7 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreX++;
            scorex.setText("Score X : "+ String.valueOf(scoreX));
        }

        //condition 9
        else if((b1 == 0) && (b2 == 0) && (b3 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }


        //condition 10
        else if((b4 == 0) && (b5 == 0) && (b6 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }



        //condition 11
        else if((b7 == 0) && (b8 == 0) && (b9 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }



        //condition 12
        else if((b1 == 0) && (b4 == 0) && (b7 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }


        //condition 13
        else if((b2 == 0) && (b5 == 0) && (b8 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }



        //condition 14
        else if((b3 == 0) && (b6 == 0) && (b9 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }




        //condition 15
        else if((b1 == 0) && (b5 == 0) && (b9 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }




        //condition 16
        else if((b3 == 0) && (b5 == 0) && (b7 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            scoreY++;
            scorex.setText("Score O : "+ String.valueOf(scoreY));
        }


        else{
            if(i == 9){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btn1.setImageDrawable(null);
                        btn2.setImageDrawable(null);
                        btn3.setImageDrawable(null);
                        btn4.setImageDrawable(null);
                        btn5.setImageDrawable(null);
                        btn6.setImageDrawable(null);
                        btn7.setImageDrawable(null);
                        btn8.setImageDrawable(null);
                        btn9.setImageDrawable(null);
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
        //end of conditions
    }

    private void resetValues() {

        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;

    }

}