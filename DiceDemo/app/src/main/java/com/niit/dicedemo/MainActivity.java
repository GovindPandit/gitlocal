package com.niit.dicedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int[] arr={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};
    ImageView iv;
    int n;
    int score;
    int p;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=findViewById(R.id.imageView);
    }

    public void onScoreButtonClicked(View view)
    {
        Toast.makeText(this, "Score: "+score, Toast.LENGTH_SHORT).show();
    }
    public void onResetButtonClicked(View view)
    {
        score=0;
    }
    public void onRollButtonClicked(View view)
    {
        Random random=new Random();//xfd001
        n=random.nextInt(6);//2

        while(p==n)
        {
            n=random.nextInt(6);//3
        }
        iv.setImageResource(arr[n-1]);
        p=n;//3
        score+=n;//2
    }
}
