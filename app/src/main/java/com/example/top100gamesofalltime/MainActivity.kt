package com.example.top100gamesofalltime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var android: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // initiate views
        android = findViewById<View>(R.id.androidCheckBox) as CheckBox
        android!!.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.androidCheckBox -> if (android!!.isChecked) Toast.makeText(
                applicationContext, "Android", Toast.LENGTH_LONG
            ).show()
        }
    }
}