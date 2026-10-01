package com.andro.stevanandroid_124140130

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "StevanAndroid_124140130",
    ) {
        App()
    }
}