plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.gradle.lab.game"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.kts)
    implementation(libs.androidx.appcompat)
    implementation(libs.android.material)
    implementation(libs.androidx.constraintlayout)
    implementation(project(":math:calc"))
    implementation(project(":math:game"))
    
    testImplementation(libs.junit)

    androidTestImplementation(libs.bundles.androidx.tests)
}