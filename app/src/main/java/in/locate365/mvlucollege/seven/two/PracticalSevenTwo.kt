package `in`.locate365.mvlucollege.seven.two

import android.content.Intent
import android.graphics.Bitmap
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import `in`.locate365.mvlucollege.R


class PracticalSevenTwo : AppCompatActivity() {
    lateinit var ivImage: ImageView
    lateinit var btnCapturePhoto : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_seven_two)
        initComponent()

        btnCapturePhoto.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            // Start the activity with camera_intent, and request pic id
            startActivityForResult(cameraIntent, 100)
        }
    }

    private fun initComponent() {
        ivImage = findViewById(R.id.iv_image)
        btnCapturePhoto = findViewById(R.id.btn_capture_photo)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Match the request 'pic id with requestCode
        if (requestCode == 100) {
            // BitMap is data structure of image file which store the image in memory
            val photo = data!!.extras!!["data"] as Bitmap?
            // Set the image in imageview for display
            ivImage.setImageBitmap(photo)
        }
    }
}