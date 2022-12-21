package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView

class p2 : AppCompatActivity() {

    private lateinit var tv1:TextView
    private lateinit var spinner3:Spinner
    private lateinit var list:ListView
    private  lateinit var btn4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p2)
        tv1=findViewById(R.id.tv1)
        spinner3=findViewById(R.id.spinner3)
        list=findViewById(R.id.list)
        btn4=findViewById(R.id.btn4)
    }
}