package com.example.pharsh.bluetoothchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import com.example.pharsh.bluetoothchat.EventHandlers;

public class MainActivity extends AppCompatActivity {

    static boolean operationResult = false;
    final String failureTextMessage = "Bluetooth is either not found or turned off!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startChatButton = (Button) findViewById(R.id.startChatButton);
        final TextView resultText = (TextView) findViewById(R.id.resultText);

        startChatButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operationResult = EventHandlers.startButtonClickHandler();
                if (!operationResult) {
                    resultText.setText(failureTextMessage);
                    resultText.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
