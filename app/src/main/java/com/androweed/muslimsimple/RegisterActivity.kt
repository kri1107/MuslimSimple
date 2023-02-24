package com.androweed.muslimsimple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Patterns
import android.widget.Toast
import com.androweed.muslimsimple.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        auth = FirebaseAuth.getInstance()

        val textView = binding.tvbRegisterLogin
        textView.text= Html.fromHtml("<font color=#ADADAD>Already have account? </font>" + "<font color=#2ABA7E>login here</font>" )

        binding.tvbRegisterLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassword.text.toString()

            // Validasi Email
            if (email.isEmpty()){
                binding.edtEmail.error = "Please fill the email section"
                binding.edtEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi isi Email
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.edtEmail.error = "Email was not valid"
                binding.edtEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi Password
            if (password.isEmpty()){
                binding.edtPassword.error = "Please fill the password section"
                binding.edtPassword.requestFocus()
                return@setOnClickListener
            }

            //Validasi panjang Password
            if (password.length < 6){
                binding.edtPassword.error = "Password must more than 6 character"
                binding.edtPassword.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email,password)
        }

    }
    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Successfully registered", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,LoginActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this,"${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }

}