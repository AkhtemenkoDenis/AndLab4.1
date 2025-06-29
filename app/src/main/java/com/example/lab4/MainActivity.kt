package com.example.lab4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentA, FragmentA())
                .replace(R.id.fragmentB, FragmentB())
                .replace(R.id.fragmentC, FragmentC())
                .replace(R.id.fragmentD, FragmentD())
                .commit()
        }
    }
}
