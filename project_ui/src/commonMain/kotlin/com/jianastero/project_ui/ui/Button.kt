package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Gravity
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box
import com.jianastero.project_ui.vector.LayoutParam

class Button(
    text: String = DEFAULT_TEXT,
    textSize: Float = DEFAULT_TEXT_SIZE,
    textColor: Color? = DEFAULT_TEXT_COLOR,
    theme: Theme = DEFAULT_THEME,
    background: Background? = DEFAULT_BACKGROUND,
    gravity: Gravity = Gravity.CENTER,
    layoutWidth: LayoutParam = DEFAULT_LAYOUT_WIDTH,
    layoutHeight: LayoutParam = DEFAULT_LAYOUT_HEIGHT,
    margin: Box = DEFAULT_MARGIN,
    onClick: () -> Unit = { },
    padding: Box = DEFAULT_PADDING
) : Text(text, textSize, textColor, theme, background, gravity, layoutWidth, layoutHeight, margin, onClick, padding)