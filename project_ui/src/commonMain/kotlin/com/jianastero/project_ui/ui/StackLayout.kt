package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Direction
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box

class StackLayout(
    var direction: Direction = DEFAULT_DIRECTION,
    theme: Theme = DEFAULT_THEME,
    background: Background? = DEFAULT_BACKGROUND,
    margin: Box = DEFAULT_MARGIN,
    padding: Box = DEFAULT_PADDING,
    children: MutableList<UI> = DEFAULT_CHILDREN
) : UILayout(theme, background, margin, padding, children) {

    companion object {

        val DEFAULT_DIRECTION: Direction = Direction.VERTICAL

    }

}