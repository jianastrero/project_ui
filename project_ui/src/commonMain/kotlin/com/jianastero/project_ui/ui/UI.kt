package com.jianastero.project_ui.ui

import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box

open class UI(
    var theme: Theme = Theme(),
    var background: Background? = null,
    var margin: Box = Box(0f),
    var padding: Box = Box(0f)
)