package com.jianastero.project_ui.extensions

import com.jianastero.project_ui.graphics.Color

fun String.parseColor(): Int {
    if (this[0] == '#') {
        // Use a long to avoid rollovers on #ffXXXXXX
        var color = this.substring(1).toLong(16)
        if (this.length == 7) {
            // Set the alpha value
            color = color or -0x1000000
        } else if (this.length != 9) {
            throw IllegalArgumentException("Unknown color")
        }
        return color.toInt()
    }
    return Color.COLORS[this.toLowerCase()]?.color ?: throw IllegalArgumentException("Unknown color")
}

fun Int.alpha(): Int = this ushr 24

fun Int.red(): Int = this shr 16 and 0xFF

fun Int.green(): Int = this shr 8 and 0xFF

fun Int.blue(): Int = this and 0xFF

fun argb(alpha: Int, red: Int, green: Int, blue: Int): Int = alpha shl 24 or (red shl 16) or (green shl 8) or blue