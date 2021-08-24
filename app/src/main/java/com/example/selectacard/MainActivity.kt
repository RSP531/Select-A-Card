package com.example.selectacard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var cardInteger: TextView
    lateinit var cardSuit: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardSelectButton: Button = findViewById(R.id.select_a_card)

        cardSelectButton.setOnClickListener {
            selectACard()
        }
        cardInteger = findViewById(R.id.card_number)
        cardSuit = findViewById(R.id.card_suit)
    }

    private fun selectACard() {

        val randomInt = Random().nextInt(13) + 1
        val randomSuitInt = Random().nextInt(4)

        val cardNumber: String
        val suit: String

        when (randomSuitInt){
            0 -> suit = "Spades"
            1 -> suit = "Diamonds"
            2 -> suit = "Hearts"
            3 -> suit = "Clubs"
            else -> {
                suit = "invalid"
            }
        }

        when (randomInt){
            1 -> cardNumber = "Ace"
            11 -> cardNumber = "Jack"
            12 -> cardNumber = "Queen"
            13 -> cardNumber = "King"
            else -> {
                cardNumber = randomInt.toString()
            }
        }

        cardInteger.text = cardNumber
        cardSuit.text = suit

    }
}