package com.jianastero.project_ui.ui

import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box

class Text(
    var text: String = "",
    var textSize: Float = 8f,
    var textColor: Color? = null,
    theme: Theme = Theme(),
    background: Background? = null,
    margin: Box = Box(0f),
    padding: Box = Box(0f)
) : UI(theme, background, margin, padding)