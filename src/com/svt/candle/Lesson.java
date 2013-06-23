package com.svt.candle;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * zakladne udaje hodiny, ktore sa budu zobrazovat
 */

public class Lesson {

	String day = "";
	String from = "";
	String to = "";
	Integer duration = 0;
	String room = "";
	String typeOfSubject = "";
	String subjectName = "";
	String teachers = "";

	// konstruktor pre DataStorageDatabase
	public Lesson(String day, String from, String to, Integer duration,
			String room, String typeOfSubject, String subjectName,
			String teachers) {
			this.day = day;
			this.from = from;
			this.to = to;
			this.duration = duration;
			this.room = room;
			this.typeOfSubject = typeOfSubject;
			this.subjectName = subjectName;
			this.teachers = teachers;
	}

	public View getView(Context context){
		View view = new View(context);
		LayoutInflater inflater = ((Activity)context).getLayoutInflater();
		View lessonLayout = inflater.inflate(R.layout.lesson, null);
		TextView name = (TextView) lessonLayout.findViewById(R.id.lesson_subject_name);
		name.setText(this.subjectName);
		TextView room = (TextView) lessonLayout.findViewById(R.id.lesson_room);
		room.setText(this.room);
		return lessonLayout;
	}
}