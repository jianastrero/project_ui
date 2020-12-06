package com.jianastero.project_ui.ui

import android.graphics.drawable.BitmapDrawable
import android.view.View
import android.view.ViewGroup
import com.jianastero.project_ui.enumeration.gravity
import com.jianastrero.kdimens_extensions.dp

internal fun <T : View> T.ui(ui: UI, block: (T) -> Unit = {}): T = this.also(block).apply {
    // TODO("Theme")
    ui.margin.let { box ->
        layoutParams = ViewGroup.MarginLayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).also {
            it.setMargins(box.left.toInt(), box.top.toInt(), box.right.toInt(), box.bottom.toInt())
        }
    }
    ui.padding.let {
        setPadding(it.left.dp.toInt(), it.top.dp.toInt(), it.right.dp.toInt(), it.bottom.dp.toInt())
    }
    ui.background?.let { bg ->
        bg.color?.let { setBackgroundColor(it.color) }
        bg.image?.let { background = BitmapDrawable(context.resources, context.assets.open(it)) }
    }
    foregroundGravity = ui.gravity.gravity
}