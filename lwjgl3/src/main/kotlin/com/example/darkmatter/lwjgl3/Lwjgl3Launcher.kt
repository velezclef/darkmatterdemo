package com.example.darkmatter.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.example.darkmatter.DarkMatter
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration

    fun main() {
        Lwjgl3Application(DarkMatter(), Lwjgl3ApplicationConfiguration().apply {
            setTitle("Dark Matter Demo")
            setWindowedMode(9*32, 16*32)
            setWindowIcon("libgdx128.png", "libgdx64.png", "libgdx32.png", "libgdx16.png")
        })
    }
