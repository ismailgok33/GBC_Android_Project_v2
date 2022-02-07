package com.example.android_project_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LessonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_list);

        Lesson[] lessonArray = {
                new Lesson("Learning HTML and CSS", "descriptionnnnnnnnnnn", 40, false, 1),
                new Lesson("Learning HTMLll and CSSs", "descriptionnnnnnnasdnnnn", 40, false, 2),
                new Lesson("Learning HTMLllll and CSSss", "descriptionnfdsgdfgdnnnnnnnnn", 40, false, 3),
                new Lesson("Learning HTMasdasdaL and CSSssss", "descriptionnnnnnnnnsadasdnn", 40, false, 4)
        };
        ArrayList<Lesson> lessons = new ArrayList<>();

        for(int i = 0; i < lessonArray.length; i++) {
            lessons.add(lessonArray[i]);
        }

        ListView listView = findViewById(R.id.listview_lesson_list);

        ListAdapter listAdapter = new ListAdapter(this, lessons);

        listView.setAdapter(listAdapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(LessonListActivity.this, LessonDetailActivity.class);

                intent.putExtra("name", lessons.get(i).getName());
                intent.putExtra("description", lessons.get(i).getDescription());
                intent.putExtra("length", lessons.get(i).getLength());
                intent.putExtra("number", lessons.get(i).getLessonNumber());
                intent.putExtra("isCompleted", lessons.get(i).isCompleted());

                startActivity(intent);
            }
        });
    }
}