@file:Suppress("UnusedImport")

package com.sultanalyami15.ontrip
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView2)
    }

    fun pressbuttonAction(view: View){
        textView.text = "Hello World!"
    }
}