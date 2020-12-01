package com.jianastero.project_ui.vector

import kotlin.math.abs

open class Rectangle(left: Float, top: Float, var right: Float, var bottom: Float): Point(left, top) {

    val width: Float
        get() = abs(right - left)

    val height: Float
        get() = abs(bottom - left)

    var left: Float = left
        set(value) {
            field = value
            x = value
        }

    var top: Float = top
        set(value) {
            field = value
            y = value
        }

    override var x: Float = left
        set(value) {
            field = value
            left = value
        }

    override var y: Float = top
        set(value) {
            field = value
            top = value
        }
}