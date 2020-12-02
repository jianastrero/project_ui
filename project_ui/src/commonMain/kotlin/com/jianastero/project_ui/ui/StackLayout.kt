package com.jianastero.project_ui.ui

import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box

class StackLayout(
    var direction: Direction = Direction.VERTICAL,
    theme: Theme = Theme(),
    background: Background? = null,
    margin: Box = Box(0f),
    padding: Box = Box(0f),
    children: MutableList<UI> = mutableListOf()
) : UILayout(theme, background, margin, padding, children) {

    enum class Direction {
        HORIZONTAL,
        VERTICAL
    }
}