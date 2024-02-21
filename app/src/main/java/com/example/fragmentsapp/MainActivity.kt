package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 :Button = findViewById(R.id.btn1)
        val btn2 : Button = findViewById(R.id.btn2)

        btn1.setOnClickListener(){
            val f1 :Fragment = Fragment1()

            val ftrans  :FragmentTransaction = supportFragmentManager.beginTransaction()
            ftrans.replace(R.id.frame1, f1).commit()
        }
        btn2.setOnClickListener(){
            val f2 :Fragment = Fragment2()

            val ftrans  :FragmentTransaction = supportFragmentManager.beginTransaction()
            ftrans.replace(R.id.frame2, f2).commit()
        }
    }
}