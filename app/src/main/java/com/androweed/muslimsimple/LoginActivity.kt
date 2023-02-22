package com.androweed.muslimsimple

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androweed.muslimsimple.databinding.ActivityLoginBinding
import android.text.Html
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val textView = binding.tvbLoginRegister
        textView.text=Html.fromHtml("<font color=#ADADAD>Doesn't have an account? </font>" + "<font color=#2ABA7E>register now</font>" )

        binding.tvbLoginRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}