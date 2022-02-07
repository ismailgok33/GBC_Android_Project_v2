package com.example.android_project_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LessonDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_detail);

        TextView description = findViewById(R.id.textview_lesson_detail);
        TextView length = findViewById(R.id.textview_lesson_length);
    }
}