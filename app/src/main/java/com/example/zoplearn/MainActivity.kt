package com.example.zoplearn


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate Called")
        setContentView(R.layout.activity_main)
        var name:EditText = findViewById(R.id.name)
        val bt1: Button = findViewById(R.id.bt)


        /*bt1.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(v: View?) {
                Log.d("MainActivity", "Button Clicked")
                val activity2Intent = Intent(applicationContext, Activity2::class.java)
                startActivity(activity2Intent)
            }
        })*/
        bt1.setOnClickListener(View.OnClickListener { v->
            Log.d("MainActivity", "Button Clicked")
            val activity2Intent = Intent(applicationContext, Activity2::class.java)
            activity2Intent.putExtra("name", name.text.toString())
            startActivity(activity2Intent)
        })



    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart Called now")
    }

    override fun onResume(){
        super.onResume()
        Log.d("MainActivity","onResume called")
    }

    override fun onPause(){
        super.onPause()
        Log.d("MainActivity", "onPause called")
    }

    override fun onStop(){
        super.onStop()
        Log.d("MainActivity", "onStop called")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("MainActivity", "onDestroy called")
    }
}