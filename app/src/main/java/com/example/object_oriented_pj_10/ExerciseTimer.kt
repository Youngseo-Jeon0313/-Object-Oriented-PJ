package com.example.object_oriented_pj_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ExerciseTimer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_timer)

        if (intent.hasExtra("map")){
                val id = intent.getStringExtra("id")
                val exercisetime = intent.getByteExtra("exercise",0)
                val resttime = intent.getByteExtra("rest",0)
        }
    }
}