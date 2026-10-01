package com.andro.stevanandroid_124140130

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform