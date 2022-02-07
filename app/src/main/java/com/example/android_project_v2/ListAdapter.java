package com.example.android_project_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<Lesson> {

    public ListAdapter(Context context, ArrayList<Lesson> lessonArrayList) {
        super(context, R.layout.list_item, lessonArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Lesson lesson = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.text_view_list_item_name);
        TextView lengthTextView = convertView.findViewById(R.id.text_view_list_item_length);
        CheckBox completedCheckBox = convertView.findViewById(R.id.check_box_list_item_completed);

        nameTextView.setText(lesson.getName());
        lengthTextView.setText(lesson.getLength());
        completedCheckBox.setChecked(lesson.isCompleted());

        return convertView;
    }
}
