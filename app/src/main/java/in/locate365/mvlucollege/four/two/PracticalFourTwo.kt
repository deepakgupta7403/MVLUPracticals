package `in`.locate365.mvlucollege.four.two

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import `in`.locate365.mvlucollege.R


class PracticalFourTwo : AppCompatActivity(){
    private lateinit var etFirstName: EditText
    private lateinit var etLastName: EditText
    private lateinit var btnSave: Button
    private lateinit var sharedPref: SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_four_two)
        initComponent()
        onClick()

    }

    override fun onResume() {
        super.onResume()
        etFirstName.setText(sharedPref.firstName)
        etLastName.setText(sharedPref.lastName)
    }

    override fun onPause() {
        super.onPause()
        sharedPref.putString(SharedPref.KEY_FIRST_NAME,etFirstName.text.toString())
        sharedPref.putString(SharedPref.KEY_LAST_NAME,etLastName.text.toString())
    }

    private fun initComponent() {
        etFirstName = findViewById(R.id.et_first_name)
        etLastName = findViewById(R.id.et_last_name)
        btnSave = findViewById(R.id.btn_save)
        sharedPref = SharedPref(this)
    }

    private fun onClick() {
        btnSave.setOnClickListener {
            sharedPref.putString(SharedPref.KEY_FIRST_NAME,etFirstName.text.toString())
            sharedPref.putString(SharedPref.KEY_LAST_NAME,etLastName.text.toString())

            val builder: StringBuilder = StringBuilder("First Name: ")
            builder.append(etFirstName.text.toString()).append("\n")
            builder.append(" Last Name: ")
            builder.append(etLastName.text.toString())
            Toast.makeText(this,builder.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}