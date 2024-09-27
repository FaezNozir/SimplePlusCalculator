package com.kridentia.simplepluscalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.kridentia.documentautocapture.EventHandler;
import com.kridentia.documentautocapture.MyEventCallback;
import com.kridentia.mysimplewordlibrary.HelloWorld;
import com.kridentia.mysimplemathlibrary.SimpleMath;

public class MainActivity extends AppCompatActivity implements MyEventCallback {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EventHandler eventHandler = new EventHandler(this);
        eventHandler.triggerEvent();

        String ab = "Test";
        String ba = "Hello From Android Library";

        //Test Basic String from library
        HelloWorld.printLog(ab, ba);
        TextView textView1 = findViewById(R.id.resultTextView1);
        textView1.setText(HelloWorld.result);

        //Test Basic Calculation from library
        int a = 6;
        int b = 1;
        int result = SimpleMath.add(a, b);
        TextView textView2 = findViewById(R.id.resultTextView2);
        textView2.setText(a + " + " + b + " = " + result);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onEventTriggered(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}