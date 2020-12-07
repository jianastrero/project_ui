package com.jianastero.project_ui.ui

import android.content.res.ColorStateList
import android.graphics.drawable.BitmapDrawable
import android.widget.Button as ButtonView
import com.jianastero.project_ui.enumeration.platform

internal fun ButtonView.apply(button: Button): ButtonView {
    val background = button.background
    button.background = null

    return this.ui(button) { buttonView ->

        buttonView.text = button.text
        button.textColor?.let {
            buttonView.setTextColor(it.color)
        }
        buttonView.textSize = button.textSize
        buttonView.gravity = button.gravity.platform
        background?.let { bg ->
            bg.color?.let { backgroundTintList = ColorStateList.valueOf(it.color) }
            bg.image?.let { buttonView.background = BitmapDrawable(context.resources, context.assets.open(it)) }
        }
    }
}