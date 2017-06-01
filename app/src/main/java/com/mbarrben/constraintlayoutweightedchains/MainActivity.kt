package com.mbarrben.constraintlayoutweightedchains

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val leftButton = findViewById(R.id.leftButton)
    val rightButton = findViewById(R.id.rightButton)

    leftButton.setOnClickListener { rightButton.toggleVisibility() }
    rightButton.setOnClickListener { rightButton.toggleVisibility() }
  }

  private fun View.toggleVisibility() {
    visibility = if (visibility == VISIBLE) GONE else VISIBLE
  }
}
