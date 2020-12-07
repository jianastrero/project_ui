package com.jianastero.project_ui.ui

import android.graphics.drawable.BitmapDrawable
import android.view.View
import android.view.ViewGroup
import com.jianastero.project_ui.enumeration.platform
import com.jianastrero.kdimens_extensions.dp

internal fun <T : View> T.ui(ui: UI, block: (T) -> Unit = {}): T = this.also(block).apply {
    // TODO("Theme")
    val lp = ViewGroup.MarginLayoutParams(
        ui.layoutWidth._value,
        ui.layoutHeight._value
    )
    ui.margin.let { box ->
        lp.setMargins(box.left.toInt(), box.top.toInt(), box.right.toInt(), box.bottom.toInt())
    }
    ui.padding.let {
        setPadding(it.left.dp.toInt(), it.top.dp.toInt(), it.right.dp.toInt(), it.bottom.dp.toInt())
    }
    ui.background?.let { bg ->
        bg.color?.let { setBackgroundColor(it.color) }
        bg.image?.let { background = BitmapDrawable(context.resources, context.assets.open(it)) }
    }
    foregroundGravity = ui.gravity.platform
    layoutParams = lp
    ui.onClick?.let { onClick ->
        setOnClickListener {
            onClick()
        }
    }
}