package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Gravity
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box
import com.jianastero.project_ui.vector.LayoutParam

class Text(
    var text: String = DEFAULT_TEXT,
    var textSize: Float = DEFAULT_TEXT_SIZE,
    var textColor: Color? = DEFAULT_TEXT_COLOR,
    theme: Theme = DEFAULT_THEME,
    background: Background? = DEFAULT_BACKGROUND,
    gravity: Gravity = Gravity.DEFAULT_GRAVITY,
    layoutWidth: LayoutParam = DEFAULT_LAYOUT_WIDTH,
    layoutHeight: LayoutParam = DEFAULT_LAYOUT_HEIGHT,
    margin: Box = DEFAULT_MARGIN,
    padding: Box = DEFAULT_PADDING
) : UI(theme, background, gravity, layoutWidth, layoutHeight, margin, padding) {

    companion object {

        const val DEFAULT_TEXT: String = ""
        const val DEFAULT_TEXT_SIZE: Float = 16f
        val DEFAULT_TEXT_COLOR: Color? = null

    }

}