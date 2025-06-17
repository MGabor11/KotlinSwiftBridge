package org.example.kotlinswiftbridge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform