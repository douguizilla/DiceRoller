package com.odougle.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            binding.diceSideText.text = side.toString()
        }
    }


}