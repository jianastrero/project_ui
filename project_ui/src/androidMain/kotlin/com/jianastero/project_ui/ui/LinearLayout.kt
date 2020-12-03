package com.jianastero.project_ui.ui

import android.widget.LinearLayout
import com.jianastero.project_ui.toView

internal fun LinearLayout.apply(stackLayout: StackLayout): LinearLayout = this.ui(stackLayout) { linearLayout ->

    linearLayout.orientation = stackLayout.direction.orientation

    stackLayout.children.forEach {
        linearLayout.addView(it.toView(linearLayout.context))
    }

}

internal val StackLayout.Direction.orientation: Int
    get() = when (this) {
        StackLayout.Direction.HORIZONTAL -> LinearLayout.HORIZONTAL
        StackLayout.Direction.VERTICAL -> LinearLayout.VERTICAL
    }