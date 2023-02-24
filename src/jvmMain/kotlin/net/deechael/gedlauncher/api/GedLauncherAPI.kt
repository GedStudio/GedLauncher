package net.deechael.gedlauncher.api

import net.deechael.gedlauncher.impl.GedLauncherAPIImpl

interface GedLauncherAPI {

    fun getConfiguration(): GedLauncherConfiguration

}

interface GedLauncherConfiguration {

    fun getTheme(): Themes

    fun setLocale(locale: SupportedLocale)

    fun getLocale(): Locale

}

enum class SupportedLocale {

    ZH_CN, EN_US

}

interface Locale {

    fun type(): SupportedLocale

    fun lang(key: String): String

    companion object {

        fun lang(key: String): String {
            return GedLauncher.getAPI().getConfiguration().getLocale().lang(key)
        }

    }

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