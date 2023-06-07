package com.example.toasts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowToast:Button= findViewById(R.id.btnShowToast)
            btnShowToast.setOnClickListener {
                Toast(this ).apply {
                    duration=Toast.LENGTH_LONG
                    view=layoutInflater.inflate(R.layout.custom_toast,findViewById(R.id.clToast))
                    show()
                }
        }
    }
}