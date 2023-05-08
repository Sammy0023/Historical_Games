package com.steven.historicalgames.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.steven.historicalgames.R

class WordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word)
        window.statusBarColor = resources.getColor(R.color.milk)
    }
}