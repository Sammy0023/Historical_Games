package com.steven.historicalgames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.steven.historicalgames.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val anim1 = AnimationUtils.loadAnimation(this, R.anim.anim)

        binding.gamesTextView.startAnimation(anim1)
        anim1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@MainActivity, GamesActivity::class.java))
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {
                Toast.makeText(this@MainActivity, "repeat", Toast.LENGTH_SHORT).show()
            }

        })

        window.statusBarColor = resources.getColor(R.color.milk);



    }
}