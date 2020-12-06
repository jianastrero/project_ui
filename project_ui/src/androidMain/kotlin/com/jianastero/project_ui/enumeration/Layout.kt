package com.jianastero.project_ui.enumeration

import android.view.ViewGroup

actual val Layout.platform: Int
    get() = when (this) {
        Layout.WRAP_CONTENT -> ViewGroup.LayoutParams.WRAP_CONTENT
        Layout.MATCH_PARENT -> ViewGroup.LayoutParams.MATCH_PARENT
    }