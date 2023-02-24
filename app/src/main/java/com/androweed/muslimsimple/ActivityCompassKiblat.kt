package com.androweed.muslimsimple

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Toast
import com.androweed.muslimsimple.databinding.ActivityCompassKiblatBinding
import io.github.derysudrajat.compassqibla.CompassQibla

class ActivityCompassKiblat : AppCompatActivity() {

    private lateinit var binding: ActivityCompassKiblatBinding
    private var currentCompassDegree = 0f
    private var currentNeedleDegree = 0f

    private var currentDegree = 0f

    /*private lateinit var compassView: CompassView
    private lateinit var sensorManager: SensorManager
    private lateinit var magnetometer: Sensor
    private lateinit var accelerometer: Sensor*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompassKiblatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*CompassQibla.Builder(this).onPermissionGranted { permission -> Toast.makeText(this, "onPermissionGranted $permission", Toast.LENGTH_SHORT).show()
        }.onPermissionDenied { Toast.makeText(this, "onPermissionDenied", Toast.LENGTH_SHORT).show() }.onGetLocationAddress { address -> binding.tvLokasiUser.text = buildString {
            append(address.locality)
            append(", ")
            append(address.subAdminArea)
            }
        }.onDirectionChangeListener{ qiblaDirection ->
            binding.tvDirectionCompass.text =
                if (qiblaDirection.isFacingQibla) "You're Right Now Facing Qibla"
                else "${qiblaDirection.needleAngle.toInt()}°"

            val rotateCompass = RotateAnimation(
                currentCompassDegree, qiblaDirection.compassAngle, Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF, 0.5f
            ).apply {
                duration = 1000
            }
            currentCompassDegree = qiblaDirection.compassAngle

            binding.icCompass.startAnimation(rotateCompass)

            val rotateNeedle = RotateAnimation(currentNeedleDegree, qiblaDirection.needleAngle, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,0.5f).apply {
                duration = 1000
            }
            currentNeedleDegree = qiblaDirection.needleAngle

            binding.icNeedle.startAnimation(rotateNeedle)

        }.build()*/


        /*// Initialize sensor manager and sensors
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        magnetometer = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        // Initialize compass view
        compassView = findViewById(R.id.compass_view)

        // Set the surface holder callback
        compassView.holder.addCallback(this)*/
    }
}