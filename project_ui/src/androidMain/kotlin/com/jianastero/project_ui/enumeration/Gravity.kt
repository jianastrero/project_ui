package com.jianastero.project_ui.enumeration

import android.view.Gravity as AndroidGravity

internal actual val Gravity.platform: Int
    get() = when(this) {
        Gravity.START -> AndroidGravity.START
        Gravity.TOP -> AndroidGravity.TOP
        Gravity.TOP_START -> AndroidGravity.START or AndroidGravity.TOP
        Gravity.TOP_END -> AndroidGravity.TOP or AndroidGravity.END
        Gravity.END -> AndroidGravity.END
        Gravity.BOTTOM -> AndroidGravity.BOTTOM
        Gravity.BOTTOM_START -> AndroidGravity.BOTTOM or AndroidGravity.START
        Gravity.BOTTOM_END -> AndroidGravity.BOTTOM or AndroidGravity.END
        Gravity.CENTER -> AndroidGravity.CENTER
        Gravity.CENTER_START -> AndroidGravity.CENTER or AndroidGravity.START
        Gravity.CENTER_END -> AndroidGravity.CENTER or AndroidGravity.END
    }