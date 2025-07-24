sealed class Build {
    open val isMinifyEnabled = false
    open val enableUnitTestCovarege = false
    open val isDebuggable = false
    open val applicationSuffix = ""
    open val versionNameSuffix = ""

    object Debug : Build() {
        override val isDebuggable = true
        override val applicationSuffix = ".debug"
        override val versionNameSuffix = "-DEBUG"
        override val isMinifyEnabled = false
        override val enableUnitTestCovarege = false
    }
    object ReleaseExternalQA : Build() {
        override val isDebuggable = false
        override val applicationSuffix = ".releaseExternalQA"
        override val versionNameSuffix = "-QA"
        override val isMinifyEnabled = false
        override val enableUnitTestCovarege = true
    }
    object Release : Build() {
        override val isDebuggable = false
        override val isMinifyEnabled = true
        override val enableUnitTestCovarege = false
    }
}