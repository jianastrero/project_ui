package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Direction
import com.jianastero.project_ui.enumeration.Direction.Companion.DEFAULT_DIRECTION
import com.jianastero.project_ui.enumeration.Gravity
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box
import com.jianastero.project_ui.vector.LayoutParam

class StackLayout(
    var direction: Direction = DEFAULT_DIRECTION,
    theme: Theme = DEFAULT_THEME,
    background: Background? = DEFAULT_BACKGROUND,
    gravity: Gravity = Gravity.DEFAULT_GRAVITY,
    layoutWidth: LayoutParam = DEFAULT_LAYOUT_WIDTH,
    layoutHeight: LayoutParam = DEFAULT_LAYOUT_HEIGHT,
    margin: Box = DEFAULT_MARGIN,
    onClick: () -> Unit = { },
    padding: Box = DEFAULT_PADDING,
    children: MutableList<UI> = DEFAULT_CHILDREN
) : UILayout(theme, background, gravity, layoutWidth, layoutHeight, margin, onClick, padding, children)