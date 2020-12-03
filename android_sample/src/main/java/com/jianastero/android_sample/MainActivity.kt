package com.jianastero.android_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jianastero.project_ui.graphics.Background
import com.jianastero.project_ui.graphics.Color
import com.jianastero.project_ui.setContent
import com.jianastero.project_ui.ui.StackLayout
import com.jianastero.project_ui.vector.Box

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent<StackLayout> {

            background = Background(image = "img/sample_bg.jpg")
            padding = Box(24f)

            Text(
                text = "Hello World!",
                textColor = Color.WHITE
            )
            Text(
                background = Background(color = Color(100, 255, 255, 0)),
                text = "Jian James P. Astrero",
                textColor = Color.BLACK,
                padding = Box(8f)
            )
        }
    }
}
