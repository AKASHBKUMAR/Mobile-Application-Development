package com.example.exercise_01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "On Create Called", Toast.LENGTH_SHORT).show();
    }

    protected void onStart() {
        Toast.makeText(getApplicationContext(), "On Start Called ", Toast.LENGTH_SHORT).show();
        super.onStart();
    }
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "On Restart Called", Toast.LENGTH_SHORT).show();
    }
    protected void onResume() {
        Toast.makeText(getApplicationContext(), "On Resume Called", Toast.LENGTH_SHORT).show();
        super.onResume();
    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "On Stop Called", Toast.LENGTH_SHORT).show();
    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "On Pause Called", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "On Destroy Called", Toast.LENGTH_SHORT).show();
    }
}