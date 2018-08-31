package com.example.mizuki.okusan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView cpu;
    ImageView player;
    TextView result;
    Random r=new Random();
    int countlemonplayer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpu = (ImageView) findViewById(R.id.cpu);
        player = (ImageView) findViewById(R.id.player);
        result = (TextView) findViewById(R.id.result);


    }
    public void lemon(View v){

        countlemonplayer =countlemonplayer + 1;

        player.setImageResource(R.drawable.lemon);

        int ranbom = r.nextInt(3);

        if (ranbom == 0) {
            cpu.setImageResource(R.drawable.lemon);
            result.setText("VS");


        }else if (ranbom == 1) {
            cpu.setImageResource(R.drawable.barrier);
            result.setText("VS");

        }else if  (ranbom == 2) {
            cpu.setImageResource(R.drawable.attack);
            result.setText("LOSS...");
            countlemonplayer = 0;
        }


    }


    public void barrier(View v) {

        player.setImageResource(R.drawable.barrier);

        int ranbom = r.nextInt(3);

        if (ranbom == 0) {
            cpu.setImageResource(R.drawable.lemon);
            result.setText("VS");


        } else if (ranbom == 1) {
            cpu.setImageResource(R.drawable.barrier);
            result.setText("VS");

        } else if  (ranbom == 2) {
            cpu.setImageResource(R.drawable.attack);
            result.setText("VS");
        }
    }
    public void attack(View v) {

        if (countlemonplayer > 0) {
            player.setImageResource(R.drawable.attack);

            countlemonplayer = countlemonplayer - 1;

            int ranbom = r.nextInt(3);

            if (ranbom == 0) {
                cpu.setImageResource(R.drawable.lemon);
                result.setText("WIN!!!!");
                countlemonplayer = 0;


            } else if (ranbom == 1) {
                cpu.setImageResource(R.drawable.barrier);
                result.setText("VS");


            } else if (ranbom == 2) {
                cpu.setImageResource(R.drawable.attack);
                result.setText("VS");

            }
        } else {
            Toast.makeText(this,"使えません",Toast.LENGTH_SHORT).show();

        }
    }

    public void attack100(View v) {

        if (countlemonplayer > 1) {
            player.setImageResource(R.drawable.attack100);

            countlemonplayer = countlemonplayer - 2;

            int ranbom = r.nextInt(3);

            if (ranbom == 0) {
                cpu.setImageResource(R.drawable.lemon);
                result.setText("WIN!!!!");
                countlemonplayer = 0;


            } else if (ranbom == 1) {
                cpu.setImageResource(R.drawable.barrier);
                result.setText("WIN!!!");
                countlemonplayer = 0;


            } else if (ranbom == 2) {
                cpu.setImageResource(R.drawable.attack);
                result.setText("VS");

            }
        } else {
            Toast.makeText(this, "使えません", Toast.LENGTH_SHORT).show();
        }
    }

}

