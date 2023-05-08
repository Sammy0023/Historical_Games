package com.steven.historicalgames.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.steven.historicalgames.R

class SudokuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sudoku)
        window.statusBarColor = resources.getColor(R.color.milk)
    }
}