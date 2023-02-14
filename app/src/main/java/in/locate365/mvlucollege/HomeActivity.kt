package `in`.locate365.mvlucollege

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import `in`.locate365.mvlucollege.databinding.HomeActivityBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: HomeActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.home_activity)
        binding.button.setOnClickListener {
            Snackbar.make(
                binding.root,
                "Test",
                Snackbar.LENGTH_SHORT
            ).show()
        }
        binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Snackbar.make(binding.root, "TRUE Test", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(binding.root, "FALSE Test", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.rgGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioButton -> Snackbar.make(binding.root, "Test 1", Snackbar.LENGTH_SHORT).show()
                R.id.radioButton2 -> Snackbar.make(binding.root, "Test 2", Snackbar.LENGTH_SHORT).show()
                R.id.radioButton3 -> Snackbar.make(binding.root, "Test 3", Snackbar.LENGTH_SHORT).show()
                else -> print("")
            }
        }
    }
}