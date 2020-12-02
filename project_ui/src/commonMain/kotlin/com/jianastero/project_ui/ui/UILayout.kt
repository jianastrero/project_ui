package com.jianastero.project_ui.ui

import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.graphics.Theme
import com.jianastero.project_ui.vector.Box

open class UILayout(
    theme: Theme = Theme(),
    background: Background? = null,
    margin: Box = Box(0f),
    padding: Box = Box(0f),
    var children: MutableList<UI> = mutableListOf()
) : UI(theme, background, margin, padding) {

    fun Text(
        text: String = "",
        textSize: Float = 16f,
        textColor: Color? = null,
        theme: Theme = Theme(),
        background: Background? = null,
        margin: Box = Box(0f),
        padding: Box = Box(0f),
        block: Text.() -> Unit = { }
    ): Text = com.jianastero.project_ui.ui.Text(text, textSize, textColor, theme, background, margin, padding)
        .apply(block)
        .also {
            children.add(it)
        }

}