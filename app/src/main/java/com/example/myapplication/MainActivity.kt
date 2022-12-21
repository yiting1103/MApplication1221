package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    private lateinit var cln: Button
    private lateinit var search: Button
    private lateinit var conversion: Button
    private lateinit var change: Button
    private lateinit var spinner: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var n1: TextView
    private lateinit var n2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        n1 = findViewById(R.id.n1)
        n2 = findViewById(R.id.n2)
        cln = findViewById(R.id.cln)
        cln.setOnClickListener{
            n1.text = ""
            n2.text = ""
        }

        spinner = findViewById(R.id.spinner)
        spinner2 = findViewById(R.id.spinner2)

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.coin,
            android.R.layout.simple_spinner_dropdown_item
        )
        spinner.adapter = adapter
        spinner2.adapter = adapter

        search.setOnClickListener {
       Intent(this,p2::class.java).apply {
      setResult(Activity.RESULT_OK,this)
            }
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //TODO("Not yet implemented")
            }


            override fun onNothingSelected(p0: AdapterView<*>?) {
                //TODO("Not yet implemented")
            }



        }
    }



}

