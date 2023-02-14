package `in`.locate365.mvlucollege

import android.os.Bundle
import android.widget.Gallery
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PracticalThreeOne : AppCompatActivity() {

    private lateinit var gallery: Gallery
    private lateinit var adapter: ImageGalleryAdapter
    private lateinit var selectedImage: ImageView

    private var images = intArrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_three_one)

        gallery = findViewById(R.id.gallery_image_slide)
        selectedImage = findViewById(R.id.iv_show)
        adapter = ImageGalleryAdapter(this, images)
        gallery.adapter = adapter

        gallery.setOnItemClickListener { _, _, position, _ ->
            selectedImage.setImageResource(images[position])
        }
    }
}