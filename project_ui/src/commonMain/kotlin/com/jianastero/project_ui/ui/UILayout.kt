package com.jianastero.project_ui.ui

import com.jianastero.project_ui.enumeration.Direction
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box

open class UILayout(
    theme: Theme = DEFAULT_THEME,
    background: Background? = DEFAULT_BACKGROUND,
    margin: Box = DEFAULT_MARGIN,
    padding: Box = DEFAULT_PADDING,
    var children: MutableList<UI> = DEFAULT_CHILDREN
) : UI(theme, background, margin, padding) {

    companion object {

        val DEFAULT_CHILDREN: MutableList<UI>
            get() = mutableListOf()

    }

    fun Text(
        text: String = Text.DEFAULT_TEXT,
        textSize: Float = Text.DEFAULT_TEXT_SIZE,
        textColor: Color? = Text.DEFAULT_TEXT_COLOR,
        theme: Theme = DEFAULT_THEME,
        background: Background? = DEFAULT_BACKGROUND,
        margin: Box = DEFAULT_MARGIN,
        padding: Box = DEFAULT_PADDING,
        block: Text.() -> Unit = { }
    ): Text = com.jianastero.project_ui.ui.Text(text, textSize, textColor, theme, background, margin, padding)
        .apply(block)
        .also {
            children.add(it)
        }

    fun <T> AdapterList(
        items: MutableList<T>,
        direction: Direction = AdapterList.DEFAULT_DIRECTION,
        theme: Theme = DEFAULT_THEME,
        background: Background? = DEFAULT_BACKGROUND,
        margin: Box = DEFAULT_MARGIN,
        padding: Box = DEFAULT_PADDING,
        block: AdapterList<T>.() -> Unit = { }
    ): AdapterList<T> = com.jianastero.project_ui.ui.AdapterList(items, direction, theme, background, margin, padding)
        .apply(block)
        .also {
            children.add(it)
        }
}