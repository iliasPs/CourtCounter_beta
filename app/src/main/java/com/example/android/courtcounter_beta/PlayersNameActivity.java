package com.example.android.courtcounter_beta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.courtcounter_beta.R.id.player1_team1;
import static com.example.android.courtcounter_beta.R.id.plus1p;
import static com.example.android.courtcounter_beta.R.id.plus2p;
import static com.example.android.courtcounter_beta.R.id.plus3p;
import static com.example.android.courtcounter_beta.R.id.scoreTeam2;

public class PlayersNameActivity extends AppCompatActivity implements View.OnClickListener{//this implementation allows me to declare buttons massively
    public int counter;
    int scoreTeam1 = 0;
    int foulsTeam1 = 0;
    int assistTeam1 = 0;
    int stealTeam1 = 0;
    int rebTeam1 = 0;
    int player1Team1Points=0;
    int player1Team1Assists=0;
    int player1Team1Fouls=0;
    int player1Team1Reb=0;

    Stats thisGame = new Stats("",0,0,0,0,0,0,0);





//    TextView timer;
//
//    private static final String FORMAT = "%02d:%02d";
//    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_players_name);


        getIntentO();




        //button declarations incoming
        Button plus1p = (Button) findViewById(R.id.plus1p);
        plus1p.setOnClickListener(this);
        Button plus2p = (Button) findViewById(R.id.plus2p);
        plus2p.setOnClickListener(this);
        Button plus3p = (Button) findViewById(R.id.plus3p);
        plus3p.setOnClickListener(this);
        Button plusFoul = (Button) findViewById(R.id.plusFoul);
        plusFoul.setOnClickListener(this);
        Button plusAssist = (Button) findViewById(R.id.plusAssist);
        plusAssist.setOnClickListener(this);
        Button plusReb = (Button) findViewById(R.id.plusReb);
        plusReb.setOnClickListener(this);
        Button plusSteal = (Button) findViewById(R.id.plusSteal);
        plusSteal.setOnClickListener(this);
        Button playersTab = (Button) findViewById(R.id.playersTab);
        playersTab.setOnClickListener(this);
        Button minus1p = (Button) findViewById(R.id.minus1p);
        minus1p.setOnClickListener(this);
        Button minus2p = (Button) findViewById(R.id.minus2p);
        minus2p.setOnClickListener(this);
        Button minus3p = (Button) findViewById(R.id.minus3p);
        minus3p.setOnClickListener(this);
        Button minusFoul = (Button) findViewById(R.id.minusFoul);
        minusFoul.setOnClickListener(this);
        Button minusAssist = (Button) findViewById(R.id.minusAssist);
        minusAssist.setOnClickListener(this);
        Button minusReb = (Button) findViewById(R.id.minusReb);
        minusReb.setOnClickListener(this);
        Button minusSteal = (Button) findViewById(R.id.minusSteal);
        minusSteal.setOnClickListener(this);
        Button player1Team1 = (Button) findViewById(R.id.player1_team1);
        player1Team1.setOnClickListener(this);
        Button player2Team1 = (Button) findViewById(R.id.player2_team1);
        player2Team1.setOnClickListener(this);
        Button player3Team1 = (Button) findViewById(R.id.player3_team1);
        player3Team1.setOnClickListener(this);
        Button player4Team1 = (Button) findViewById(R.id.player4_team1);
        player4Team1.setOnClickListener(this);
        Button player5Team1 = (Button) findViewById(R.id.player5_team1);
        player5Team1.setOnClickListener(this);
        Button player1Team2 = (Button) findViewById(R.id.player1_team2);
        player1Team2.setOnClickListener(this);
        Button player2Team2 = (Button) findViewById(R.id.player2_team2);
        player2Team2.setOnClickListener(this);
        Button player3Team2 = (Button) findViewById(R.id.player3_team2);
        player3Team2.setOnClickListener(this);
        Button player4Team2 = (Button) findViewById(R.id.player4_team2);
        player4Team2.setOnClickListener(this);
        Button player5Team2 = (Button) findViewById(R.id.player5_team2);
        player5Team2.setOnClickListener(this);


//        TextView plus2p = (TextView) findViewById(R.id.plus2p);
//        TextView plus3p = (TextView) findViewById(R.id.plus3p);
//        TextView foulPlus = (TextView) findViewById(R.id.plusFoul);
//        TextView assistPlus = (TextView) findViewById(R.id.plusAssist);
//        TextView rebPlus = (TextView) findViewById(R.id.plusReb);
//        TextView stealPlus = (TextView) findViewById(R.id.plusSteal);
//        TextView addPlayers = (TextView) findViewById(R.id.playersTab);
//        TextView minus1p = (TextView) findViewById(R.id.minus1p);
//        TextView minus2p = (TextView) findViewById(R.id.minus2p);
//        TextView minus3p = (TextView) findViewById(R.id.minus3p);
//        TextView foulMinus = (TextView) findViewById(R.id.minusFoul);
//        TextView assistMinus = (TextView) findViewById(R.id.minusAssist);
//        TextView rebMinus = (TextView) findViewById(R.id.minusReb);
//        TextView stealMinus = (TextView) findViewById(R.id.minusSteal);



    }



    public String getStrings(int number) {


        Button x =(Button) findViewById(number);
        String text=x.getText().toString();
        return text;



    }



    public  class Stats
    {
        private String name;
        private int onePointer = 0;
        private int twoPointer = 0;
        private int threePointer = 0;
        private int foulsCounter = 0;
        private int assistCounter = 0;
        private int stealCounter = 0;
        private int rebCounter = 0;
        public Stats(String name, int onePointer, int twoPointer,
                      int threePointer,  int foulsCounter,int assistCounter, int stealCounter, int rebCounter) {
            this.name = name;
            this.onePointer = onePointer;
            this.twoPointer = twoPointer;
            this.threePointer = threePointer;
            this.foulsCounter = foulsCounter;
            this.assistCounter = assistCounter;
            this.stealCounter = stealCounter;
            this.rebCounter = rebCounter;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;        }
        public int getOnePointer() {
            return onePointer;
        }
        public void setOnePointer(int onePointer) {
            this.onePointer = onePointer + onePointer;
        }

        public int getTwoPointer() {
            return twoPointer;
        }
        public void setTwoPointer(int twoPointer) {
            this.twoPointer = twoPointer;
        }

        public int getThreePointer() {
            return threePointer;
        }
        public void setThreePointer(int threePointer) {
            this.threePointer = threePointer;
        }

        public int getFoulsCounter() {
            return foulsCounter;
        }
        public void setFoulsCounter(int foulsCounter) {
            this.foulsCounter = foulsCounter;
        }
        public int getAssistCounter() {
            return assistCounter;
        }
        public void setAssistCounter(int assistCounter) {
            this.assistCounter = assistCounter;
        }
        public int getStealCounter() {
            return stealCounter;
        }
        public void setStealCounter(int stealCounter) {
            this.stealCounter = stealCounter;
        }
        public int getRebCounter() {
            return rebCounter;
        }
        public void setRebCounter(int rebCounter) {
            this.rebCounter = rebCounter;
        }
    }

//    ArrayList<PlayersNameActivity.Stats> myStats = new ArrayList<PlayersNameActivity.Stats>();
//
//    {
//        myStats.add(new PlayersNameActivity.Stats("kobe", 1, 2, 2, 2, 2, 4, 3, 1, 1, 5));
//    }


//    public void foulsCount1(int number) {
//        TextView score1 = (TextView) findViewById(R.id.scoreTeam1);
//        score1.setText(String.valueOf(scoreTeam1));
//    }
//

        public void getIntentO () {// επαιξε η μεταφορα των data απο το ενα στο αλλο, αλλα θελει λιγη δουλεια ακομη. δεν φερνει ακριβως το user input
            Bundle extras = getIntent().getExtras();
            String pl1Name = extras.getString("user input1");
            Button buttonPl1= (Button) findViewById(R.id.player1_team1);
            buttonPl1.setText(pl1Name);

        Bundle extras2 = getIntent().getExtras();
        String pl2Name = extras2.getString("user input2");
        Button buttonPl2= (Button) findViewById(R.id.player2_team1);
        buttonPl2.setText(pl2Name);

        Bundle extras3 = getIntent().getExtras();
        String pl3Name = extras3.getString("user input3");
        Button buttonPl3= (Button) findViewById(R.id.player3_team1);
        buttonPl3.setText(pl3Name);

        Bundle extras4 = getIntent().getExtras();
        String pl4Name = extras4.getString("user input4");
        Button buttonPl4= (Button) findViewById(R.id.player4_team1);
        buttonPl4.setText(pl4Name);

        Bundle extras5 = getIntent().getExtras();
        String pl5Name = extras5.getString("user input5");
        Button buttonPl5= (Button) findViewById(R.id.player5_team1);
        buttonPl5.setText(pl5Name);

        Bundle extras6 = getIntent().getExtras();
        String pl6Name = extras6.getString("user input6");
        Button buttonPl6= (Button) findViewById(R.id.player1_team2);
        buttonPl6.setText(pl6Name);

        Bundle extras7 = getIntent().getExtras();
        String pl7Name = extras7.getString("user input7");
        Button buttonPl7= (Button) findViewById(R.id.player2_team2);
        buttonPl7.setText(pl7Name);

        Bundle extras8 = getIntent().getExtras();
        String pl8Name = extras8.getString("user input8");
        Button buttonPl8= (Button) findViewById(R.id.player3_team2);
        buttonPl8.setText(pl8Name);

        Bundle extras9 = getIntent().getExtras();
        String pl9Name = extras9.getString("user input9");
        Button buttonPl9 = (Button) findViewById(R.id.player4_team2);
        buttonPl9.setText(pl9Name);

        Bundle extras10 = getIntent().getExtras();
        String pl10Name = extras10.getString("user input10");
        Button buttonPl10= (Button) findViewById(R.id.player5_team2);
        buttonPl10.setText(pl10Name);

        Bundle extras11=getIntent().getExtras();
        String teamName1 = extras11.getString("user input11");
        TextView textViewTeam1Name= (TextView) findViewById(R.id.teamName1) ;
        textViewTeam1Name.setText(teamName1);

        Bundle extras12=getIntent().getExtras();
        String teamName2 = extras12.getString("user input12");
        TextView textViewTeam2Name = (TextView) findViewById(R.id.teamName2);
        textViewTeam2Name.setText(teamName2);





    }

//    public void onClick2(View view){
//
//
//
//
//        switch (view.getId()){
//            case R.id.player1_team1:
////                ((Button) findViewById(R.id.player2_team1)).setEnabled(false);
////                ((Button) findViewById(R.id.player3_team1)).setEnabled(false);
////                ((Button) findViewById(R.id.player4_team1)).setEnabled(false);
////                ((Button) findViewById(R.id.player5_team1)).setEnabled(false);
////                ((Button) findViewById(R.id.player1_team2)).setEnabled(false);
////                ((Button) findViewById(R.id.player2_team2)).setEnabled(false);
////                ((Button) findViewById(R.id.player3_team2)).setEnabled(false);
////                ((Button) findViewById(R.id.player4_team2)).setEnabled(false);
////                ((Button) findViewById(R.id.player5_team2)).setEnabled(false);
//                    switch (view.getId()){
//                        case R.id.plus1p:
//                            scoreTeam1 += 1;
//                            scoreCount1(1);
//                            thisGame.setName(getStrings(player1_team1));
//                            thisGame.setOnePointer(1);
//                            Toast.makeText(view.getContext(), "+1 point " + getStrings(player1_team1), Toast.LENGTH_SHORT).show();
//
//                            break;
//                        case R.id.minus1p:
//                            scoreTeam1 -= 1;
//                            scoreCount1(-1);
//                            Toast.makeText(view.getContext(), "-1 point " , Toast.LENGTH_SHORT).show();
//                            break;
//                        case R.id.plus2p:
//                            scoreTeam1 += 2;
//                            scoreCount1(2);
//                            Toast.makeText(view.getContext(), "+2 points " + teamName1, Toast.LENGTH_SHORT).show();
//                            break;
//                        case R.id.minus2p:
//                            scoreTeam1 -= 2;
//                            scoreCount1(-2);
//                            Toast.makeText(view.getContext(), "-2 points " + teamName1, Toast.LENGTH_SHORT).show();
//                            break;
//        }
//
//
//    }}


    @Override
    public void onClick(View view){
//case flow that determines what happens on each button click
        switch (view.getId()){
            case R.id.player1_team1:
                ((Button) findViewById(R.id.player2_team1)).setEnabled(false);
                ((Button) findViewById(R.id.player3_team1)).setEnabled(false);
                ((Button) findViewById(R.id.player4_team1)).setEnabled(false);
                ((Button) findViewById(R.id.player5_team1)).setEnabled(false);
                ((Button) findViewById(R.id.player1_team2)).setEnabled(false);
                ((Button) findViewById(R.id.player2_team2)).setEnabled(false);
                ((Button) findViewById(R.id.player3_team2)).setEnabled(false);
                ((Button) findViewById(R.id.player4_team2)).setEnabled(false);
                ((Button) findViewById(R.id.player5_team2)).setEnabled(false);


                switch (view.equals()){
            case R.id.plus1p:
                    player1Team1Points+=1;
                    getStrings(player1_team1);
                    Toast.makeText(view.getContext(), "+1 point " + getStrings(player1_team1), Toast.LENGTH_SHORT).show();

            }
//
//
//                switch (view.getId()){
//                    case R.id.plus1p:
//
//                        thisGame.setName(getStrings(player1_team1));
//                        thisGame.setOnePointer(1);
//                        scoreTeam1 += 1;
//                        scoreCount1(1);
//                        Toast.makeText(view.getContext(), "+1 point " + getStrings(player1_team1), Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.minus1p:
//                        scoreTeam1 -= 1;
//                        scoreCount1(-1);
//                        Toast.makeText(view.getContext(), "-1 point " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.plus2p:
//                        scoreTeam1 += 2;
//                        scoreCount1(2);
//                        Toast.makeText(view.getContext(), "+2 points " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.minus2p:
//                        scoreTeam1 -= 2;
//                        scoreCount1(-2);
//                        Toast.makeText(view.getContext(), "-2 points " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.plus3p:
//                        scoreTeam1 += 3;
//                        scoreCount1(3);
//                        Toast.makeText(view.getContext(), "+3 points ", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.minus3p:
//                        scoreTeam1 -= 3;
//                        scoreCount1(3);
//                        Toast.makeText(view.getContext(), "-3 points ", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.plusFoul:
//                        foulsTeam1 += 1;
//                        Toast.makeText(view.getContext(), "+1 foul " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.minusFoul:
//                        foulsTeam1 -=1;
//                        Toast.makeText(view.getContext(), "-1 foul " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.plusAssist:
//                        assistTeam1 +=1;
//                        Toast.makeText(view.getContext(), "+1 assist " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.minusAssist:
//                        assistTeam1 -=1;
//                        Toast.makeText(view.getContext(), "-1 assist " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.plusReb:
//                        rebTeam1 += 1;
//                        Toast.makeText(view.getContext(), "+1 Rebound" + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.minusReb:
//                        rebTeam1 -= 1;
//                        Toast.makeText(view.getContext(), "-1 Rebound" + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.plusSteal:
//                        stealTeam1 += 1;
//                        Toast.makeText(view.getContext(), "+1 Steal " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.minusSteal:
//                        stealTeam1 -= 1;
//                        Toast.makeText(view.getContext(), "-1 Steal " + teamName1, Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.playersTab:
//                        Intent playersIntent = new Intent(PlayersNameActivity.this, MainActivity.class);
//                        Toast.makeText(view.getContext(), "Opening Player Names Tab", Toast.LENGTH_SHORT).show();
//                        startActivity(playersIntent);
//                        break;
//
//
//                }
        }}
    public void scoreCount1(int number) {
        TextView score1 = (TextView) findViewById(R.id.scoreTeam1);
        score1.setText(String.valueOf(scoreTeam1));
    }

    public void scoreCount2(int number) {
        TextView score2 = (TextView) findViewById(scoreTeam2);
        score2.setText(String.valueOf(scoreTeam2));
    }

}

//        button.setOnClickListener(new View.OnClickListener() {
//
//
//            public void onClick(View V) {
//                if (countDownTimer != null) {
//                    countDownTimer.cancel();
//                }
//                countDownTimer = new CountDownTimer(2400000, 1000) {
//                    public void onTick(long millisUntilFinished) {
//                        timer.setText(String.format(FORMAT, TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
//                                TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
//                                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
//
//
//                    }
//
//                    public void onFinish() {
//                        timer.setText("done!");
//
//                    }
//                }.start();
//
//
//            }
//        });