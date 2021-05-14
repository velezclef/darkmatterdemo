package com.example.darkmatter

import com.badlogic.gdx.Application.LOG_DEBUG
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.example.darkmatter.screen.DarkMatterScreen
import com.example.darkmatter.screen.FirstScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.log.Logger
import ktx.log.debug
import ktx.log.logger

private val LOG: Logger = logger<DarkMatter>()

class DarkMatter : KtxGame<DarkMatterScreen>() {
    val batch : Batch by lazy { SpriteBatch() }

    override fun create() {
        LOG.debug { "Create game instance" }
        Gdx.app.logLevel = LOG_DEBUG
        addScreen(FirstScreen(this))
        setScreen<FirstScreen>()
    }
}