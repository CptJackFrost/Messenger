package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessage extends AppCompatActivity {

    private TextView textViewReceiveMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        textViewReceiveMessage = findViewById(R.id.textViewReceiveMessage);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        textViewReceiveMessage.setText(message);
    }
}
