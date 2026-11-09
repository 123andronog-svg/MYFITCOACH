package com.example.myfitcoach;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GAMEActivity extends AppCompatActivity {
    private Button[][] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gameactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttons = new Button[3][3];
        buttons[0][0] = findViewById(R.id.btn0);
        buttons[0][1] = findViewById(R.id.btn1);
        buttons[0][2] = findViewById(R.id.btn2);

        buttons[1][0] = findViewById(R.id.btn3);
        buttons[1][1] = findViewById(R.id.btn4);
        buttons[1][2] = findViewById(R.id.btn5);

        buttons[2][0] = findViewById(R.id.btn6);
        buttons[2][1] = findViewById(R.id.btn7);
        buttons[2][2] = findViewById(R.id.btn8);
        for (int i )
    }
}