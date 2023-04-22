package com.example.activity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    private lateinit var container: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container = findViewById(R.id.container)
    }

    private fun removeLastFragment() {
        val lastFragment = supportFragmentManager.findFragmentById(R.id.container)
        if (lastFragment != null) {
            supportFragmentManager.beginTransaction().remove(lastFragment).commit()
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun onClickFirst(view: View) {
        removeLastFragment()
        val fragment = FirstFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.container, fragment)
            .commit()
    }

    @Suppress("UNUSED_PARAMETER")
    fun onClickSecond(view: View) {
        removeLastFragment()
        val fragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.container, fragment)
            .commit()
    }
}