package com.jianastero.project_ui.vector

import com.jianastero.project_ui.enumeration.Layout
import com.jianastero.project_ui.enumeration.platform
import com.jianastero.project_ui.extension.platformSize

class LayoutParam() {

    internal var _value: Int = -1

    constructor(layout: Layout): this() {
        _value = layout.platform
    }

    constructor(value: Int): this() {
        _value = value.platformSize.toInt()
    }

}