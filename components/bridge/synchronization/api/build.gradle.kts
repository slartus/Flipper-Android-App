plugins {
    id("flipper.lint")
    id("flipper.android-compose")
}

dependencies {
    implementation(projects.components.bridge.dao.api)

    implementation(libs.compose.ui)
}
