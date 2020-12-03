package com.jianastero.project_ui

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.jianastero.project_ui.ui.*

inline fun <reified T : UI> Activity.setContent(block: T.() -> Unit) {

    val uiRoot: T = when (T::class) {
        Text::class -> {
            (Text() as T).apply(block)
        }
        StackLayout::class -> {
            (StackLayout() as T).apply(block)
        }
        UILayout::class -> {
            (UILayout() as T).apply(block)
        }
        else -> {
            (UI() as T).apply(block)
        }
    }

    val root: View = uiRoot.toView(this)

    setContentView(root)
}

fun <T : View, U : UI> U.toView(context: Context): T = when (this) {
    is Text -> {
        TextView(context).apply(this)
    }
    is StackLayout -> {
        LinearLayout(context).apply(this)
    }
    is UILayout -> {
        RelativeLayout(context).apply(this)
    }
    else -> {
        View(context).ui(this)
    }
} as T