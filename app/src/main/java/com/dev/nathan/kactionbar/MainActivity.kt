package com.dev.nathan.kactionbar


import android.content.Intent
import android.graphics.*
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.util.TypedValue
import android.view.Gravity
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.imageBitmap
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.setContentView
import android.graphics.BitmapFactory
import android.graphics.Bitmap

import android.graphics.PorterDuffXfermode
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable








class MainActivity : AppCompatActivity() {

    lateinit var ui: MainUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        ui = MainUI()

        ui.setContentView(this)

        ui.ntActionBar.imageView.onClick {


            openUser()
        }

        val bitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.nathan)

        ui.imageViewUser.imageBitmap =  getclip(bitmap )

        //region <! Animação para os elementos da lista !>
        val outValue = TypedValue()
        baseContext.theme.resolveAttribute(android.R.attr.selectableItemBackground, outValue, true)
        ui.ntActionBar.imageView.backgroundResource = outValue.resourceId
        ui.btn1.backgroundResource = outValue.resourceId
        ui.btn2.backgroundResource = outValue.resourceId
        ui.btn3.backgroundResource = outValue.resourceId
        ui.btn4.backgroundResource = outValue.resourceId
        //endregion




        ui.mensageBtn.onClick {


            val intent = Intent(this@MainActivity, PaginaActivity::class.java)
            startActivity(intent)
        }


    }

    private fun openUser() {
        if (!ui.mainDrawer.isDrawerOpen(Gravity.START)) {
            // setFragment(0)

            DrawerView()
            ui.mainDrawer.openDrawer(GravityCompat.START)
        }
    }


    fun getclip(bitmap: Bitmap): Bitmap {
        val output = Bitmap.createBitmap(bitmap.width,
                bitmap.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(output)

        val paint = Paint()
        val rect = Rect(0, 0, bitmap.width, bitmap.height)

        paint.isAntiAlias = true
        canvas.drawARGB(0, 0, 0, 0)
        canvas.drawCircle(bitmap.width.toFloat() / 2, bitmap.height.toFloat()  / 2,
                bitmap.width.toFloat()  / 2, paint)
        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        canvas.drawBitmap(bitmap, rect, rect, paint)
        return output
    }

//    fun getCircle(color: Int) : Bitmap {
//        val square = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888)
//        var canvas = Canvas(square)
//        canvas.drawColor(color)
//        val output = Bitmap.createBitmap(square.width, square.height, Bitmap.Config.ARGB_8888)
//        canvas = Canvas(output)
//        val paint = Paint()
//        val rect = Rect(0, 0, square.width, square.height)
//        paint.isAntiAlias = true
//        canvas.drawARGB(0, 0, 0, 0)
//        canvas.drawCircle((square.width / 2).toFloat(), (square.height / 2).toFloat(), (square.width / 2).toFloat(), paint)
//        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
//        canvas.drawBitmap(square, rect, rect, paint)
//        return output
//    }
}
