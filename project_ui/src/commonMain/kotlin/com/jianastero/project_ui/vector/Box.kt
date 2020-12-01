package com.jianastero.project_ui.vector

class Box(var left: Float, var top: Float, var right: Float, var bottom: Float) {

    constructor(size: Float) : this(size, size, size, size)
    constructor(horizontal: Float, vertical: Float): this(horizontal, vertical, horizontal, vertical)

}