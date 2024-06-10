package za.ac.iie.st10452222.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`splash_screenactivity_main.xml`)

        val mport = null
        val import = null
        mport android.annotation.SuppressLint
                import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.widget.Button
                import android.content.Intent
                import com.example.weatherapp.R

        class SplashActivity : AppCompatActivity() {
            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_splash)
                val startButton = findViewById<Button>(R.id.startButton)
                val exitButton = findViewById<Button>(R.id.exitButton)
                startButton.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                exitButton.setOnClickListener {
                    finish()
                }

            }
}