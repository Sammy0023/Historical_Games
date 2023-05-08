package com.steven.historicalgames.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.steven.historicalgames.R

class TetrisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tetris)
        window.statusBarColor = resources.getColor(R.color.milk)
    }
}