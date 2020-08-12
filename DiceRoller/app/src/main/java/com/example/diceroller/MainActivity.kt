package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var _rollDiceImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollDiceButton: (Button) = findViewById(R.id.roll_dice_button)
        rollDiceButton.setOnClickListener { onRollDiceButtonClick() }
    }

    private fun onRollDiceButtonClick() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_LONG).show()
        var drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        this._rollDiceImageView.setImageResource(drawableResource)
    }

}