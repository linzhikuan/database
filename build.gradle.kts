plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

// 应用通用库配置
apply(from = "${rootProject.projectDir}/gradles/library.gradle")

android {
    namespace = "com.lzk.demo.core.database"
}

dependencies {
    // Room dependencies
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
}
