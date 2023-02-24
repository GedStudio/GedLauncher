package net.deechael.gedlauncher.impl

import net.deechael.gedlauncher.api.*
import net.deechael.gedlauncher.locales.LocaleAmericanEnglish

class GedLauncherAPIImpl : GedLauncherAPI {

    override fun getConfiguration(): GedLauncherConfiguration {
        return GedLauncherConfigurationImpl()
    }

}

class GedLauncherConfigurationImpl : GedLauncherConfiguration {

    private var locale: Locale = LocaleAmericanEnglish()

    override fun getTheme(): Themes {
        return Themes.MOCHA
    }

    override fun setLocale(locale: SupportedLocale) {
        TODO("Not yet implemented")
    }

    override fun getLocale(): Locale {
        return this.locale
    }

}