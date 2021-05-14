package com.example.darkmatter.screen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.example.darkmatter.DarkMatter
import ktx.app.KtxScreen
import ktx.graphics.use
import ktx.log.Logger
import ktx.log.debug
import ktx.log.logger

private val LOG: Logger = logger<FirstScreen>()

class FirstScreen(game: DarkMatter) : DarkMatterScreen(game) {
    private val texture = Texture(Gdx.files.internal("graphics/ship_base.png"))
    private val sprite : Sprite = Sprite(texture)

    override fun show() {
        LOG.debug { "First screen is shown" }
        sprite.setPosition(1f, 1f)
    }

    override fun render(delta: Float) {
        batch.use {
            sprite.draw(it)
        }
    }

    override fun dispose() {
        texture.dispose()
    }
}