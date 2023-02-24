package net.deechael.gedlauncher.locales

import net.deechael.gedlauncher.api.Locale
import net.deechael.gedlauncher.api.SupportedLocale

abstract class LocaleBase : Locale {

    abstract val welcome: String
    abstract val buttonHome: String
    abstract val buttonDownload: String
    abstract val buttonSettings: String
    abstract val buttonStartGame: String

    override fun lang(key: String): String {
        if (key == "welcome") {
            return this.welcome
        } else if (key == "buttonHome") {
            return this.buttonHome
        } else if (key == "buttonDownload") {
            return this.buttonDownload
        } else if (key == "buttonSettings") {
            return this.buttonSettings
        } else if (key == "buttonStartGame") {
            return this.buttonStartGame
        }
        return "???"
    }

}

class LocaleSimplifiedChinese : LocaleBase() {

    override val welcome: String
        get() = "欢迎"
    override val buttonHome: String
        get() = "主页"
    override val buttonDownload: String
        get() = "下载"
    override val buttonSettings: String
        get() = "设置"
    override val buttonStartGame: String
        get() = "开始游戏"

    override fun type(): SupportedLocale {
        return SupportedLocale.ZH_CN
    }

}

class LocaleAmericanEnglish : LocaleBase() {

    override val welcome: String
        get() = "Welcome"
    override val buttonHome: String
        get() = "Home"
    override val buttonDownload: String
        get() = "Download"
    override val buttonSettings: String
        get() = "Settings"
    override val buttonStartGame: String
        get() = "Start Game"

    override fun type(): SupportedLocale {
        return SupportedLocale.EN_US
    }

}