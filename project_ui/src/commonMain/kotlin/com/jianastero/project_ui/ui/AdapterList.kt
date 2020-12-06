package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Direction
import com.jianastero.project_ui.enumeration.Direction.Companion.DEFAULT_DIRECTION
import com.jianastero.project_ui.enumeration.Gravity
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box
import com.jianastero.project_ui.vector.LayoutParam

class AdapterList<T>(
    var items: MutableList<T> = mutableListOf(),
    var direction: Direction = DEFAULT_DIRECTION,
    theme: Theme = DEFAULT_THEME,
    background: Background? = DEFAULT_BACKGROUND,
    gravity: Gravity = Gravity.DEFAULT_GRAVITY,
    layoutWidth: LayoutParam = DEFAULT_LAYOUT_WIDTH,
    layoutHeight: LayoutParam = DEFAULT_LAYOUT_HEIGHT,
    margin: Box = DEFAULT_MARGIN,
    padding: Box = DEFAULT_PADDING
) : UI(theme, background, gravity, layoutWidth, layoutHeight, margin, { }, padding) {

    internal var _ui: (T) -> UI = {
        if (it is String) {
            Text(it)
        } else {
            throw IllegalArgumentException("Using default UI for AdapterList requires List items to be String")
        }
    }

    internal var _onItemClick: ((T) -> Unit)? = null

    fun ListItem(
        ui: (T) -> UI = _ui,
        onClick: ((T) -> Unit)? = null
    ) {
        _ui = ui
        _onItemClick = onClick
    }

}