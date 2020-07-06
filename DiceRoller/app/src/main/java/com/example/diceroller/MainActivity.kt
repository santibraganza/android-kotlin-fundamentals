package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollDiceButton : (Button) = findViewById(R.id.rollDiceButton)
        rollDiceButton.setOnClickListener { onRollDiceButtonClick() }
    }

    fun onRollDiceButtonClick() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_LONG).show()
        val randomInt = (1..6).random()
        val rollDiceTextView : TextView = findViewById(R.id.rollDiceTextView)
        rollDiceTextView.text = randomInt.toString()
        var drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val rollDiceImageView : ImageView = findViewById(R.id.rollDiceImageView)
        rollDiceImageView.setImageResource(drawableResource)
    }

}