plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

android {
    kotlinOptions {
        jvmTarget = "17"
    }
    namespace = "com.swordfish.lemuroid.cores"
}

dependencies {
    implementation(kotlin(deps.libs.kotlin.stdlib))
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.hoanghdtv"
            artifactId = "lemuroid-bundled-cores"
            version = "1.0.0"
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}