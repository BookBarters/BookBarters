/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

@file:Suppress("SpellCheckingInspection")

object Versions {
    const val kotlin = "1.4.10"
    const val androidPlugin = "4.2.0-alpha16"
    const val androidMaterial = "1.3.0-alpha03"
    const val constraintLayout = "2.0.4"
    const val jUnit = "4.13.1"
    const val ktor = "1.4.1"
    const val logBack = "1.3.0-alpha5"
    const val kotlinXHtml = "0.7.2"
    const val versionChecker = "0.34.0"
    const val react = "17.0.0-pre.126-kotlin-1.4.10"
    const val koin = "3.0.0-alpha-4"
    const val kermit = "0.1.8"
}

object Dependencies {
    object Common {
        const val test = "test-common"
        const val testAnnotations = "test-annotations-common"

        const val koinCore = "org.koin:koin-core:${Versions.koin}"
        const val kermit = "co.touchlab:kermit:${Versions.kermit}"
    }

    object Android {
        const val androidMaterial =
            "com.google.android.material:material:${Versions.androidMaterial}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        const val koinAndroid = "org.koin:koin-android:${Versions.koin}"
        const val koinAndroidViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"

        const val jUnit = "junit:junit:${Versions.jUnit}"
    }

    object IOS

    object JVM {
        const val testJUnit = "test-junit"

        const val ktorCore = "io.ktor:ktor-server-core:${Versions.ktor}"
        const val ktorNetty = "io.ktor:ktor-server-netty:${Versions.ktor}"
        const val ktorWebSockets = "io.ktor:ktor-websockets:${Versions.ktor}"
        const val ktorSerialization = "io.ktor:ktor-serialization:${Versions.ktor}"
        const val logBack = "ch.qos.logback:logback-classic:${Versions.logBack}"
    }

    object JS {
        const val test = "test-js"

        const val kotlinXHtml = "org.jetbrains.kotlinx:kotlinx-html-js:${Versions.kotlinXHtml}"
        const val kotlinReact = "org.jetbrains:kotlin-react:${Versions.react}"
        const val kotlinReactDom = "org.jetbrains:kotlin-react-dom:${Versions.react}"
    }
}

object ClassPaths {
    const val androidBuildTools = "com.android.tools.build:gradle:${Versions.androidPlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
}

object Modules {
    const val ui = ":ui"
    const val data = ":data"
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val android = "android"
    const val androidLibrary = "com.android.library"
    const val multiplatform = "multiplatform"
    const val platformJvm = "jvm"
    const val serializationPlugin = "plugin.serialization"
    const val js = "js"
    const val versionChecker = "com.github.ben-manes.versions"
}
