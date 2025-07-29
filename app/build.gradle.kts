plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.hilt.android)
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.plugin.serialization") version libs.versions.kotlin.get() // Add serialization plugin
}

android {
    namespace = "com.example.sleepeasy"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.sleepeasy"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(Dependecies.coreKtx)
    implementation(Dependecies.lifecycleRuntimeKtx)
    implementation(Dependecies.activityCompose)
    implementation(platform(Dependecies.composeBom))
    implementation(Dependecies.ui)
    implementation(Dependecies.uiGraphics)
    implementation(Dependecies.uiToolingPreview)
    implementation(Dependecies.material3)
    implementation(Dependecies.hiltAndroid)
    implementation(Dependecies.hiltNavigationCompose)
    implementation(Dependecies.navigationCompose)
    implementation(Dependecies.vicoCompose)
    implementation(Dependecies.vicoCore)
    implementation(Dependecies.vicoViews)
    kapt(Dependecies.hiltAndroidCompiler)
    testImplementation(Dependecies.junit)
    androidTestImplementation(Dependecies.androidxJunit)
    androidTestImplementation(Dependecies.espressoCore)
    androidTestImplementation(platform(Dependecies.composeBom))
    androidTestImplementation(Dependecies.uiTestJunit4)
    debugImplementation(Dependecies.uiTooling)
    debugImplementation(Dependecies.uiTestManifest)
    implementation(Dependecies.serializationJson)
}

kapt {
    correctErrorTypes = true
}
