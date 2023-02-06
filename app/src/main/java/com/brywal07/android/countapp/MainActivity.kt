package com.brywal07.android.countapp


import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Count{
            private var count:Int = 0
            fun addCount(){
                count++
            }
            fun getCount():Int{
                return count
            }
        }
        button = findViewById(R.id.button)

        val display = findViewById<View>(R.id.textView) as TextView
        val count = Count()
        button.setOnClickListener {
            count.addCount()
            display.setText(count.getCount().toString())
        }
    }






}