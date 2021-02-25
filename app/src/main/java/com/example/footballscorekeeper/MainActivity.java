package com.example.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));
    }

    int first_team_score = 0;
    int first_team_cards_yellow = 0;
    int first_team_cards_red = 0;

    int second_team_score = 0;
    int second_team_cards_yellow = 0;
    int second_team_cards_red = 0;

    public void first_team_goals(View view) {
        first_team_score++;
        displayGoalsForTeamA(first_team_score);
    }

    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.first_team_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void first_team_fouls_yellow(View view) {
        first_team_cards_yellow++;
        displayFoulsForTeamAYellow(first_team_cards_yellow);
    }

    public void displayFoulsForTeamAYellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.First_Team_Cards_Yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void second_team_goals(View view) {
        second_team_score++;
        displayGoalsForTeamB(second_team_score);
    }

    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.second_team_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void second_team_fouls_yellow(View view) {
        second_team_cards_yellow++;
        displayFoulsForTeamBYellow(second_team_cards_yellow);
    }

    public void displayFoulsForTeamBYellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Second_Team_Cards_Yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void second_team_fouls_red(View view) {
        second_team_cards_red++;
        displayFoulsForTeamBRed(second_team_cards_red);
    }


    public void first_team_fouls_red(View view) {
        first_team_cards_red++;
        displayFoulsForTeamARed(first_team_cards_red);
    }

        public void displayFoulsForTeamBRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Second_Team_Cards_Red);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamARed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.First_Team_Cards_Red);
        scoreView.setText(String.valueOf(score));
    }
    public void Reset(View view) {
        first_team_score = 0;
        first_team_cards_yellow = 0;
        first_team_cards_red = 0;

        second_team_score = 0;
        second_team_cards_yellow = 0;
        second_team_cards_red = 0;

        displayGoalsForTeamA(first_team_score);
        displayFoulsForTeamAYellow(first_team_cards_yellow);
        displayFoulsForTeamARed(first_team_cards_red);

        displayGoalsForTeamB(second_team_score);
        displayFoulsForTeamBYellow(second_team_cards_yellow);
        displayFoulsForTeamBRed(second_team_cards_red);

    }

}