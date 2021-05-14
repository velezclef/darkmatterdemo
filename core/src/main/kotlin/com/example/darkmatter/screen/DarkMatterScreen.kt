package com.example.darkmatter.screen

import com.badlogic.gdx.graphics.g2d.Batch
import com.example.darkmatter.DarkMatter
import ktx.app.KtxScreen

abstract class DarkMatterScreen(val game: DarkMatter,
                                val batch: Batch = game.batch) : KtxScreen