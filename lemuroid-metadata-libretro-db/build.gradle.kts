plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("maven-publish")

}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.hoanghdtv"
            artifactId = "lemuroid-metadata-libretro-db"
//            version = "1.0.0"
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}


dependencies {
    implementation(project(":retrograde-util"))
    implementation(project(":retrograde-app-shared"))

    implementation(deps.libs.androidx.room.runtime)
    implementation(deps.libs.androidx.room.ktx)
    implementation(deps.libs.dagger.core)
    implementation(deps.libs.kotlinxCoroutinesAndroid)

    kapt(deps.libs.androidx.room.compiler)
    kapt(deps.libs.dagger.compiler)
}

android {
    compileSdk = deps.android.compileSdkVersion

    resourcePrefix("libretrodb_")
    kotlinOptions {
        jvmTarget = "17"
    }
    namespace = "com.swordfish.lemuroid.metadata.libretrodb"
}
