package com.odougle.diceroller

class Dice(
    private val numSides: Int
) {
    val sides = numSides

    fun roll(): Int {
        return (1..sides).random()
    }
}