package com.jianastero.android_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jianastero.project_ui.enumeration.Gravity
import com.jianastero.project_ui.enumeration.Layout
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.setContent
import com.jianastero.project_ui.ui.StackLayout
import com.jianastero.project_ui.vector.Box
import com.jianastero.project_ui.vector.LayoutParam

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent<StackLayout> {

            padding = Box(24f)

            Text(
                background = Background(Color.WHITE),
                onClick = {
                      Log.d("JIAN", "Hello World! Clicked")
                },
                text = "Hello World!"
            )

            Button(
                background = Background(color = Color.BLUE),
                gravity = Gravity.CENTER,
                layoutWidth = LayoutParam(Layout.MATCH_PARENT),
                layoutHeight = LayoutParam(240),
                margin = Box(32f),
                onClick = {
                    Log.d("JIAN", "Jian James P. Astrero Clicked")
                },
                padding = Box(8f),
                text = "Jian James P. Astrero",
                textColor = Color.WHITE,
                textSize = 24f
            )

            AdapterList(
                items = Array(100){ "Hello World $it!" }.toMutableList(),
                background = Background(color = Color.CYAN),
                layoutWidth = LayoutParam(Layout.MATCH_PARENT),
                layoutHeight = LayoutParam(Layout.MATCH_PARENT),
                padding = Box(12f, 8f)
            ) {

                ListItem(
                    onClick = {
                        Log.d("JIAN", "clicked: $it")
                    }
                )

            }
        }
    }
}
