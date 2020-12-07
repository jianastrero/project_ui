package com.jianastero.project_ui.ui

import android.widget.LinearLayout
import com.jianastero.project_ui.enumeration.orientation
import com.jianastero.project_ui.enumeration.platform
import com.jianastero.project_ui.toView

internal fun LinearLayout.apply(stackLayout: StackLayout): LinearLayout = this.ui(stackLayout) { linearLayout ->

    linearLayout.orientation = stackLayout.direction.orientation
    linearLayout.gravity = stackLayout.gravity.platform

    stackLayout.children.forEach {
        linearLayout.addView(it.toView(linearLayout.context))
    }

}