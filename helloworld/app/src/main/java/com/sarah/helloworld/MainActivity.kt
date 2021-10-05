package com.sarah.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttontap = findViewById<Button>(R.id.buttontap)

        buttontap.setOnClickListener{
            tapdong()
        }
    }

    private fun tapdong() {
        textViewHello.text = "Hello yang ada di sana!"
        val textViewHello = findViewById<TextView>(R.id.textViewHello)
    }


}
