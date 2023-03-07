package `in`.locate365.mvlucollege

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import `in`.locate365.mvlucollege.databinding.HomeActivityBinding
import `in`.locate365.mvlucollege.eight.PracticalEightTwo
import `in`.locate365.mvlucollege.extra.ActivityLifecycle
import `in`.locate365.mvlucollege.five.one.PracticalFiveOne
import `in`.locate365.mvlucollege.five.two.PracticalFiveTwo
import `in`.locate365.mvlucollege.four.one.PracticalFourOne
import `in`.locate365.mvlucollege.four.two.PracticalFourTwo
import `in`.locate365.mvlucollege.seven.one.PracticalSevenOne
import `in`.locate365.mvlucollege.seven.two.PracticalSevenTwo
import `in`.locate365.mvlucollege.six.one.PracticalSixOne
import `in`.locate365.mvlucollege.three.one.PracticalThreeOne
import `in`.locate365.mvlucollege.three.two.PracticalThreeTwo
import `in`.locate365.mvlucollege.two.PracticalTwo


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: HomeActivityBinding
    private var nameClassMap: HashMap<String, Class<*>> = HashMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.home_activity)
        nameClassMap.put("Practical Two", PracticalTwo::class.java)
        nameClassMap.put("Practical Three One", PracticalThreeOne::class.java)
        nameClassMap.put("Practical Three Two", PracticalThreeTwo::class.java)
        nameClassMap.put("Practical Four One", PracticalFourOne::class.java)
        nameClassMap.put("Practical Four Two", PracticalFourTwo::class.java)
        nameClassMap.put("Practical Five One", PracticalFiveOne::class.java)
        nameClassMap.put("Practical Five Two", PracticalFiveTwo::class.java)
        nameClassMap.put("Practical Six One", PracticalSixOne::class.java)
        nameClassMap.put("Practical Seven One", PracticalSevenOne::class.java)
        nameClassMap.put("Practical Seven Two", PracticalSevenTwo::class.java)
        nameClassMap.put("Practical Eight Two", PracticalEightTwo::class.java)
        nameClassMap.put("Activity LifeCycle", ActivityLifecycle::class.java)

        for (key in nameClassMap.entries) {
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(16, 16, 16, 16)
            val btn = Button(this)
            btn.id = key.hashCode()
            btn.text = key.key
            btn.setBackgroundResource(R.color.purple_200)
            binding.llHome.addView(btn, params)
            btn.setOnClickListener {
                val intent = Intent(this, key.value)
                startActivity(intent)
            }
        }
    }
}