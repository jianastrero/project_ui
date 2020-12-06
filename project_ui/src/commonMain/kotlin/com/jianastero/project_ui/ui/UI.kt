package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Gravity
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box

open class UI(
    var theme: Theme = DEFAULT_THEME,
    var background: Background? = DEFAULT_BACKGROUND,
    var gravity: Gravity = Gravity.DEFAULT_GRAVITY,
    var margin: Box = DEFAULT_MARGIN,
    var padding: Box = DEFAULT_PADDING
) {

    companion object {

        val DEFAULT_THEME: Theme
            get() = Theme()
        val DEFAULT_BACKGROUND: Background? = null
        val DEFAULT_MARGIN: Box
            get() = Box(0f)
        val DEFAULT_PADDING: Box
            get() = Box(0f)

    }

}