package `in`.locate365.mvlucollege.six.one

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import `in`.locate365.mvlucollege.R


class PracticalSixOne : AppCompatActivity() {
    private lateinit var btnBlank: Button
    lateinit var btnRotate: Button
    lateinit var btnFade: Button
    lateinit var btnMove: Button
    lateinit var btnSlide: Button
    lateinit var btnZoom: Button
    lateinit var btnStop: Button
    lateinit var ivImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_six_one)
        initComponent()
        initClick()
    }

    private fun initComponent() {
        btnBlank = findViewById(R.id.btn_blink)
        btnRotate = findViewById(R.id.btn_rotate)
        btnFade = findViewById(R.id.btn_fade)
        btnMove = findViewById(R.id.btn_move)
        btnSlide = findViewById(R.id.btn_slide)
        btnZoom = findViewById(R.id.btn_zoom)
        btnStop = findViewById(R.id.btn_stop_anim)
        ivImage = findViewById(R.id.iv_image)
    }

    private fun initClick() {
        btnBlank.setOnClickListener{
            val animation : Animation = AnimationUtils.loadAnimation(applicationContext,R.anim.blank_anim)
            ivImage.startAnimation(animation)
        }

        btnRotate.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate_anim)
            ivImage.startAnimation(animation)
        }

        btnFade.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(applicationContext,R.anim.fade_anim)
            ivImage.startAnimation(animation)
        }

        btnMove.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(applicationContext,R.anim.move_anim)
            ivImage.startAnimation(animation)
        }

        btnSlide.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(applicationContext,R.anim.slide_anim)
            ivImage.startAnimation(animation)
        }

        btnZoom.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(applicationContext,R.anim.zoom_anim)
            ivImage.startAnimation(animation)
        }

        btnStop.setOnClickListener{
            ivImage.clearAnimation()
        }
    }
}