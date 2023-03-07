package `in`.locate365.mvlucollege.five.two

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import `in`.locate365.mvlucollege.R


class PracticalFiveTwo : AppCompatActivity() {
    lateinit var btnStartService : Button
    lateinit var btnStopService : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_five_two)
        initComponent()
        initClick()

    }

    private fun initClick() {
        btnStartService.setOnClickListener{
            startService(Intent(this, MusicService::class.java))
        }

        btnStopService.setOnClickListener{
            stopService(Intent(this, MusicService::class.java))
        }
    }

    private fun initComponent() {
        btnStartService = findViewById(R.id.btn_start_service)
        btnStopService = findViewById(R.id.btn_stop_service)
    }
}