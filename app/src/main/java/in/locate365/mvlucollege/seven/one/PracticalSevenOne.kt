package `in`.locate365.mvlucollege.seven.one

import android.media.MediaPlayer
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import `in`.locate365.mvlucollege.R


class PracticalSevenOne : AppCompatActivity() {
    lateinit var btnStop: Button
    lateinit var btnPlay : Button
    lateinit var btnPause: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_seven_one)
        initComponent()
        initClick()
    }

    private fun initComponent() {
        btnStop = findViewById(R.id.btn_stop)
        btnPlay = findViewById(R.id.btn_play)
        btnPause = findViewById(R.id.btn_pause)
    }

    private fun initClick() {
        val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.popeye_the_sailor)

        btnStop.setOnClickListener{
            mediaPlayer.stop()
            mediaPlayer.prepare()
        }

        btnPlay.setOnClickListener{
            mediaPlayer.start()
        }

        btnPause.setOnClickListener{
            mediaPlayer.pause()
        }
    }
}