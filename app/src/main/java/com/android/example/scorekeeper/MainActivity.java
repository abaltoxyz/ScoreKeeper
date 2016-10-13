package com.android.example.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int goalsTeamA = 0;
    private int onTargetShotsTeamA = 0;
    private int cornersTeamA = 0;
    private int foulsTeamA = 0;
    private int yellowsTeamA = 0;
    private int redsTeamA = 0;
    private int goalsTeamB = 0;
    private int onTargetShotsTeamB = 0;
    private int cornersTeamB = 0;
    private int foulsTeamB = 0;
    private int yellowsTeamB = 0;
    private int redsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ////////METHODS FOR TEAM A//////////////////////////////////////////////////////////////
    //METHODS FOR DISPLAYING AND ADDING GOALS FOR TEAM A

    private void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalForA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    //METHODS FOR DISPLAYING AND ADDING ON TARGET SHOTS FOR TEAM A

    private void displayOnTargetShotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_onTarget);
        scoreView.setText(String.valueOf(score));
    }

    public void addOnTargetShotForA(View v) {
        onTargetShotsTeamA = onTargetShotsTeamA + 1;
        displayOnTargetShotsForTeamA(onTargetShotsTeamA);
    }

    //METHODS FOR DISPLAYING AND ADDING CORNERS FOR TEAM A

    private void displayCornersForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(score));
    }

    public void addCornerForA(View v) {
        cornersTeamA = cornersTeamA + 1;
        displayCornersForTeamA(cornersTeamA);
    }

    //METHODS FOR DISPLAYING AND ADDING FOULS FOR TEAM A

    private void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void addFoulForA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    //METHODS FOR DISPLAYING AND ADDING YELLOW CARDS FOR TEAM A

    private void displayYellowsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellows);
        scoreView.setText(String.valueOf(score));
    }

    public void addYellowForA(View v) {
        yellowsTeamA = yellowsTeamA + 1;
        displayYellowsForTeamA(yellowsTeamA);
    }

    //METHODS FOR DISPLAYING AND ADDING RED CARDS FOR TEAM A

    private void displayRedsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_reds);
        scoreView.setText(String.valueOf(score));
    }

    public void addRedForA(View v) {
        redsTeamA = redsTeamA + 1;
        displayRedsForTeamA(redsTeamA);
    }

    ////////METHODS FOR TEAM B//////////////////////////////////////////////////////////////
    //METHODS FOR DISPLAYING AND ADDING GOALS FOR TEAM B

    private void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalForB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    //METHODS FOR DISPLAYING AND ADDING ON TARGET SHOTS FOR TEAM B

    private void displayOnTargetShotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_onTarget);
        scoreView.setText(String.valueOf(score));
    }

    public void addOnTargetShotForB(View v) {
        onTargetShotsTeamB = onTargetShotsTeamB + 1;
        displayOnTargetShotsForTeamB(onTargetShotsTeamB);
    }

    //METHODS FOR DISPLAYING AND ADDING CORNERS FOR TEAM B

    private void displayCornersForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(score));
    }

    public void addCornerForB(View v) {
        cornersTeamB = cornersTeamB + 1;
        displayCornersForTeamB(cornersTeamB);
    }

    //METHODS FOR DISPLAYING AND ADDING FOULS FOR TEAM B

    private void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void addFoulForB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    //METHODS FOR DISPLAYING AND ADDING YELLOW CARDS FOR TEAM B

    private void displayYellowsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellows);
        scoreView.setText(String.valueOf(score));
    }

    public void addYellowForB(View v) {
        yellowsTeamB = yellowsTeamB + 1;
        displayYellowsForTeamB(yellowsTeamB);
    }

    //METHODS FOR DISPLAYING AND ADDING RED CARDS FOR TEAM B

    private void displayRedsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_reds);
        scoreView.setText(String.valueOf(score));
    }

    public void addRedForB(View v) {
        redsTeamB = redsTeamB + 1;
        displayRedsForTeamB(redsTeamB);
    }

    //METHOD TO RESET ALL SCORES
    public void resetAll(View v) {
        goalsTeamA = 0;
        onTargetShotsTeamA = 0;
        cornersTeamA = 0;
        foulsTeamA = 0;
        yellowsTeamA = 0;
        redsTeamA = 0;
        goalsTeamB = 0;
        onTargetShotsTeamB = 0;
        cornersTeamB = 0;
        foulsTeamB = 0;
        yellowsTeamB = 0;
        redsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayOnTargetShotsForTeamA(onTargetShotsTeamA);
        displayCornersForTeamA(cornersTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayYellowsForTeamA(yellowsTeamA);
        displayRedsForTeamA(redsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayOnTargetShotsForTeamB(onTargetShotsTeamB);
        displayCornersForTeamB(cornersTeamB);
        displayFoulsForTeamB(foulsTeamB);
        displayYellowsForTeamB(yellowsTeamB);
        displayRedsForTeamB(redsTeamB);
    }
}
