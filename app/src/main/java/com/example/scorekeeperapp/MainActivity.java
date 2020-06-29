package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private int TeamAScore = 0;
   private int TeamBScore = 0;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

   }

   public void addSixTeamA(View v){
      TeamAScore = TeamAScore + 6;
      displayTeamA(TeamAScore);
   }

   public void addFourTeamA(View v){
      TeamAScore = TeamAScore + 4;
      displayTeamA(TeamAScore);
   }

   public void addThreeTeamA(View v){
      TeamAScore = TeamAScore + 3;
      displayTeamA(TeamAScore);
   }

   public void addTwoTeamA(View v){
      TeamAScore = TeamAScore + 2;
      displayTeamA(TeamAScore);
   }

   public void addOneTeamA(View v){
      TeamAScore = TeamAScore + 1;
      displayTeamA(TeamAScore);
   }

   public void resetTeamA(View v){
      TeamAScore = 0;
      displayTeamA(TeamAScore);
   }

   public void displayTeamA(int score){

      TextView teamAscore = findViewById(R.id.team_A_score);
      teamAscore.setText(String.valueOf(score));

   }

   public void addSixTeamB(View v){
      TeamBScore = TeamBScore + 6;
      displayTeamB(TeamBScore);
   }

   public void addFourTeamB(View v){
      TeamBScore = TeamBScore + 4;
      displayTeamB(TeamBScore);
   }

   public void addThreeTeamB(View v){
      TeamBScore = TeamBScore + 3;
      displayTeamB(TeamBScore);
   }

   public void addTwoTeamB(View v){
      TeamBScore = TeamBScore + 2;
      displayTeamB(TeamBScore);
   }

   public void addOneTeamB(View v){
      TeamBScore = TeamBScore + 1;
      displayTeamB(TeamBScore);
   }

   public void resetTeamB(View v){
      TeamBScore = 0;
      displayTeamB(TeamBScore);
   }

   public void displayTeamB(int score){
      TextView teamBscore = findViewById(R.id.team_B_score);
      teamBscore.setText(String.valueOf(score));
   }

}