package com.example.assiment_5_intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Question_One.setOnClickListener {
        val intent= Intent(this@MainActivity, choice1::class.java)
            startActivity(intent)
        }
        Question_Two.setOnClickListener {
            val intent= Intent(this@MainActivity, choice2::class.java)
            startActivity(intent)
        }
        Question_Tree.setOnClickListener {
            val intent= Intent(this@MainActivity, choice3::class.java)
            startActivity(intent)
        }
        Question_Four.setOnClickListener {
            val intent= Intent(this@MainActivity, choice4::class.java)
            startActivity(intent)
        }
    }
}