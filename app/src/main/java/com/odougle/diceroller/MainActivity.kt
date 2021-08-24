package com.odougle.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.odougle.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val firstDice = Dice(6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        rollingDice()
    }

    private fun rollingDice(){
        binding.rollButton.setOnClickListener {
            val side = firstDice.roll()
            setDiceImage(side)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setDiceImage(side: Int) {
        when(side){
            1 -> {
                binding.diceSideImage.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                binding.diceSideImage.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                binding.diceSideImage.setImageResource(R.drawable.dice_3)
            }
            4 -> {
                binding.diceSideImage.setImageResource(R.drawable.dice_4)
            }
            5 -> {
                binding.diceSideImage.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                binding.diceSideImage.setImageResource(R.drawable.dice_6)
            }
        }
    }


}