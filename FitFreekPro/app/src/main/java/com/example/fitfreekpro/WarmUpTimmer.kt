package com.example.fitfreekpro

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.util.Locale

class WarmUpTimmer : Fragment() {
    lateinit var timer: CountDownTimer
    lateinit var countdownTimer: TextView

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
        val view=inflater.inflate(R.layout.fragment_warm_up_timmer, container, false)
        val btn=view.findViewById<Button>(R.id.start)
        val text=view.findViewById<EditText>(R.id.txt)
        countdownTimer=view.findViewById(R.id.clockTimer)
        btn.setOnClickListener {
            val a=text.text.toString();
            startTime((a.toInt()*60));
        }
        return view;
    }
}