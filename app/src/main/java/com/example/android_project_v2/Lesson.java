package com.example.android_project_v2;

public class Lesson {

    private String name, description;
    private int length;
    private boolean isCompleted;
    private int lessonNumber;

    public Lesson(String name, String description, int length, boolean isCompleted, int lessonNumber) {
        this.name = name;
        this.description = description;
        this.length = length;
        this.isCompleted = isCompleted;
        this.lessonNumber = lessonNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }
}
