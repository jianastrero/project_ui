package com.jianastero.project_ui.enumeration

import android.widget.LinearLayout

internal val Direction.orientation: Int
    get() = when (this) {
        Direction.HORIZONTAL -> LinearLayout.HORIZONTAL
        Direction.VERTICAL -> LinearLayout.VERTICAL
    }