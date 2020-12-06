package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Direction
import com.jianastero.project_ui.enumeration.Gravity
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box
import com.jianastero.project_ui.ui.Text as PUIText
import com.jianastero.project_ui.ui.AdapterList as PUIAdapterList

open class UILayout(
    theme: Theme = DEFAULT_THEME,
    background: Background? = DEFAULT_BACKGROUND,
    gravity: Gravity = Gravity.DEFAULT_GRAVITY,
    margin: Box = DEFAULT_MARGIN,
    padding: Box = DEFAULT_PADDING,
    var children: MutableList<UI> = DEFAULT_CHILDREN
) : UI(theme, background, gravity, margin, padding) {

    companion object {

        val DEFAULT_CHILDREN: MutableList<UI>
            get() = mutableListOf()

    }

    fun Text(
        text: String = PUIText.DEFAULT_TEXT,
        textSize: Float = PUIText.DEFAULT_TEXT_SIZE,
        textColor: Color? = PUIText.DEFAULT_TEXT_COLOR,
        theme: Theme = DEFAULT_THEME,
        background: Background? = DEFAULT_BACKGROUND,
        gravity: Gravity = Gravity.DEFAULT_GRAVITY,
        margin: Box = DEFAULT_MARGIN,
        padding: Box = DEFAULT_PADDING,
        block: PUIText.() -> Unit = { }
    ): PUIText = PUIText(text, textSize, textColor, theme, background, gravity, margin, padding)
        .apply(block)
        .also {
            children.add(it)
        }

    fun <T> AdapterList(
        items: MutableList<T>,
        direction: Direction = Direction.DEFAULT_DIRECTION,
        theme: Theme = DEFAULT_THEME,
        background: Background? = DEFAULT_BACKGROUND,
        gravity: Gravity = Gravity.DEFAULT_GRAVITY,
        margin: Box = DEFAULT_MARGIN,
        padding: Box = DEFAULT_PADDING,
        block: PUIAdapterList<T>.() -> Unit = { }
    ): PUIAdapterList<T> = PUIAdapterList(items, direction, theme, background, gravity, margin, padding)
        .apply(block)
        .also {
            children.add(it)
        }
}