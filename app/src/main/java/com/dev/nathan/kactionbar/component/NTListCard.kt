package com.dev.nathan.kactionbar.component

import android.content.Context
import android.graphics.Typeface
import android.view.Gravity
import android.view.Gravity.CENTER
import android.view.Gravity.CENTER_VERTICAL
import android.view.View
import android.view.ViewManager
import android.widget.TextView
import com.dev.nathan.kactionbar.R
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView

/**
 * Created by natha on 09/03/2018.
 */
fun ViewManager.ntListCard(): NTListCard = ntListCard {}

inline fun ViewManager.ntListCard(init: (@AnkoViewDslMarker NTListCard).() -> Unit): NTListCard =
        ankoView({ ctx: Context -> NTListCard(ctx) }, theme = 0) { init() }

class NTListCard(ctx: Context) : _RelativeLayout(ctx) {

    lateinit var textViewBtn: TextView

    companion object {
        val cardView = 1
        val codigoTextView = 2
        val descricaoTextView = 3
        val photoImageView = 4
        val usuarioTextView = 5
        val dataTextView = 6
        val prioridadeTextView = 7
        val statusImageView = 8
    }


    init {
        id = View.generateViewId()
        isClickable = true
        linearLayout {
            id = cardView
            relativeLayout {
                padding = dip(10)

                imageView {
                    id = statusImageView
                    imageResource = R.drawable.default_24dp

                }.lparams {
                    width = wrapContent
                    height = wrapContent
                    marginStart = dip(16)
                }


                textViewBtn = textView {


                    id = codigoTextView
                    gravity = Gravity.CENTER_VERTICAL
                    text = context.getString(R.string.text_test)
                    setTypeface(typeface, Typeface.BOLD)
                    textSize = 18f
                }.lparams {
                    marginStart = dip(72)
                    marginEnd = dip(16)
                   // rightOf(statusImageView)
                    width = matchParent
                    height = matchParent
                }


            }
        }.lparams {
            width = matchParent
            height = dip(48)
            topMargin = dip(5)
            marginStart = dip(10)
            marginEnd = dip(10)
            bottomMargin = dip(5)

        }
    }
}


