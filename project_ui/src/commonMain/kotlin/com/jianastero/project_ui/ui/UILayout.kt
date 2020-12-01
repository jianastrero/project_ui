package com.jianastero.project_ui.ui

open class UILayout(
    var children: MutableList<UI> = mutableListOf()
) : UI() {

    fun Text(text: String, block: Text.() -> Unit): Text {
        val item = Text(text).apply(block)
        children.add(item)
        return item
    }

}