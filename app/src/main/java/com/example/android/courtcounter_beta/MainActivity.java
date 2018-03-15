package com.example.android.courtcounter_beta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //        Intent launchResult = new Intent(PlayerNamesActivity.this, MainActivity.class);
        //        launchResult.putExtra(plName1,result);

        final Button send = (Button) findViewById(R.id.submit);
        send.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View view) {

                EditText userInput = (EditText) findViewById(R.id.pl1T1);
                EditText userInput2 = (EditText) findViewById(R.id.pl2T1);
                EditText userInput3 = (EditText) findViewById(R.id.pl3T1);
                EditText userInput4 = (EditText) findViewById(R.id.pl4T1);
                EditText userInput5 = (EditText) findViewById(R.id.pl5T1);
                EditText userInput6 = (EditText) findViewById(R.id.pl1T2);
                EditText userInput7 = (EditText) findViewById(R.id.pl2T2);
                EditText userInput8 = (EditText) findViewById(R.id.pl3T2);
                EditText userInput9 = (EditText) findViewById(R.id.pl4T2);
                EditText userInput10 = (EditText) findViewById(R.id.pl5T2);
                EditText userInput11 = (EditText) findViewById(R.id.teamName1);
                EditText userInput12 = (EditText) findViewById(R.id.teamName2);
                final String plName1T1 = userInput.getText().toString();
                final String plName2T1 = userInput2.getText().toString();
                final String plName3T1 = userInput3.getText().toString();
                final String plName4T1 = userInput4.getText().toString();
                final String plName5T1 = userInput5.getText().toString();
                final String plName1T2 = userInput6.getText().toString();
                final String plName2T2 = userInput7.getText().toString();
                final String plName3T2 = userInput8.getText().toString();
                final String plName4T2 = userInput9.getText().toString();
                final String plName5T2 = userInput10.getText().toString();
                final String teamName1 = userInput11.getText().toString();
                final String teamName2 = userInput12.getText().toString();
                Intent sendMessage = new Intent(MainActivity.this,PlayersNameActivity.class);//sending the data to PlayersNameActivity
                sendMessage.putExtra("user input1", plName1T1);
                sendMessage.putExtra("user input2", plName2T1);
                sendMessage.putExtra("user input3", plName3T1);
                sendMessage.putExtra("user input4", plName4T1);
                sendMessage.putExtra("user input5", plName5T1);
                sendMessage.putExtra("user input6", plName1T2);
                sendMessage.putExtra("user input7", plName2T2);
                sendMessage.putExtra("user input8", plName3T2);
                sendMessage.putExtra("user input9", plName4T2);
                sendMessage.putExtra("user input10", plName5T2);
                sendMessage.putExtra("user input11", teamName1);
                sendMessage.putExtra("user input12", teamName2);
                startActivity(sendMessage);

//                Intent sendMessage2 = new Intent(MainActivity.this,PlayersStats.class);//sending the data to PlayersStats
//                sendMessage.putExtra("user input1", plName1T1);
//                sendMessage.putExtra("user input2", plName2T1);
//                sendMessage.putExtra("user input3", plName3T1);
//                sendMessage.putExtra("user input4", plName4T1);
//                sendMessage.putExtra("user input5", plName5T1);
//                sendMessage.putExtra("user input6", plName1T2);
//                sendMessage.putExtra("user input7", plName2T2);
//                sendMessage.putExtra("user input8", plName3T2);
//                sendMessage.putExtra("user input9`", plName4T2);
//                sendMessage.putExtra("user input10", plName5T2);
//                startActivity(sendMessage2);
            }




        });
    }}





