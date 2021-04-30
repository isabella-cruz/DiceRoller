package com.isabella.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//      Finding my View efficiently with lateinit initialization
        diceImage = findViewById(R.id.dice_image)

//        Getting reference to the button and assing it to an immutable variable called rollButton
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
//        Write have the rollDice method to get a random number between 1 and 6
        val randomInt = Random.nextInt(6) + 1
//       Choose the right drawable resource based on the value of randomInt
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
//        Finally, assign the drawableResource from above to diceImage
        diceImage.setImageResource(drawableResource)
    }
}