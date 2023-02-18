package net.deechael.gedlauncher.api

import java.lang.RuntimeException

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

    fun getAPI(): GedLauncherAPI {
        throw RuntimeException("Stub!")
    }

}