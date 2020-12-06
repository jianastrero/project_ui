package com.jianastero.project_ui.ui

import android.widget.RelativeLayout
import com.jianastero.project_ui.enumeration.gravity
import com.jianastero.project_ui.toView

internal fun RelativeLayout.apply(uiLayout: UILayout): RelativeLayout = this.ui(uiLayout) { relativeLayout ->

    uiLayout.children.forEach {
        relativeLayout.addView(it.toView(relativeLayout.context))
    }
    relativeLayout.gravity = uiLayout.gravity.gravity

}