pluginManagement {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("org.jetbrains.kotlin")) {
                useVersion("2.0.21")
            }
        }
    }
//    includeBuild("../node_modules/@react-native/gradle-plugin")

}
//plugins { id("com.facebook.react.settings") }
//extensions.configure<com.facebook.react.ReactSettingsExtension> {
//    autolinkLibrariesFromCommand()
//}

dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

    }
    versionCatalogs {
        create("libs") {
            version("kotlin", "2.0.21")
        }
    }
}

rootProject.name = "RetroStore"
include(":app")
include(
    ":retrograde-util",
    ":retrograde-app-shared",
    ":lemuroid-touchinput",
//    ":lemuroid-app",
    ":lemuroid-metadata-libretro-db",
//    ":lemuroid-app-ext-free",
    ":lemuroid-app-ext-play",
    ":bundled-cores",
    ":libretrodroid"
//    ":baselineprofile"
)
project(":bundled-cores").projectDir = File("lemuroid-cores/bundled-cores")