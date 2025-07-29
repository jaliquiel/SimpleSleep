object Dependecies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Version.coreKtx}" }
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycleRuntimeKtx}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Version.activityCompose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Version.composeBom}" }
    val ui by lazy { "androidx.compose.ui:ui" }
    val uiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val uiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val uiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val uiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val uiTestJunit4 by lazy { "androidx.compose.ui:ui-test-junit4" }
    val material3 by lazy { "androidx.compose.material3:material3" }
    val junit by lazy { "junit:junit:${Version.junit}" }
    val androidxJunit by lazy { "androidx.test.ext:junit:${Version.junitVersion}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Version.espressoCore}" }
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Version.hilt}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Version.hilt}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Version.hiltNavigationCompose}" }
    val serializationJson by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-json:${Version.serializationJson}" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Version.navigationCompose}" }
    val vicoCompose by lazy { "com.patrykandpatrick.vico:compose:${Version.vico}" }
    val vicoCore by lazy { "com.patrykandpatrick.vico:core:${Version.vico}" }
    val vicoViews by lazy { "com.patrykandpatrick.vico:views:${Version.vico}" }

}