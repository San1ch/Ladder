plugins {
    alias(libs.plugins.custom.kotlin.library)
}

dependencies {
    api(libs.container)
    implementation(libs.coroutines.core)
    implementation(libs.javax.inject)
    testImplementation(libs.junit)
}