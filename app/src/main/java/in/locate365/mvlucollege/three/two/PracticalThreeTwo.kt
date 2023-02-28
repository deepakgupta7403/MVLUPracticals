package `in`.locate365.mvlucollege.three.two

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import `in`.locate365.mvlucollege.R

class PracticalThreeTwo : AppCompatActivity() {

    private lateinit var gvShoppingCart: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practical_three_two)

        gvShoppingCart = findViewById(R.id.gv_shopping_cart)
        val shoppingCartList: ArrayList<ShoppingCart?> = ArrayList()

        shoppingCartList.add(ShoppingCart("Food Cutlery", R.drawable.img1))
        shoppingCartList.add(ShoppingCart("Orange Grinder", R.drawable.img2))
        shoppingCartList.add(ShoppingCart("Avocado", R.drawable.img3))
        shoppingCartList.add(ShoppingCart("Garbage Bag", R.drawable.img4))
        shoppingCartList.add(ShoppingCart("Milk Utensils", R.drawable.img5))
        shoppingCartList.add(ShoppingCart("Lemon Squeezer", R.drawable.img6))
        shoppingCartList.add(ShoppingCart("Pineapple", R.drawable.img7))
        shoppingCartList.add(ShoppingCart("Coconut", R.drawable.img8))

        val adapter = ShoppingCartAdapter(this, shoppingCartList)
        gvShoppingCart.adapter = adapter
    }

}