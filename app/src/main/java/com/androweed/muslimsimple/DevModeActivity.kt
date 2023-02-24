package com.androweed.muslimsimple

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.androweed.muslimsimple.databinding.ActivityDevModeBinding

class DevModeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDevModeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDevModeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.btnCompass.setOnClickListener {
            val intent = Intent(this, ActivityCompassKiblat::class.java)
            startActivity(intent)
        }

        var textView: TextView

        textView = binding.tvMainDevMode

        textView.text = "This is developer mode main activity view\n" +
                "All activity can be accessed here!!!\n" + "Copyright 2023 Androweed Team"


        val locationPermissionRequest = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            when {
                permissions.getOrDefault(Manifest.permission.ACCESS_FINE_LOCATION, false) -> {
                    // Precise location access granted.
                    Toast.makeText(this, "Successfully granted preciese location access", Toast.LENGTH_SHORT).show()
                }
                permissions.getOrDefault(Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
                    // Only approximate location access granted.
                    Toast.makeText(this, "Successfully granted approximate location access", Toast.LENGTH_SHORT).show()
                } else -> {
                // No location access granted.
                Toast.makeText(this, "Permission for Location was denied, please manually allow location for this app for more better of work.", Toast.LENGTH_SHORT).show()
            }
            }
        }

        locationPermissionRequest.launch(arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION))
    }

}