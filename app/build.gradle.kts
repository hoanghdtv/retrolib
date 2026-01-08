//project.extra.apply {
//    set("react", mapOf(
//        "enableHermes" to true,
//        "bundleInDebug" to false,  // QUAN TRỌNG
//        "bundleInRelease" to true
//    ))
//}


plugins {
    id("com.android.library")
    id("maven-publish")
//    id("com.facebook.react")
    id("kotlin-android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlinx-serialization")
//    id("androidx.baselineprofile")
    id("org.jetbrains.kotlin.plugin.compose")
//    id("com.google.gms.google-services")
}

/**
 * Set this to true to Run Proguard on Release builds to minify the Java bytecode.
 */
var enableProguardInReleaseBuilds = false

/**
 * The preferred build flavor of JavaScriptCore (JSC)
 *
 * For example, to use the international variant, you can use:
 * `def jscFlavor = io.github.react-native-community:jsc-android-intl:2026004.+`
 *
 * The international variant includes ICU i18n library and necessary data
 * allowing to use e.g. `Date.toLocaleString` and `String.localeCompare` that
 * give correct results when using with locales other than en-US. Note that
 * this variant is about 6MiB larger per architecture than default.
 */
val jscFlavor = "io.github.react-native-community:jsc-android:2026004.+"

android {
    compileSdk = deps.android.compileSdkVersion

    defaultConfig {
//        versionCode = 1
//        versionName = "1.0.0" // Always remember to update Cores Tag!
        minSdk = deps.android.minSdkVersion
        targetSdk = deps.android.targetSdkVersion
    }

    packagingOptions {
        jniLibs {
            // Stripping created some issues with some libretro cores such as ppsspp
            keepDebugSymbols += setOf("*/*/*_libretro_android.so")
            useLegacyPackaging = true
        }
        resources {
            excludes += setOf("META-INF/DEPENDENCIES", "META-INF/library_release.kotlin_module")
        }
    }

    signingConfigs {
//        maybeCreate("debug").apply {
//            storeFile = file("$rootDir/debug.keystore")
//        }
        maybeCreate("debug").apply{
            storeFile = file("debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }

        maybeCreate("release").apply {
            storeFile = file("$rootDir/retroteam.jks")
            keyAlias = "retroteam"
            storePassword = "retroteam"
            keyPassword = "retroteam"
        }
    }
//    tasks.register("installDebug") {
//        dependsOn("installFreeBundleDebug")
//    }

//    buildTypes {
////        getByName("release") {
////            isMinifyEnabled = true
////            signingConfig = signingConfigs["release"]
////            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
////            resValue("string", "lemuroid_name", "Retro Games")
////        }
//        getByName("debug") {
//            isDebuggable = true
//            isMinifyEnabled = false
//            isShrinkResources = false
//            applicationIdSuffix = ""
//            versionNameSuffix = "-DEBUG"
//            resValue("string", "lemuroid_name", "Retro Games")
//        }
//    }

    afterEvaluate {
        publishing {
            publications {
                create<MavenPublication>("release") {
                    from(components["release"])

                    groupId = "com.github.hoanghdtv"
                    artifactId = "retrolib"
                    version = "1.0.2"
                }
            }

            repositories {
                maven {
                    name = "GitHubPackages"
                    url = uri("https://maven.pkg.github.com/hoanghdtv/retrolib")
                    credentials {
                        username = project.findProperty("gpr.user") as String?
                            ?: System.getenv("GITHUB_ACTOR")
                        password = project.findProperty("gpr.key") as String?
                            ?: System.getenv("GITHUB_TOKEN")
                    }
                }
            }
        }
    }

    lint {
        disable += setOf("MissingTranslation", "ExtraTranslation", "EnsureInitializerMetadata")
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = deps.versions.kotlinExtension
    }

    kotlinOptions {
        jvmTarget = "17"
    }
    namespace = "com.github.hoanghdtv.retrolib"
}



dependencies {
//    implementation("com.facebook.react:react-android")
//    implementation("com.facebook.react:hermes-android")
    implementation(project(":retrograde-util"))
    implementation(project(":retrograde-app-shared"))
    implementation(project(":lemuroid-metadata-libretro-db"))
    implementation(project(":lemuroid-touchinput"))
    implementation(project(":lemuroid-app-ext-play"))
    implementation(project(":bundled-cores"))
    implementation(project(":libretrodroid"))

//    implementation(deps.libs.libretrodroid)

    implementation(deps.libs.androidx.navigation.navigationFragment)
    implementation(deps.libs.androidx.navigation.navigationUi)
    implementation(deps.libs.androidx.navigation.compose)
    implementation(deps.libs.material)
    implementation(deps.libs.coil.coil)
    implementation(deps.libs.coil.coilCompose)
    implementation(deps.libs.androidx.appcompat.constraintLayout)
    implementation(deps.libs.androidx.activity.activity)
    implementation(deps.libs.androidx.activity.activityKtx)
    implementation(deps.libs.androidx.activity.compose)
    implementation(deps.libs.androidx.appcompat.appcompat)
    implementation(deps.libs.androidx.preferences.preferencesKtx)
    implementation(deps.libs.arch.work.runtime)
    implementation(deps.libs.arch.work.runtimeKtx)
    implementation(deps.libs.androidx.lifecycle.commonJava8)

    kapt(deps.libs.androidx.lifecycle.processor)

    implementation(deps.libs.androidx.leanback.leanback)
    implementation(deps.libs.androidx.leanback.leanbackPreference)
    implementation(deps.libs.androidx.leanback.leanbackPaging)

    implementation(deps.libs.androidx.appcompat.recyclerView)
    implementation(deps.libs.androidx.paging.common)
    implementation(deps.libs.androidx.paging.runtime)
    implementation(deps.libs.androidx.room.common)
    implementation(deps.libs.androidx.room.runtime)
    implementation(deps.libs.androidx.room.ktx)
    implementation(deps.libs.dagger.android.core)
    implementation(deps.libs.dagger.android.support)
    implementation(deps.libs.dagger.core)
    implementation(deps.libs.kotlinxCoroutinesAndroid)
    implementation(deps.libs.okHttp3)
    implementation(deps.libs.okio)
    implementation(deps.libs.retrofit)
    implementation(deps.libs.flowPreferences)
    implementation(deps.libs.guava)
    implementation(deps.libs.androidx.documentfile)
    implementation(deps.libs.androidx.leanback.tvProvider)
    implementation(deps.libs.harmony)
    implementation(deps.libs.startup)
    implementation(deps.libs.kotlin.serialization)
    implementation(deps.libs.kotlin.serializationJson)

    implementation(platform(deps.libs.androidx.compose.composeBom))
    implementation(deps.libs.androidx.compose.material3)
    implementation(deps.libs.androidx.compose.constraintLayout)
    debugImplementation(deps.libs.androidx.compose.tooling)
    implementation(deps.libs.androidx.compose.toolingPreview)
    implementation(deps.libs.androidx.compose.extendedIcons)
    implementation(deps.libs.androidx.compose.accompanist.systemUiController)
    implementation(deps.libs.androidx.compose.accompanist.navigationMaterial)
    implementation(deps.libs.androidx.compose.accompanist.drawablePainter)
    implementation(deps.libs.androidx.paging.compose)
    implementation(deps.libs.androidx.lifecycle.viewModelCompose)
    implementation(deps.libs.composeHtmlText)

    implementation(deps.libs.composeSettings.uiTiles)
    implementation(deps.libs.composeSettings.uiTilesExtended)
    implementation(deps.libs.composeSettings.diskStorage)
    implementation(deps.libs.composeSettings.memoryStorage)


//    implementation("com.google.android.gms:play-services-ads:22.2.0")
//    // Import the Firebase BoM
//    implementation(platform("com.google.firebase:firebase-bom:34.6.0"))

    // When using the BoM, you don't specify versions in Firebase library dependencies

    // Add the dependency for the Firebase SDK for Google Analytics
//    implementation("com.google.firebase:firebase-analytics")

    // TODO: Add the dependencies for any other Firebase products you want to use
    // See https://firebase.google.com/docs/android/setup#available-libraries
    // For example, add the dependencies for Firebase Authentication and Cloud Firestore
//    implementation("com.google.firebase:firebase-auth")
//    implementation("com.google.firebase:firebase-firestore")

    // Uncomment this when using a local aar file.
    // implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))

    kapt(deps.libs.dagger.android.processor)
    kapt(deps.libs.dagger.compiler)
}

//fun usePlayDynamicFeatures(): Boolean {
//    val task = gradle.startParameter.taskRequests.toString()
//    return task.contains("Play") && task.contains("Dynamic")
////    return true;
//}

afterEvaluate {
    tasks.findByName("bundleDebugJsAndAssets")?.enabled = false
    tasks.findByName("createBundleDebugJsAndAssets")?.enabled = false
}