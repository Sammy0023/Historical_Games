package com.steven.historicalgames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.steven.historicalgames.databinding.ActivityGamesBinding
import com.steven.historicalgames.games.SudokuActivity
import com.steven.historicalgames.games.TetrisActivity
import com.steven.historicalgames.games.WordActivity

class GamesActivity : AppCompatActivity() {
    lateinit var binding: ActivityGamesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstLevel.setOnClickListener{
            startActivity(Intent(this, TetrisActivity::class.java))
        }

        binding.secondLevel.setOnClickListener{
            startActivity(Intent(this, WordActivity::class.java))
        }

        binding.thirdLevel.setOnClickListener{
            startActivity(Intent(this, SudokuActivity::class.java))
        }

        window.statusBarColor = resources.getColor(R.color.milk)
    }
}