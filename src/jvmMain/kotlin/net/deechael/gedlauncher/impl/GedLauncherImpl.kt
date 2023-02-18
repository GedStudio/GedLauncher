package net.deechael.gedlauncher.impl

import net.deechael.gedlauncher.api.GedLauncherAPI
import net.deechael.gedlauncher.api.GedLauncherConfiguration
import net.deechael.gedlauncher.api.Themes

class GedLauncherAPIImpl: GedLauncherAPI {

    override fun getConfiguration(): GedLauncherConfiguration {
        return GedLauncherConfigurationImpl()
    }

}

class GedLauncherConfigurationImpl: GedLauncherConfiguration {

    override fun getTheme(): Themes {
        return Themes.MOCHA
    }

}