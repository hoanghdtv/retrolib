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
            artifactId = "lemuroid-app-ext-play"
            version = "1.0.0"
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

android {
    kotlinOptions {
        jvmTarget = "17"
    }
    namespace = "com.swordfish.lemuroid.ext"
    compileSdk = deps.android.compileSdkVersion

}

dependencies {
    implementation(project(":retrograde-util"))
    implementation(project(":retrograde-app-shared"))

    implementation(deps.libs.retrofit)
    implementation(deps.libs.play.featureDelivery)
    implementation(deps.libs.play.featureDeliveryKtx)
    implementation(deps.libs.play.review)
    implementation(deps.libs.play.reviewKtx)

    implementation(deps.libs.gdrive.apiClient)
    implementation(deps.libs.gdrive.apiClientAndroid)
    implementation(deps.libs.gdrive.apiServicesDrive)
    implementation(deps.libs.play.playServices)
    implementation(deps.libs.play.coroutine)
    implementation(deps.libs.androidx.lifecycle.commonJava8)
    kapt(deps.libs.androidx.lifecycle.processor)

    implementation(deps.libs.androidx.leanback.leanback)
    implementation(deps.libs.androidx.appcompat.constraintLayout)
    implementation(deps.libs.material)

    implementation(deps.libs.dagger.core)

    implementation(deps.libs.kotlinxCoroutinesAndroid)
}
