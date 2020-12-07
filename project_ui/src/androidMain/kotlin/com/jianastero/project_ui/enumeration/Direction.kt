package com.jianastero.project_ui.enumeration

import android.widget.LinearLayout

internal actual val Direction.platform: Int
    get() = when (this) {
        Direction.HORIZONTAL -> LinearLayout.HORIZONTAL
        Direction.VERTICAL -> LinearLayout.VERTICAL
    }