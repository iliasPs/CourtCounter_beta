package com.example.android.courtcounter_beta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PlayersStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_stats);
    }

//    public class Stats
//    {
//        private String name;
//        private int onePointer = 0;
//        private int onePointerMiss = 0;
//        private int twoPointer = 0;
//        private int twoPointerMiss = 0;
//        private int threePointer = 0;
//        private int threePointerMiss = 0;
//        private int foulsCounter = 0;
//        private int assistCounter = 0;
//        private int stealCounter = 0;
//        private int rebCounter = 0;
//        public Stats(String name, int onePointer, int onePointerMiss, int twoPointer,
//                     int twoPointerMiss, int threePointer, int threePointerMiss, int foulsCounter,
//                     int assistCounter, int stealCounter, int rebCounter) {
//            this.name = name;
//            this.onePointer = onePointer;
//            this.onePointerMiss = onePointerMiss;
//            this.twoPointer = twoPointer;
//            this.twoPointerMiss = twoPointerMiss;
//            this.threePointer = threePointer;
//            this.threePointerMiss = threePointerMiss;
//            this.foulsCounter = foulsCounter;
//            this.assistCounter = assistCounter;
//            this.stealCounter = stealCounter;
//            this.rebCounter = rebCounter;
//        }
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//        public int getOnePointer() {
//            return onePointer;
//        }
//        public void setOnePointer(int onePointer) {
//            this.onePointer = onePointer;
//        }
//        public int getOnePointerMiss() {
//            return onePointerMiss;
//        }
//        public void setOnePointerMiss(int onePointerMiss) {
//            this.onePointerMiss = onePointerMiss;
//        }
//        public int getTwoPointer() {
//            return twoPointer;
//        }
//        public void setTwoPointer(int twoPointer) {
//            this.twoPointer = twoPointer;
//        }
//        public int getTwoPointerMiss() {
//            return twoPointerMiss;
//        }
//        public void setTwoPointerMiss(int twoPointerMiss) {
//            this.twoPointerMiss = twoPointerMiss;
//        }
//        public int getThreePointer() {
//            return threePointer;
//        }
//        public void setThreePointer(int threePointer) {
//            this.threePointer = threePointer;
//        }
//        public int getThreePointerMiss() {
//            return threePointerMiss;
//        }
//        public void setThreePointerMiss(int threePointerMiss) {
//            this.threePointerMiss = threePointerMiss;
//        }
//        public int getFoulsCounter() {
//            return foulsCounter;
//        }
//        public void setFoulsCounter(int foulsCounter) {
//            this.foulsCounter = foulsCounter;
//        }
//        public int getAssistCounter() {
//            return assistCounter;
//        }
//        public void setAssistCounter(int assistCounter) {
//            this.assistCounter = assistCounter;
//        }
//        public int getStealCounter() {
//            return stealCounter;
//        }
//        public void setStealCounter(int stealCounter) {
//            this.stealCounter = stealCounter;
//        }
//        public int getRebCounter() {
//            return rebCounter;
//        }
//        public void setRebCounter(int rebCounter) {
//            this.rebCounter = rebCounter;
//        }
//    }
//
//    ArrayList<Stats> myStats = new ArrayList<Stats>();
//
//    {
//        myStats.add(new Stats("kobe", 1, 2, 2, 2, 2, 4, 3, 1, 1, 5));
//    }



    public static class Stats
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


//stats[] statTable = new stats[10];

    //ArrayList<Book> myLibrary = new ArrayList<Book>();
    //myLibrary.add(new Book(1, "Thinking In Java", "English", 4999));

}
