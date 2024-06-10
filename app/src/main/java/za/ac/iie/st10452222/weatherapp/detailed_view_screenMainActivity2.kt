package za.ac.iie.st10452222.weatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Intent(appCompatActivity: AppCompatActivity, java: Class<MainActivity>) : Intent() {

}

class detailed_view_screenMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen_main2)

        val import = null
        import android.annotation.SuppressLint
                import android.content.Intent
                import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.widget.Button
                import android.widget.TextView

        class DetailedViewActivity<TextView> : AppCompatActivity() {
            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_detailed_view)
                val day = intent.getStringArrayListExtra("day") ?: arrayListOf("Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday")
                val min = intent.getIntegerArrayListExtra("min") ?: arrayListOf(12, 15,18, 16, 13, 10, 10)
                val max = intent.getIntegerArrayListExtra("max") ?: arrayListOf(25, 29, 30, 31, 32, 18, 16)
                val weatherCondition = intent.getStringArrayListExtra("weatherConditions") ?: arrayListOf("Sunny", "Sunny", "Sunny", "Sunny","Sunny", "Raining", "Cold")

                val detailsTextView = findViewById<TextView>(R.id.detailsTextView)
                val averageTextView = findViewById<TextView>(R.id.averageTextView)
                val backButton = findViewById<Button>(R.id.addButton)

                var averageTemperature = 0
                var displayText = ""
                val day
                for (i in day) {
                    val dailyScreenTime = min[i] + max[i]
                    val dailyTemperature = null
                    var averageScreenTime = dailyTemperature
                    val activityNotes = null
                    displayText += "Day: ${day[i]}, Min: ${min[i]} min, Max: ${max[i]} min, Notes: ${activityNotes[i]}\n\n"
                }
                val totalScreenTime = null
                val averageScreenTime = if (day.isNotEmpty()) totalScreenTime / day.size else 0

                detailsTextView.text = displayText
                val averageTemperatrue = ""
                averageTextView.text = "Average temperature for the week: $averageTemperatrue hours/week"

                backButton.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                }

            }
}