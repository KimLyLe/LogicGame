package com.example.logicgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.logic_game_main.*

class LogicGameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logic_game_main)

        button.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val answerRow1 = editText3.text.toString()
        val answerRow2 = editText4.text.toString()
        val answerRow3 = editText5.text.toString()
        val answerRow4 = editText6.text.toString()

        when {
            answerRow1 == "T" &&
                    answerRow2 == "F" &&
                    answerRow3 == "F" &&
                    answerRow4 == "F"
            -> Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
            else -> Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }
}
