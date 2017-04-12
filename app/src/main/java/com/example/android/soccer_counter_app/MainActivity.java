package com.example.android.soccer_counter_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int shotTeamA =0;
    int cornerTeamA =0;
    int yellowTeamA = 0;
    int redTeamA = 0;
    int scoreTeamB = 0;
    int shotTeamB =0;
    int cornerTeamB =0;
    int yellowTeamB = 0;
    int redTeamB= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalForTeamA (View v){
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }

    private void displayGoalForTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addShotForTeamA (View v){
        shotTeamA = shotTeamA + 1;
        displayShotForTeamA(shotTeamA);
    }

    private void displayShotForTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.shot_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addCornerForTeamA (View v){
        cornerTeamA = cornerTeamA + 1;
        displayCornerForTeamA(cornerTeamA);
    }

    private void displayCornerForTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.corner_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addYellowForTeamA (View v){
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);
    }

    private void displayYellowForTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.yellow_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addRedForTeamA (View v){
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);
    }

    private void displayRedForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalForTeamB (View v){
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }

    private void displayGoalForTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addShotForTeamB (View v){
        shotTeamB = shotTeamB + 1;
        displayShotForTeamB(shotTeamB);
    }

    private void displayShotForTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.shot_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addCornerForTeamB (View v){
        cornerTeamB = cornerTeamB + 1;
        displayCornerForTeamB(cornerTeamB);
    }

    private void displayCornerForTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.corner_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addYellowForTeamB (View v){
        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);
    }

    private void displayYellowForTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.yellow_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addRedForTeamB (View v){
        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }

    private void displayRedForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset (View v) {
        scoreTeamA = 0;
        shotTeamA =0;
        cornerTeamA =0;
        yellowTeamA = 0;
        redTeamA = 0;
        scoreTeamB = 0;
        shotTeamB =0;
        cornerTeamB =0;
        yellowTeamB = 0;
        redTeamB= 0;
        displayGoalForTeamA(scoreTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayShotForTeamA(shotTeamA);
        displayShotForTeamB(shotTeamB);
        displayCornerForTeamA(cornerTeamA);
        displayCornerForTeamB(cornerTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
    }

}
