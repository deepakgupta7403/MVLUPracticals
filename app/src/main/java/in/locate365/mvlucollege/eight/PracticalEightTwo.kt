package `in`.locate365.mvlucollege.eight

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import `in`.locate365.mvlucollege.R

class PracticalEightTwo : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    lateinit var btnContextMenu: Button
    lateinit var btnPopupMenu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_eight_two)
        initComponent()
        registerForContextMenu(btnContextMenu)

        btnPopupMenu.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this, it)
            popupMenu.setOnMenuItemClickListener(this)
            popupMenu.inflate(R.menu.menus)
            popupMenu.show()
        }
    }

    private fun initComponent() {
        btnContextMenu = findViewById(R.id.btn_context_menu)
        btnPopupMenu = findViewById(R.id.btn_popup_menu)
    }

    //=================================================== Context Menu Code Only ===============================================================================
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Context Menu")
        menu?.add(0, v!!.id, 0, "Upload")
        menu?.add(0, v!!.id, 0, "Search")
        menu?.add(0, v!!.id, 0, "Share")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.title!! == "Upload") {
            Toast.makeText(this, "Upload Context Menu Click", Toast.LENGTH_SHORT).show()
            return true
        } else if (item.title!! == "Search") {
            Toast.makeText(this, "Search Context Menu Click", Toast.LENGTH_SHORT).show()
            return true
        }

        Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
        return super.onContextItemSelected(item)
    }

    //=================================================== Popup Menu Code Only ===============================================================================

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.search_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.upload_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.copy_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.print_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.share_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.bookmark_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return false
        }
    }

    //=================================================== Option Menu Code Only ===============================================================================

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menus, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.upload_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.copy_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.print_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.share_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.bookmark_item -> {
                Toast.makeText(this, "Selected Item: " + item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return false
        }
    }
}