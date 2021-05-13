package com.example.darkmatter

import com.badlogic.gdx.Game
import com.example.darkmatter.FirstScreen

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class DarkMatter : Game() {
    override fun create() {
        setScreen(FirstScreen())
    }
}