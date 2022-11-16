package com.example.object_oriented_pj_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_exercise_timer.*
import java.util.Timer
import java.util.jar.Attributes.Name


class ExerciseTimer : AppCompatActivity() {
    lateinit var countdown_timer : CountDownTimer
    var isRunning: Boolean = false;
    var time_in_milli_seconds = 0L;
    lateinit var name: TextView
    lateinit var timer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_timer)
        name = findViewById(R.id.name)
        timer = findViewById(R.id.timer)

        if (intent.getIntExtra("type", 0) == 0){
            val name = "";
            val exercisetime = 0;
            val resttime = 0;

        }else {
            var sets = intent.getSerializableExtra("exercise") as ArrayList<ExerciseList>
            for (set in sets){
                println(set);
            }
            button.setOnClickListener{
                for (set in sets){
                    object: CountDownTimer(set.exerciseTime*1000.toLong(),1000){
                        override fun onTick(millisUntilFinished: Long) {
                            name.setText(set.name)
                            timer.setText("조금만 힘내자!! " + millisUntilFinished / 1000)
                        }

                        override fun onFinish() {
                            name.setText("쉬는 시간")
                            timer.setText("0")
                        }
                    }.start()
                }
            }
        }






    }
}