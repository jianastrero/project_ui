package com.jianastero.project_ui.ui

import android.widget.TextView

internal fun TextView.apply(text: Text): TextView = this.ui(text) { textView ->

    textView.text = text.text
    text.textColor?.let {
        textView.setTextColor(it.color)
    }
    textView.textSize = text.textSize

}