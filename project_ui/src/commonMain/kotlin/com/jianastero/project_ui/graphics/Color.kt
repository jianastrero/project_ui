package com.jianastero.project_ui.graphics

import com.jianastero.project_ui.extensions.*

class Color {

    constructor(color: Int) {
        this.color = color
    }

    constructor(alpha: Int, red: Int, green: Int, blue: Int) {
        color = argb(alpha, red, green, blue)
    }

    val red: Int
        get() = color.red()

    val green: Int
        get() = color.green()

    val blue: Int
        get() = color.blue()

    var color: Int = 0
        set(value) {
            field = value
            alpha = value.alpha()
        }

    var alpha: Int = 255
        set(value) {
            field = value
            color = argb(value, color.red(), color.green(), color.blue())
        }

    companion object {

        val BLACK = Color(255, 0, 0, 0)
        val WHITE = Color(255, 255, 255, 255)
        val RED = Color(255, 255, 0, 0)
        val GREEN = Color(255, 0, 255, 0)
        val BLUE = Color(255, 0, 0, 255)
        val YELLOW = Color(255, 255, 255, 0)
        val MAGENTA = Color(255, 255, 0, 255)
        val CYAN = Color(255, 0, 255, 255)

        internal val COLORS = mapOf(
            "black" to BLACK,
            "white" to WHITE,
            "red" to RED,
            "green" to GREEN,
            "blue" to BLUE,
            "yellow" to YELLOW,
            "magenta" to MAGENTA,
            "cyan" to CYAN
        )

    }

}