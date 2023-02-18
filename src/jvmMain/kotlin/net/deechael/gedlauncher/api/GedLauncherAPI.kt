package net.deechael.gedlauncher.api

import net.deechael.gedlauncher.impl.GedLauncherAPIImpl

interface GedLauncherAPI {

    fun getConfiguration(): GedLauncherConfiguration

}

interface GedLauncherConfiguration {

    fun getTheme(): Themes

}

enum class Themes {

    LATTE, MOCHA

}

object GedLauncher {

    private val api = GedLauncherAPIImpl()

    fun getAPI(): GedLauncherAPI {
        return api
    }

}