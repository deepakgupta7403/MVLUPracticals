package `in`.locate365.mvlucollege.four.two

import android.content.Context
import android.content.SharedPreferences


open class SharedPref(context: Context) {
    var pref: SharedPreferences
    var editor: SharedPreferences.Editor
    private var _context: Context
    private var PRIVATE_MODE = 0

    // Init Block
    init {
        _context = context
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
    }

    val firstName: String?
        get() = pref.getString(KEY_FIRST_NAME, "")
    val lastName: String?
        get() = pref.getString(KEY_LAST_NAME, "")

    fun clear() {
        editor.putString(KEY_FIRST_NAME, null)
        editor.putString(KEY_LAST_NAME, null)
        editor.commit()
    }

    fun putBoolean(key: String?, value: Boolean) {
        editor.putBoolean(key, value)
        editor.commit()
    }

    fun getBoolean(key: String?): Boolean {
        return pref.getBoolean(key, false)
    }

    fun putString(key: String?, value: String?) {
        editor.putString(key, value)
        editor.commit()
    }

    fun getString(key: String?): String? {
        return pref.getString(key, null)
    }

    fun putLong(key: String?, value: Long) {
        editor.putLong(key, value)
        editor.commit()
    }

    fun getLong(key: String?): Long {
        return pref.getLong(key, 0)
    }

    fun putInt(key: String?, value: Int) {
        editor.putInt(key, value)
        editor.commit()
    }

    fun getInt(key: String?): Int {
        return pref.getInt(key, 0)
    }

    companion object {
        private const val PREF_NAME = "mvluCollege"
        const val KEY_FIRST_NAME = "firstName"
        const val KEY_LAST_NAME = "lastName"
    }
}