package com.jianastero.project_ui.ui

import android.graphics.drawable.BitmapDrawable
import android.view.View
import com.jianastrero.kdimens_extensions.dp

internal fun <T : View> T.ui(ui: UI, block: (T) -> Unit = {}): T = this.also(block).apply {
    // TODO("Theme")
    // TODO("Margin")
    ui.padding.let {
        setPadding(it.left.dp.toInt(), it.top.dp.toInt(), it.right.dp.toInt(), it.bottom.dp.toInt())
    }
    ui.background?.let { bg ->
        bg.color?.let { setBackgroundColor(it.color) }
        bg.image?.let { background = BitmapDrawable(context.resources, context.assets.open(it)) }
    }
}