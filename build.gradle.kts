plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

// 应用通用库配置
apply(from = "${rootProject.projectDir}/gradles/library.gradle")

android {
    namespace = "com.lzk.core.database"
}

dependencies {
    // Room dependencies
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
}
