package com.redspot.kotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.redspot.kotlinandroid.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catName = findViewById<TextView>(R.id.cat_name_value).setText(CounterSingleton.cat.name)
        val catAge = findViewById<TextView>(R.id.cat_age_value).setText(CounterSingleton.cat.age.toString())
        val catWeight = findViewById<TextView>(R.id.cat_weight_value).setText(CounterSingleton.cat.weight.toString())

        val copyCatName = findViewById<TextView>(R.id.copy_cat_name).setText(CounterSingleton.cat2.name)
        val copyCatAge = findViewById<TextView>(R.id.copy_cat_age).setText(CounterSingleton.cat2.age.toString())
        val copyCatWeight = findViewById<TextView>(R.id.copy_cat_weight).setText(CounterSingleton.cat2.weight.toString())

        val counterButton = findViewById<Button>(R.id.count_button)
        val counterNumber = findViewById<TextView>(R.id.counter_value)
        counterNumber.text = CounterSingleton.counter.toString()

        for (i in 1..6) {
            Log.d(null, "index=" + i)
        }

        for (i in 9 downTo 4 step 2) {
            Log.d(null, "index=" + i)
        }

        counterButton.setOnClickListener {
            CounterSingleton.counter++
            counterNumber.text = CounterSingleton.counter.toString()
        }
    }
}