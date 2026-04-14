package com.example.laba_3

// commonMain/.../Platform.kt
interface Platform {
    val name: String
}

expect fun getPlatform(): Platform