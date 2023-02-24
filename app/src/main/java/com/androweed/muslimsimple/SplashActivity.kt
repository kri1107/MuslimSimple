package com.androweed.muslimsimple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Animasikan elemen-elemen di layout splash screen
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        iconMuslimSimple.startAnimation(fadeInAnimation)
//        textView.startAnimation(fadeInAnimation)

        Handler().postDelayed({
            startActivity(Intent(this, DevModeActivity::class.java))
            finish()
        }, 3000)
    }
}