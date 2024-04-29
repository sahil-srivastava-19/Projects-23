package com.example.fitfreekpro

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import java.util.Locale

class CombinedExercise : Fragment(){
    lateinit var timer: CountDownTimer
    lateinit var countdownTimer:TextView
    lateinit var drawer: DrawerLayout
    lateinit var navigationView: NavigationView
    fun startTime(int: Int) {
        Log.d("Check","Call done");
        val time:Int=int*1000
        timer = object : CountDownTimer(time.toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val hours = (millisUntilFinished / 1000) / 3600
                val minutes = ((millisUntilFinished / 1000) % 3600) / 60
                val seconds = (millisUntilFinished / 1000) % 60
                val timeFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds)
                activity?.runOnUiThread {
                    countdownTimer.text = timeFormatted
                }
            }

            override fun onFinish() {
                countdownTimer.text = "00:00:00"
            }
        }.start()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_combined_exercise, container, false)


        val btn1=view.findViewById<Button>(R.id.btn1)

        val btn2=view.findViewById<Button>(R.id.btn2)

        val btn3=view.findViewById<Button>(R.id.btn3)

        val btn4=view.findViewById<Button>(R.id.btn4)

        val btn5=view.findViewById<Button>(R.id.btn5)

        val btn6=view.findViewById<Button>(R.id.btn6)

        val btn7=view.findViewById<Button>(R.id.btn7)

        val btn8=view.findViewById<Button>(R.id.btn8)

        val btn9=view.findViewById<Button>(R.id.btn9)

        val btn10=view.findViewById<Button>(R.id.btn10)

        countdownTimer=view.findViewById(R.id.clockTimer)

        btn1.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn2.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn3.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn4.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn5.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn6.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn7.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn8.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn9.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        btn10.setOnClickListener {
            startTime(60);
            Toast.makeText(context,"Start Your Set After 10 Seconds",Toast.LENGTH_LONG).show()
        }

        return view
    }

}