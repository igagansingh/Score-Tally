package com.example.gagandeep.bbgame;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePointTeamA(View v)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointTeamA(View v)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void addFreeThrowTeamA(View v)
    {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public  void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePointTeamB(View v)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointTeamB(View v)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void addFreeThrowTeamB(View v)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void resetAll(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void mail(View v)
    {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"Scores for team A and B");
        intent.putExtra(Intent.EXTRA_TEXT,"Score of team A : " + String.valueOf(scoreTeamA)+
                "\n and \n" +
                "Score for team B : "+ String.valueOf(scoreTeamB)+"\n");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}