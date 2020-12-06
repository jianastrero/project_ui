package com.jianastero.project_ui.enumeration

enum class Gravity {
    START,
    TOP,
    TOP_START,
    TOP_END,
    END,
    BOTTOM,
    BOTTOM_START,
    BOTTOM_END,
    CENTER,
    CENTER_START,
    CENTER_END;

    companion object {

        val DEFAULT_GRAVITY = START

    }
}