// Top-level build file where you can add configuration options common to all sub-projects/modules.
import com.android.build.gradle.BaseExtension
buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()

        maven("https://jitpack.io")
    }
    dependencies {
        classpath(deps.plugins.android)
        classpath(deps.plugins.navigationSafeArgs)
        classpath(deps.plugins.kotlinGradlePlugin)
    }
    extra.apply {
        set("buildToolsVersion", deps.android.buildToolsVersion)
        set("minSdkVersion", deps.android.minSdkVersion)
        set("compileSdkVersion", deps.android.compileSdkVersion)
        set("targetSdkVersion", deps.android.targetSdkVersion)
        set("ndkVersion", "27.1.12297006")
        set("kotlinVersion", "2.0.21")
        set("kotlin_version", "2.0.21")
    }
}


plugins {
    id("org.jetbrains.kotlin.jvm") version deps.versions.kotlin
    id("com.github.ben-manes.versions") version "0.51.0"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.4.0"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
    id("com.android.test") version "8.7.1" apply false
    id("org.jetbrains.kotlin.android") version deps.versions.kotlin apply false
    id("com.android.application") version deps.versions.agp apply false
    id("org.jetbrains.kotlin.plugin.compose") version deps.versions.kotlin apply false
//    id("com.facebook.react.rootproject")
//    id("com.google.gms.google-services") version "4.4.4" apply false
}

allprojects {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }

    configurations.all {
        resolutionStrategy {
            force("org.jetbrains.kotlin:kotlin-build-tools-impl:2.0.21")
        }
    }

    configurations.all {
        resolutionStrategy.eachDependency {
            when (requested.group) {
                "com.google.android.gms" -> useVersion(deps.versions.gms)
                "org.jetbrains.kotlin" -> {
                    if (requested.name.startsWith("kotlin-stdlib-jre")) {
                        with(requested) {
                            useTarget("$group:${name.replace("jre", "jdk")}:$version")
                        }
                    }
                    useVersion(deps.versions.kotlin)
                }
            }
        }
    }
}

configurations.all {
    resolutionStrategy {
        force("org.jetbrains.kotlin:kotlin-build-tools-impl:2.0.21")
        force("org.jetbrains.kotlin:kotlin-build-tools-api:2.0.21")
    }
}

subprojects {

    plugins.withId("com.android.library") {
        extensions.configure<com.android.build.gradle.LibraryExtension> {
            compileSdk = deps.android.compileSdkVersion
            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }
        extensions.configure<com.android.build.gradle.LibraryExtension>("android") {
            buildTypes {
                getByName("debug") {
                    isMinifyEnabled = false
                }
            }
        }
    }
    configurations.configureEach {
        resolutionStrategy {
            val kotlinVersion = "2.0.21"
            force(
                "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion",
                "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion",
                "org.jetbrains.kotlin:kotlin-build-tools-impl:$kotlinVersion"
            )
        }
    }

//    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
//        kotlinOptions {
//            jvmTarget = "17"
//        }
//    }
}

