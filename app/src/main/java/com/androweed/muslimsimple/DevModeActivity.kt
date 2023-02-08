package com.androweed.muslimsimple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.androweed.muslimsimple.databinding.ActivityDevModeBinding

class DevModeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDevModeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDevModeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnHome.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        var textView: TextView

        textView = binding.tvMainDevMode

        textView.setText("This is developer mode main activity view\n" +
                "All activity can be accessed here!!!\n" + "Copyright 2023 Androweed Team")
    }
}